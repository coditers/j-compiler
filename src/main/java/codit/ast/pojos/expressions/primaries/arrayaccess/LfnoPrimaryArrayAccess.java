package codit.ast.pojos.expressions.primaries.arrayaccess;

import java.util.List;

import codit.ast.AstNode;
import codit.ast.Position;
import codit.ast.Range;
import codit.ast.pojos.expressions.Expression;
import codit.ast.pojos.expressions.primaries.interfaces.DefaultArrayLfnoPrimary;
import codit.ast.pojos.expressions.primaries.interfaces.LfArrayLfnoPrimary;
import codit.ast.pojos.expressions.primaries.interfaces.LfnoArrayLfnoPrimary;

/**
 * @author Jisung Lim <iejisung@gmail.com>
 */
public class LfnoPrimaryArrayAccess extends ArrayAccess
    implements DefaultArrayLfnoPrimary {


  private final LfnoArrayLfnoPrimary lfnoArrayLfnoPrimary;
  private final Expression firstExpression;

  private final List<LfArrayLfnoPrimary> lfArrayLfnoPrimaryList;
  private final List<Expression> expressionList;


  public LfnoPrimaryArrayAccess(Range range, AstNode parent,
                                LfnoArrayLfnoPrimary lfnoArrayLfnoPrimary,
                                Expression firstExpression,
                                List<LfArrayLfnoPrimary> lfArrayLfnoPrimaryList,
                                List<Expression> expressionList) {
    super(range, parent);
    this.lfnoArrayLfnoPrimary = lfnoArrayLfnoPrimary;
    this.firstExpression = firstExpression;
    this.lfArrayLfnoPrimaryList = lfArrayLfnoPrimaryList;
    this.expressionList = expressionList;
  }

  public LfnoPrimaryArrayAccess(Position start, Position end, AstNode parent,
                                LfnoArrayLfnoPrimary lfnoArrayLfnoPrimary,
                                Expression firstExpression,
                                List<LfArrayLfnoPrimary> lfArrayLfnoPrimaryList,
                                List<Expression> expressionList) {
    super(start, end, parent);
    this.lfnoArrayLfnoPrimary = lfnoArrayLfnoPrimary;
    this.firstExpression = firstExpression;
    this.lfArrayLfnoPrimaryList = lfArrayLfnoPrimaryList;
    this.expressionList = expressionList;
  }

  public LfnoPrimaryArrayAccess(int startLine, int startCol, int endLine, int endCol, AstNode parent,
                                LfnoArrayLfnoPrimary lfnoArrayLfnoPrimary,
                                Expression firstExpression,
                                List<LfArrayLfnoPrimary> lfArrayLfnoPrimaryList,
                                List<Expression> expressionList) {
    super(startLine, startCol, endLine, endCol, parent);
    this.lfnoArrayLfnoPrimary = lfnoArrayLfnoPrimary;
    this.firstExpression = firstExpression;
    this.lfArrayLfnoPrimaryList = lfArrayLfnoPrimaryList;
    this.expressionList = expressionList;
  }
}