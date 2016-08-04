package codit.ast.pojos.statements.noshortif;

import codit.ast.AstNode;
import codit.ast.Position;
import codit.ast.Range;
import codit.ast.pojos.statements.StatementNoShortIf;

/**
 * @author Jisung Lim <iejisung@gmail.com>
 */
public class LabeledStatementNoShortIf extends AstNode implements StatementNoShortIf {

  private final String identifier;

  private final StatementNoShortIf statementNoShortIf;

  public LabeledStatementNoShortIf(Range range, AstNode parent,
                                   String identifier,
                                   StatementNoShortIf statementNoShortIf) {
    super(range, parent);
    this.identifier = identifier;
    this.statementNoShortIf = statementNoShortIf;
  }

  public LabeledStatementNoShortIf(Position start, Position end, AstNode parent,
                                   String identifier,
                                   StatementNoShortIf statementNoShortIf) {
    super(start, end, parent);
    this.identifier = identifier;
    this.statementNoShortIf = statementNoShortIf;
  }

  public LabeledStatementNoShortIf(int startLine, int startCol, int endLine, int endCol, AstNode parent,
                                   String identifier,
                                   StatementNoShortIf statementNoShortIf) {
    super(startLine, startCol, endLine, endCol, parent);
    this.identifier = identifier;
    this.statementNoShortIf = statementNoShortIf;
  }
}