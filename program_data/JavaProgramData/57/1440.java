package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 char[][] word1 = new char[50][20];
	 char[][] word2 = new char[50][20];
	 int i;
	 int n;
	 int j;
	 int[] l = new int[50];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 0;i < n;i++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  word1[i] = tempVar2.charAt(0);
	  }
	  l[i] = String.valueOf(word1[i]).length();
	 }
	 for (i = 0;i < n;i++)
	 {
	  if (word1[i][l[i] - 2] == 'e' && word1[i][l[i] - 1] == 'r')
	  {
	   for (j = 0;j < l[i] - 2;j++)
	   {
		word2[i][j] = word1[i][j];
	   }
		word2[i][j] = '\0';
	  }
	  else if (word1[i][l[i] - 1] == 'g' && word1[i][l[i] - 2] == 'n' && word1[i][l[i] - 3] == 'i')
	  {
	   for (j = 0;j < l[i] - 3;j++)
	   {
	   word2[i][j] = word1[i][j];
	   }
	   word2[i][j] = '\0';
	  }
	  else if (word1[i][l[i] - 2] == 'l' && word1[i][l[i] - 1] == 'y')
	  {
	   for (j = 0;j < l[i] - 2;j++)
	   {
		word2[i][j] = word1[i][j];
	   }
	   word2[i][j] = '\0';
	  }
	 }
	 for (i = 0;i < n;i++)
	 {
	  System.out.printf("%s",word2[i]);
	  System.out.print("\n");
	 }
	}
}

