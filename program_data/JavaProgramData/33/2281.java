package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int c = 0;
		int[] a = new int[1000];
		char[][] s1 = new char[1000][256];
		char[][] s2 = new char[1000][256];
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
				 s1[i] = tempVar2.charAt(0);
			 }
			 a[i] = String.valueOf(s1[i]).length();
		}
		for (i = 0;i < n;i++)
		{
			 for (j = 0;s1[i][j] != '\0';j++)
			 {
				  if (s1[i][j] == 'A')
				  {
					   s2[i][j] = 'T';
				  }
				  else if (s1[i][j] == 'G')
				  {
					   s2[i][j] = 'C';
				  }
				  else if (s1[i][j] == 'C')
				  {
					   s2[i][j] = 'G';
				  }
				  else
				  {
					   s2[i][j] = 'A';
				  }
			 }
			 c = a[i];
			 s2[i][c] = '\0';
		}
		for (i = 0;i < n;i++)
		{
			 System.out.printf("%s\n",s2[i]);
		}
		return 0;
	}

}

