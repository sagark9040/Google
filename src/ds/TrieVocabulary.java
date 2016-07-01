package ds;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

interface Vocabulary {
	boolean add(String word);
	boolean isPrefix(String prefix);
	boolean contains(String word);
	String getName();
}

public class TrieVocabulary extends TreeSet<String> implements Vocabulary {

	private static final long serialVersionUID = 1084215309279053589L;

	
	public TrieVocabulary() {
		super();
	}

	public TrieVocabulary(Collection<String> c) {
		super(c);
	}

	public boolean isPrefix(String prefix) {
		String nextWord = ceiling(prefix);
		if (nextWord == null) {
			return false;
		}
		if (nextWord.equals(prefix)) {
			Set<String> tail = tailSet(nextWord, false);
			if (tail.isEmpty()) {
				return false;
			}
			nextWord = tail.iterator().next();
		}
		return nextWord.startsWith(prefix);
	}

	/**
	 * There is a mismatch between the parameter types of vocabulary and TreeSet, so
	 * force call to the upper-class method
	 */
	public boolean contains(String word) {
		return super.contains(word);
	}
	@Override
	public String getName() {
		return getClass().getName();
	}
}
