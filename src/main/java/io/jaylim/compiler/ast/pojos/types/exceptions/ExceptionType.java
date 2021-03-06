package io.jaylim.compiler.ast.pojos.types.exceptions;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.jaylim.compiler.ast.pojos.AstNode;
import io.jaylim.compiler.ast.pojos.Position;
import io.jaylim.compiler.ast.pojos.Range;

/**
 * @author Jisung Lim <iejisung@gmail.com>
 */
public class ExceptionType extends AstNode {
  private final Exceptionable exceptionable;

  public ExceptionType(Range range, AstNode parent,
                       Exceptionable exceptionable) {
    super(range, parent);
    this.exceptionable = exceptionable;
  }

  public ExceptionType(Position start, Position end, AstNode parent,
                       Exceptionable exceptionable) {
    super(start, end, parent);
    this.exceptionable = exceptionable;
  }

  public ExceptionType(int startLine, int startCol, int endLine, int endCol, AstNode parent,
                       Exceptionable exceptionable) {
    super(startLine, startCol, endLine, endCol, parent);
    this.exceptionable = exceptionable;
  }

  @JsonProperty("Exceptionable")
  public Exceptionable getExceptionable() {
    return exceptionable;
  }
}
