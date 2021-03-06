package io.jaylim.compiler.ast.pojos.classes.constructors;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import io.jaylim.compiler.ast.pojos.AstNode;
import io.jaylim.compiler.ast.pojos.Position;
import io.jaylim.compiler.ast.pojos.Range;
import io.jaylim.compiler.ast.pojos.expressions.Expression;
import io.jaylim.compiler.ast.pojos.types.TypeArgument;

/**
 * @author Jisung Lim <iejisung@gmail.com>
 */
public abstract class ExplicitConstructorInvocation extends AstNode {

  private final List<TypeArgument> typeArgumentList;

  private final List<Expression> argumentList;

  public ExplicitConstructorInvocation(Range range, AstNode parent,
                                       List<TypeArgument> typeArgumentList,
                                       List<Expression> argumentList) {
    super(range, parent);
    this.typeArgumentList = typeArgumentList;
    this.argumentList = argumentList;
  }

  public ExplicitConstructorInvocation(Position start, Position end, AstNode parent,
                                       List<TypeArgument> typeArgumentList,
                                       List<Expression> argumentList) {
    super(start, end, parent);
    this.typeArgumentList = typeArgumentList;
    this.argumentList = argumentList;
  }

  public ExplicitConstructorInvocation(int startLine, int startCol, int endLine, int endCol, AstNode parent,
                                       List<TypeArgument> typeArgumentList,
                                       List<Expression> argumentList) {
    super(startLine, startCol, endLine, endCol, parent);
    this.typeArgumentList = typeArgumentList;
    this.argumentList = argumentList;
  }

  @JsonProperty("TypeArgumentList")
  public List<TypeArgument> getTypeArgumentList() {
    return typeArgumentList;
  }

  @JsonProperty("ArgumentList")
  public List<Expression> getArgumentList() {
    return argumentList;
  }
}
