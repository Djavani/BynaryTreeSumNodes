package br.com.djavani.binarytree;

import java.io.Serializable;

public class BinaryTree implements Serializable {

	private static final long serialVersionUID = 1L;

	int valor;
	BinaryTree left;
	BinaryTree right;

	public int getValor() {
		return valor;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public BinaryTree getLeft() {
		return left;
	}
	
	public void setLeft(BinaryTree left) {
		this.left = left;
	}
	
	public BinaryTree getRight() {
		return right;
	}
	
	public void setRight(BinaryTree right) {
		this.right = right;
	}

}
