package io.jaylim.compiler.ast.pojos.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.jaylim.compiler.ast.pojos.AstNode;
import io.jaylim.compiler.ast.pojos.Position;
import io.jaylim.compiler.ast.pojos.Range;

/**
 * @author Jisung Lim <iejisung@gmail.com>
 */
public class VariableTypeBound extends TypeBound {

  private final TypeVariable typeVariable;

  public VariableTypeBound(Range range, AstNode parent,
                           TypeVariable typeVariable) {
    super(range, parent);
    this.typeVariable = typeVariable;
  }

  public VariableTypeBound(Position start, Position end, AstNode parent,
                           TypeVariable typeVariable) {
    super(start, end, parent);
    this.typeVariable = typeVariable;
  }

  public VariableTypeBound(int startLine, int startCol, int endLine, int endCol, AstNode parent,
                           TypeVariable typeVariable) {
    super(startLine, startCol, endLine, endCol, parent);
    this.typeVariable = typeVariable;
  }

  @JsonProperty("TypeVariable")
  public TypeVariable getTypeVariable() {
    return typeVariable;
  }
}
