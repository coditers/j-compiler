package codit.ast.pojos.expressions.primaries.methodreference;

import codit.ast.AstNode;
import codit.ast.Position;
import codit.ast.Range;
import codit.ast.pojos.expressions.primaries.interfaces.DefaultArrayLfPrimary;
import codit.ast.pojos.expressions.primaries.interfaces.LfnoArrayLfPrimary;
import codit.ast.pojos.types.TypeArguments;

/**
 * @author Jisung Lim <iejisung@gmail.com>
 */
public class PostfixMethodReference extends MethodReference
    implements DefaultArrayLfPrimary, LfnoArrayLfPrimary {

  private final TypeArguments typeArguments;
  private final String identifier;

  public PostfixMethodReference(Range range, AstNode parent,
                                TypeArguments typeArguments,
                                String identifier) {
    super(range, parent);
    this.typeArguments = typeArguments;
    this.identifier = identifier;
  }

  public PostfixMethodReference(Position start, Position end, AstNode parent,
                                TypeArguments typeArguments,
                                String identifier) {
    super(start, end, parent);
    this.typeArguments = typeArguments;
    this.identifier = identifier;
  }

  public PostfixMethodReference(int startLine, int startCol, int endLine, int endCol, AstNode parent,
                                TypeArguments typeArguments,
                                String identifier) {
    super(startLine, startCol, endLine, endCol, parent);
    this.typeArguments = typeArguments;
    this.identifier = identifier;
  }
}