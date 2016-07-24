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
public class Dims extends AstNode {
  private final List<List<Annotation>> annotationListList;

  public Dims(Range range, AstNode parent,
              Collection<List<Annotation>> annotationListList) {
    super(range, parent);
    this.annotationListList = new ArrayList<>(annotationListList);
  }

  public Dims(Position start, Position end, AstNode parent,
              Collection<List<Annotation>> annotationListList) {
    super(start, end, parent);
    this.annotationListList = new ArrayList<>(annotationListList);
  }

  public Dims(int startLine, int startCol, int endLine, int endCol, AstNode parent,
              Collection<List<Annotation>> annotationListList) {
    super(startLine, startCol, endLine, endCol, parent);
    this.annotationListList = new ArrayList<>(annotationListList);
  }
}