package codit.ast.pojos.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import codit.ast.AstNode;
import codit.ast.Position;
import codit.ast.Range;
import codit.ast.pojos.annotations.Annotation;

/**
 * @author Jisung Lim <iejisung@gmail.com>
 */
public class ClassType extends MultiClassOrInterfaceType {

  private final ClassOrInterfaceType classOrInterfaceType;

  private final List<Annotation> annotaitonList;
  private final String identifier;
  private final List<TypeArgument> typeArgumentList;

  public ClassType(Range range, AstNode parent,
                   ClassOrInterfaceType classOrInterfaceType,
                   Collection<Annotation> annotaitonList,
                   String identifier,
                   Collection<TypeArgument> typeArgumentList) {
    super(range, parent);
    this.classOrInterfaceType = classOrInterfaceType;
    this.annotaitonList = new ArrayList<>(annotaitonList);
    this.identifier = identifier;
    this.typeArgumentList = new ArrayList<>(typeArgumentList);
  }

  public ClassType(Position start, Position end, AstNode parent,
                   ClassOrInterfaceType classOrInterfaceType,
                   Collection<Annotation> annotaitonList,
                   String identifier,
                   Collection<TypeArgument> typeArgumentList) {
    super(start, end, parent);
    this.classOrInterfaceType = classOrInterfaceType;
    this.annotaitonList = new ArrayList<>(annotaitonList);
    this.identifier = identifier;
    this.typeArgumentList = new ArrayList<>(typeArgumentList);
  }

  public ClassType(int startLine, int startCol, int endLine, int endCol, AstNode parent,
                   ClassOrInterfaceType classOrInterfaceType,
                   Collection<Annotation> annotaitonList,
                   String identifier,
                   Collection<TypeArgument> typeArgumentList) {
    super(startLine, startCol, endLine, endCol, parent);
    this.classOrInterfaceType = classOrInterfaceType;
    this.annotaitonList = new ArrayList<>(annotaitonList);
    this.identifier = identifier;
    this.typeArgumentList = new ArrayList<>(typeArgumentList);
  }
}
