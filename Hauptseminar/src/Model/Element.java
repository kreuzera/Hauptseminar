package Model;

import java.util.LinkedList;

public class Element {

	/**
	 * Save the String of the noun Phrase
	 */
	private String nounPhrase;
	
	
	/**
	 * List of all child-Elements
	 */
	private LinkedList<Element> child;
	
	/**
	 * Number of Elements connected with current Element
	 */
	private int degree;
	
	/**
	 * Index for Unique identity
	 */
	private int index;
	
	public Element(String nounPhrase, int index){
		this.nounPhrase = nounPhrase;
		this.setIndex(index);
		child = new LinkedList<Element>();
	}
	

	public String getNounPhrase() {
		return nounPhrase;
	}

	public void setNounPhrase(String nounPhrase) {
		this.nounPhrase = nounPhrase;
	}

	
	public void addChild(Element e){
		child.add(e);
	}

	/**
	 * Remove Element e from List of children
	 * @param e
	 */
	public void removeChild(Element e){
		for(int i = 0; i < child.size(); i++){
			if(child.get(i)==e){
				child.remove(i);
				return;
			}
		}
	}
	
	public int getDegree() {
		return degree;
	}

	public void setDegree() {
		degree = child.size();
	}
	
	/**
	 * MISSING:
	 * Remove all Relationsships to e within the Graph
	 * Use Graph.searchNodeByElement or build another Method
	 * @param e
	 */
	public void merge(Element e){
		child.addAll(e.getChildren());
		setDegree();
	}
	
	public LinkedList<Element> getChildren(){
		return child;
	}


	public int getIndex() {
		return index;
	}


	public void setIndex(int index) {
		this.index = index;
	}
}
