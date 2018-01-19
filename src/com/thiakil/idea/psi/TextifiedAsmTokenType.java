package com.thiakil.idea.psi;

import com.intellij.psi.tree.IElementType;
import com.thiakil.idea.textified.TextifiedBytecodeLanguage;

public class TextifiedAsmTokenType extends IElementType {
	public TextifiedAsmTokenType(String debugName){
		super(debugName, TextifiedBytecodeLanguage.INSTANCE);
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
