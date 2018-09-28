package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int num;
		char[][] word = new char[50][20];
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
			  word[i] = tempVar2.charAt(0);
		  }
		  num = String.valueOf(word[i]).length();
		  if (word[i][num - 1] == 'r' && word[i][num - 2] == 'e')
		  {
			word[i][num - 1] = '\0';
			word[i][num - 2] = '\0';
			System.out.printf("%s\n",word[i]);
		  }
		 else if (word[i][num - 1] == 'y' && word[i][num - 2] == 'l')
		 {
			   word[i][num - 1] = '\0';
			word[i][num - 2] = '\0';
			System.out.printf("%s\n",word[i]);
		 }
		  else if (word[i][num - 1] == 'g' && word[i][num - 2] == 'n' && word[i][num - 3] == 'i')
		  {
			   word[i][num - 1] = '\0';
			word[i][num - 2] = '\0';
			word[i][num - 3] = '\0';
			System.out.printf("%s\n",word[i]);
		  }
		}
		return 0;
	}

}

