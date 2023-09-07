package ar.edu.unlp.oo1.ejercicio1.impl;

import ar.edu.unlp.oo1.ejercicio1.WallPost;

/**
 * Completar esta clase de acuerdo a lo especificado en el cuadernillo
 *
 */
public class WallPostImpl implements WallPost {
	
	private int likes;
	private String text;
	private boolean destacado;
	
	
	
	public WallPostImpl () {
		this.likes = 0;
		this.text = "Undefined post";
		this.destacado = false;
	}
	
	public String getText() {
		
		return this.text;
	}
	
	
	public void setText(String text) {
		this.text = text;
	}
	
	public int getLikes() {
		
		return this.likes;
	}
	
	
	
	public void like() {
		this.likes ++;
	}
	
	
	
	public void dislike() {
		if (this.likes > 0)   this.likes --;
	}
	
	public boolean isFeatured() {
		return this.destacado;
	}
	
	
	public void toggleFeatured() {
		if (this.destacado) {
			this.destacado = false;
		}
		
		else 
			this.destacado = true;
	}
	

	/**
	 * Complete con su implementación
	 */

	/*
	 * Este mensaje se utiliza para que una instancia de Wallpost se muestre de forma adecuada
	 */
    @Override
    public String toString() {
        return "WallPost {" +
            "text: " + getText() +
            ", likes: '" + getLikes() + "'" +
            ", featured: '" + isFeatured() + "'" +
            "}";
    }

}
