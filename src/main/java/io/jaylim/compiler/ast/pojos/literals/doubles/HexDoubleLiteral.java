package io.jaylim.compiler.ast.pojos.literals.doubles;

import io.jaylim.compiler.ast.pojos.AstNode;
import io.jaylim.compiler.ast.pojos.Position;
import io.jaylim.compiler.ast.pojos.Range;

/**
 * @author Jisung Lim <iejisung@gmail.com>
 */
public class HexDoubleLiteral extends DoubleLiteral {

  public HexDoubleLiteral(Range range, AstNode parent, String rawString) {
    super(range, parent, rawString);
  }

  public HexDoubleLiteral(Position start, Position end, AstNode parent, String rawString) {
    super(start, end, parent, rawString);
  }

  public HexDoubleLiteral(int startLine, int startCol, int endLine, int endCol, AstNode parent, String rawString) {
    super(startLine, startCol, endLine, endCol, parent, rawString);
  }
}
