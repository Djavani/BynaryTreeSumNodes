package br.com.djavani.binarytree;
import java.io.Serializable;
import java.util.Random;

public class Principal implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int soma =0;	
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		BinaryTree noA = new BinaryTree();
		BinaryTree noB = new BinaryTree();
		BinaryTree noC = new BinaryTree();

		noA.setValor(rand.nextInt(100));
		noB.setValor(rand.nextInt(100));
		noC.setValor(rand.nextInt(100));
		noA.setRight(noB);
		noA.setLeft(noC);				
				
		Principal  sumNodes = new Principal();			
		System.out.println("The sum of nodes is: " + sumNodes.node(noA));
	}	
	
	public int node(BinaryTree no) {
		if(no!=null) {
			this.soma += no.getValor();
			this.node(no.getLeft());
			this.node(no.getRight());
		}
		return soma;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + soma;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Principal other = (Principal) obj;
		if (soma != other.soma)
			return false;
		return true;
	}
	
	
}
