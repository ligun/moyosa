package moyosa;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
    public static void main(String[] args) {
        var stream = CharStreams.fromString("123.4 - 567.8");
        var lexer = new MoyosaLexer(stream);
        var tokens = new CommonTokenStream(lexer);
        var parser = new MoyosaParser(tokens);
        var tree = parser.additiveExpression();
        System.out.println(new Visitor().visit(tree));
    }
}
