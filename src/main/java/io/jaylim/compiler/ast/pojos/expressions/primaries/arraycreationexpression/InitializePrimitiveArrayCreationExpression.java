package io.jaylim.compiler.ast.pojos.expressions.primaries.arraycreationexpression;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.jaylim.compiler.ast.pojos.AstNode;
import io.jaylim.compiler.ast.pojos.Position;
import io.jaylim.compiler.ast.pojos.Range;
import io.jaylim.compiler.ast.pojos.classes.ArrayInitializer;
import io.jaylim.compiler.ast.pojos.types.Dims;
import io.jaylim.compiler.ast.pojos.types.PrimitiveType;

/**
 * @author Jisung Lim <iejisung@gmail.com>
 */
public class InitializePrimitiveArrayCreationExpression extends ArrayCreationExpression {

  private final PrimitiveType primitiveType;
  private final Dims dims;
  private final ArrayInitializer arrayInitializer;

  public InitializePrimitiveArrayCreationExpression(Range range, AstNode parent,
                                                    PrimitiveType primitiveType,
                                                    Dims dims,
                                                    ArrayInitializer arrayInitializer) {
    super(range, parent);
    this.primitiveType = primitiveType;
    this.dims = dims;
    this.arrayInitializer = arrayInitializer;
  }

  public InitializePrimitiveArrayCreationExpression(Position start, Position end, AstNode parent,
                                                    PrimitiveType primitiveType,
                                                    Dims dims,
                                                    ArrayInitializer arrayInitializer) {
    super(start, end, parent);
    this.primitiveType = primitiveType;
    this.dims = dims;
    this.arrayInitializer = arrayInitializer;
  }

  public InitializePrimitiveArrayCreationExpression(int startLine, int startCol, int endLine, int endCol, AstNode parent,
                                                    PrimitiveType primitiveType,
                                                    Dims dims,
                                                    ArrayInitializer arrayInitializer) {
    super(startLine, startCol, endLine, endCol, parent);
    this.primitiveType = primitiveType;
    this.dims = dims;
    this.arrayInitializer = arrayInitializer;
  }

  @JsonProperty("PrimitiveType")
  public PrimitiveType getPrimitiveType() {
    return primitiveType;
  }

  @JsonProperty("Dims")
  public Dims getDims() {
    return dims;
  }

  @JsonProperty("ArrayInitializer")
  public ArrayInitializer getArrayInitializer() {
    return arrayInitializer;
  }
}
