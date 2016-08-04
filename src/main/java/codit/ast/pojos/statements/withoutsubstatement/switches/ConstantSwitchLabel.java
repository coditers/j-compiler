package codit.ast.pojos.statements.withoutsubstatement.switches;

import codit.ast.AstNode;
import codit.ast.Position;
import codit.ast.Range;
import codit.ast.pojos.expressions.Expression;

/**
 * @author Jisung Lim <iejisung@gmail.com>
 */
public class ConstantSwitchLabel extends SwitchLabel {

  private final Expression constantExpression;

  public ConstantSwitchLabel(Range range, AstNode parent, Expression constantExpression) {
    super(range, parent);
    this.constantExpression = constantExpression;
  }

  public ConstantSwitchLabel(Position start, Position end, AstNode parent, Expression constantExpression) {
    super(start, end, parent);
    this.constantExpression = constantExpression;
  }

  public ConstantSwitchLabel(int startLine, int startCol, int endLine, int endCol, AstNode parent, Expression constantExpression) {
    super(startLine, startCol, endLine, endCol, parent);
    this.constantExpression = constantExpression;
  }
}