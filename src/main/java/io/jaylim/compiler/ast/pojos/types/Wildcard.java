package io.jaylim.compiler.ast.pojos.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import io.jaylim.compiler.ast.pojos.AstNode;
import io.jaylim.compiler.ast.pojos.Position;
import io.jaylim.compiler.ast.pojos.Range;
import io.jaylim.compiler.ast.pojos.annotations.Annotation;

/**
 * @author Jisung Lim <iejisung@gmail.com>
 */
public class Wildcard extends AstNode implements Arguable {

  private final List<Annotation> annotationList;
  private final WildcardBounds wildcardBounds;

  public Wildcard(Range range, AstNode parent,
                  Collection<Annotation> annotationList,
                  WildcardBounds wildcardBounds) {
    super(range, parent);
    this.annotationList = new ArrayList<>(annotationList);
    this.wildcardBounds = wildcardBounds;
  }

  public Wildcard(Position start, Position end, AstNode parent,
                  Collection<Annotation> annotationList,
                  WildcardBounds wildcardBounds) {
    super(start, end, parent);
    this.annotationList = new ArrayList<>(annotationList);
    this.wildcardBounds = wildcardBounds;
  }

  public Wildcard(int startLine, int startCol, int endLine, int endCol, AstNode parent,
                  Collection<Annotation> annotationList,
                  WildcardBounds wildcardBounds) {
    super(startLine, startCol, endLine, endCol, parent);
    this.annotationList = new ArrayList<>(annotationList);
    this.wildcardBounds = wildcardBounds;
  }

  @JsonProperty("AnnotationList")
  public List<Annotation> getAnnotationList() {
    return annotationList;
  }

  @JsonProperty("WildcardBounds")
  public WildcardBounds getWildcardBounds() {
    return wildcardBounds;
  }
}
