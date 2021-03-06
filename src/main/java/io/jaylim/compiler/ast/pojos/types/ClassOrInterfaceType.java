package io.jaylim.compiler.ast.pojos.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import io.jaylim.compiler.ast.pojos.AstNode;
import io.jaylim.compiler.ast.pojos.Position;
import io.jaylim.compiler.ast.pojos.Range;

/**
 * @author Jisung Lim <iejisung@gmail.com>
 */
public class ClassOrInterfaceType extends ReferenceType implements Arrayable {

  private final boolean isInterface;
  private final UnitClassOrInterfaceType unitClassOrInterfaceType;   // Target class
  private final List<UnitClassOrInterfaceType> classOrInterfaceType; // Packaging class

  public ClassOrInterfaceType(Range range, AstNode parent,
                              boolean isInterface,
                              UnitClassOrInterfaceType unitClassOrInterfaceType,
                              Collection<UnitClassOrInterfaceType> classOrInterfaceType) {
    super(range, parent);
    this.isInterface = isInterface;
    this.unitClassOrInterfaceType = unitClassOrInterfaceType;
    this.classOrInterfaceType = new ArrayList<>(classOrInterfaceType);
  }

  public ClassOrInterfaceType(Position start, Position end, AstNode parent,
                              boolean isInterface,
                              UnitClassOrInterfaceType unitClassOrInterfaceType,
                              Collection<UnitClassOrInterfaceType> classOrInterfaceType) {
    super(start, end, parent);
    this.isInterface = isInterface;
    this.unitClassOrInterfaceType = unitClassOrInterfaceType;
    this.classOrInterfaceType = new ArrayList<>(classOrInterfaceType);
  }

  public ClassOrInterfaceType(int startLine, int startCol, int endLine, int endCol, AstNode parent,
                              boolean isInterface,
                              UnitClassOrInterfaceType unitClassOrInterfaceType,
                              Collection<UnitClassOrInterfaceType> classOrInterfaceType) {
    super(startLine, startCol, endLine, endCol, parent);
    this.isInterface = isInterface;
    this.unitClassOrInterfaceType = unitClassOrInterfaceType;
    this.classOrInterfaceType = new ArrayList<>(classOrInterfaceType);
  }

  @JsonProperty("isInterface")
  public boolean isInterface() {
    return isInterface;
  }

  @JsonProperty("UnitClassOrInterfaceType")
  public UnitClassOrInterfaceType getUnitClassOrInterfaceType() {
    return unitClassOrInterfaceType;
  }

  @JsonProperty("ClassOrInterfaceType")
  public List<UnitClassOrInterfaceType> getClassOrInterfaceType() {
    return classOrInterfaceType;
  }
}
