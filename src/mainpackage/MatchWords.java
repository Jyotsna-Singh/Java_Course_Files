package mainpackage;

public class MatchWords {

	public static void main(String[] args){
		String Search="loop";
		String[] words={"loop","pool","lopo","book","kobo"};
		
		System.out.println(Search.charAt(0));
		System.out.println(words[0].length());
		System.out.println(Search.length());
		System.out.println(words.length);
		
		int[][] matrix = {{'0', '0', '0', '0'}, {'0', '0', '0', '0'}, {'0', '0', '0', '0'}, {'0', '0', '0', '0'}};;
		
		for(int k=0; k<words.length; k++)
		{
			
			String word1 = words[k];
			System.out.println("Word being compared is:"+ words[k]);
			String word2 = Search;
			int count[]={0,0,0,0};
			
			for(int i=0; i<word2.length(); i++)
			{
					for(int j=0; j<word1.length(); j++)
					{
						if(word1.charAt(j)==word2.charAt(i))
						{
							matrix[i][j]=1;
							count[i] = count[i]+1;
						}
						else
						{
							matrix[i][j]=0;
						}
						
						
						System.out.print(matrix[i][j] + "\t");
						
						
	
					}
					System.out.print("Row Count is "+count[i]);
					if(count[i]==0){
						System.out.print("\t Words Dont Match!");
					}else{
						System.out.print("\t Word Matches");
					}
					System.out.print("\n");
					
			}
			
			
		}
		
		
	}

}
