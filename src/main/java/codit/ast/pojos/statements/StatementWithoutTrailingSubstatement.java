package codit.ast.pojos.statements;

import codit.ast.ParseTree;

/**
 * @author Jisung Lim <iejisung@gmail.com>
 */
public interface StatementWithoutTrailingSubstatement extends Statement, StatementNoShortIf, ParseTree {
}
