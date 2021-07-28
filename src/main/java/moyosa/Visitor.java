package moyosa;

import moyosa.MoyosaParser;
import moyosa.MoyosaParserBaseVisitor;

public class Visitor extends MoyosaParserBaseVisitor<Double> {
    @Override
    public Double visitAdditiveExpression(MoyosaParser.AdditiveExpressionContext ctx) {
        var left = Double.valueOf(ctx.left.getText());
        var right = Double.valueOf(ctx.right.getText());
        var op = ctx.op.getText();
        if(op.equals("-")) right = -right;
        return left + right;
    }
}
