package codit.ast.pojos.statements.withoutsubstatement.asserts;

import codit.ast.AstNode;
import codit.ast.Position;
import codit.ast.Range;
import codit.ast.pojos.expressions.Expression;

/**
 * @author Jisung Lim <iejisung@gmail.com>
 */
public class BinAssertStatement extends AssertStatement {

  private final Expression conditionExpression;

  private final Expression aftermathExpression;

  public BinAssertStatement(Range range, AstNode parent,
                            Expression conditionExpression,
                            Expression aftermathExpression) {
    super(range, parent);
    this.conditionExpression = conditionExpression;
    this.aftermathExpression = aftermathExpression;
  }

  public BinAssertStatement(Position start, Position end, AstNode parent,
                            Expression conditionExpression,
                            Expression aftermathExpression) {
    super(start, end, parent);
    this.conditionExpression = conditionExpression;
    this.aftermathExpression = aftermathExpression;
  }

  public BinAssertStatement(int startLine, int startCol, int endLine, int endCol, AstNode parent,
                            Expression conditionExpression,
                            Expression aftermathExpression) {
    super(startLine, startCol, endLine, endCol, parent);
    this.conditionExpression = conditionExpression;
    this.aftermathExpression = aftermathExpression;
  }
}