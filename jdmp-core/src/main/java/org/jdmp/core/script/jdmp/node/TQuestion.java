/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.jdmp.core.script.jdmp.node;

import org.jdmp.core.script.jdmp.analysis.Analysis;

@SuppressWarnings("nls")
public final class TQuestion extends Token {
	public TQuestion() {
		super.setText("?");
	}

	public TQuestion(int line, int pos) {
		super.setText("?");
		setLine(line);
		setPos(pos);
	}

	public Object clone() {
		return new TQuestion(getLine(), getPos());
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseTQuestion(this);
	}

	public void setText(@SuppressWarnings("unused") String text) {
		throw new RuntimeException("Cannot change TQuestion text.");
	}
}
