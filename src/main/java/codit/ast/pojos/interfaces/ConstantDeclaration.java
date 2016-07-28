package codit.ast.pojos.interfaces;

import java.util.List;

import codit.ast.AstNode;
import codit.ast.Position;
import codit.ast.Range;
import codit.ast.pojos.annotations.Annotation;
import codit.ast.pojos.types.unann.UnannType;
import codit.ast.pojos.variables.VariableDeclarator;

/**
 * @author Jisung Lim <iejisung@gmail.com>
 */
public class ConstantDeclaration extends AstNode implements InterfaceMemberable, AnnotationTypeMemberable {

  private final List<Annotation> annotationList;
  private final int modifiers;

  private final UnannType unannType;

  private final List<VariableDeclarator> variableDeclaratorList;

  public ConstantDeclaration(Range range, AstNode parent,
                             List<Annotation> annotationList,
                             int modifiers,
                             UnannType unannType,
                             List<VariableDeclarator> variableDeclaratorList) {
    super(range, parent);
    this.annotationList = annotationList;
    this.modifiers = modifiers;
    this.unannType = unannType;
    this.variableDeclaratorList = variableDeclaratorList;
  }

  public ConstantDeclaration(Position start, Position end, AstNode parent,
                             List<Annotation> annotationList,
                             int modifiers,
                             UnannType unannType,
                             List<VariableDeclarator> variableDeclaratorList) {
    super(start, end, parent);
    this.annotationList = annotationList;
    this.modifiers = modifiers;
    this.unannType = unannType;
    this.variableDeclaratorList = variableDeclaratorList;
  }

  public ConstantDeclaration(int startLine, int startCol, int endLine, int endCol, AstNode parent,
                             List<Annotation> annotationList,
                             int modifiers,
                             UnannType unannType,
                             List<VariableDeclarator> variableDeclaratorList) {
    super(startLine, startCol, endLine, endCol, parent);
    this.annotationList = annotationList;
    this.modifiers = modifiers;
    this.unannType = unannType;
    this.variableDeclaratorList = variableDeclaratorList;
  }
}