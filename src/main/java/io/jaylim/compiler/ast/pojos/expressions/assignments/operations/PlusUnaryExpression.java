package io.jaylim.compiler.ast.pojos.expressions.assignments.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.jaylim.compiler.ast.pojos.AstNode;
import io.jaylim.compiler.ast.pojos.Position;
import io.jaylim.compiler.ast.pojos.Range;

/**
 * @author Jisung Lim <iejisung@gmail.com>
 */
public class PlusUnaryExpression extends UnaryExpression {

  private final UnaryExpression unaryExpression;

  public PlusUnaryExpression(Range range, AstNode parent, UnaryExpression unaryExpression) {
    super(range, parent);
    this.unaryExpression = unaryExpression;
  }

  public PlusUnaryExpression(Position start, Position end, AstNode parent, UnaryExpression unaryExpression) {
    super(start, end, parent);
    this.unaryExpression = unaryExpression;
  }

  public PlusUnaryExpression(int startLine, int startCol, int endLine, int endCol, AstNode parent, UnaryExpression unaryExpression) {
    super(startLine, startCol, endLine, endCol, parent);
    this.unaryExpression = unaryExpression;
  }

  @JsonProperty("UnaryExpression")
  public UnaryExpression getUnaryExpression() {
    return unaryExpression;
  }
}
