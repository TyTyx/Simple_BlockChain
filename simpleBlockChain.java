public class simpleBlockChain{
	public static void main(String args[]){

		Block initialBlock = new Block("Hi, I am the first block", "0");
		System.out.println("Hash for block 1: " + initialBlock.hash);

		Block secondBlock = new Block("I am the second block", initialBlock.hash);
		System.out.println("Hash for block 2: " + secondBlock.hash);

		Block thirdBlock = new Block("I am the third block", secondBlock.hash);
		System.out.println("Hash for block 3: " + thirdBlock.hash);
	}
}
