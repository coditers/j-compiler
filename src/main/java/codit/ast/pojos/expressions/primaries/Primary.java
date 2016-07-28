package codit.ast.pojos.expressions.primaries;

import codit.ast.AstNode;
import codit.ast.Position;
import codit.ast.Range;

/**
 * @author Jisung Lim <iejisung@gmail.com>
 */
public class Primary extends AstNode { // TODO - implementation


  public Primary(Range range, AstNode parent) {
    super(range, parent);
  }

  public Primary(Position start, Position end, AstNode parent) {
    super(start, end, parent);
  }

  public Primary(int startLine, int startCol, int endLine, int endCol, AstNode parent) {
    super(startLine, startCol, endLine, endCol, parent);
  }
}