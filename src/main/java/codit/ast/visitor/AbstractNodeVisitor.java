package codit.ast.visitor;

import codit.ast.AstNode;

/**
 * @author Jisung Lim <iejisung@gmail.com>
 */
public abstract class AbstractNodeVisitor<T> implements NodeVisitor<T> {


  @Override
  public T visit(AstNode astNode) {
    return null;
  }

  @Override
  public T visitChildren(AstNode astNode) {
    return null;
  }

  @Override
  public T visitTerminal(AstNode astNode) {
    return null;
  }

  @Override
  public T visitErrorNode(AstNode astNode) {
    return null;
  }
}
