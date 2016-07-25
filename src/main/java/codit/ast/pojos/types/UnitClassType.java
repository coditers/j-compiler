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
public class UnitClassType extends UnitClassOrInterfaceType {

  private final List<Annotation> annotationList;
  private final String identifier;
  private final List<TypeArgument> typeArgumentList;

  public UnitClassType(Range range, AstNode parent,
                       Collection<Annotation> annotationList,
                       String identifier,
                       Collection<TypeArgument> typeArgumentList) {
    super(range, parent);
    this.annotationList = new ArrayList<>(annotationList);
    this.identifier = identifier;
    this.typeArgumentList = new ArrayList<>(typeArgumentList);
  }

  public UnitClassType(Position start, Position end, AstNode parent,
                       Collection<Annotation> annotationList,
                       String identifier,
                       Collection<TypeArgument> typeArgumentList) {
    super(start, end, parent);
    this.annotationList = new ArrayList<>(annotationList);
    this.identifier = identifier;
    this.typeArgumentList = new ArrayList<>(typeArgumentList);
  }

  public UnitClassType(int startLine, int startCol, int endLine, int endCol, AstNode parent,
                       Collection<Annotation> annotationList,
                       String identifier,
                       Collection<TypeArgument> typeArgumentList) {
    super(startLine, startCol, endLine, endCol, parent);
    this.annotationList = new ArrayList<>(annotationList);
    this.identifier = identifier;
    this.typeArgumentList = new ArrayList<>(typeArgumentList);
  }
}
