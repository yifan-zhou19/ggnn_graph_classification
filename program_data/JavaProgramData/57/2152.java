package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] str = new char[200][20];
		int i;
		int j;
		int n;
		int k;
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
				str[i] = tempVar2.charAt(0);
			}
			System.in.read();
		}
		 for (i = 0;i < n;i++)
		 {
			 k = String.valueOf(str[i]).length();
			 if (str[i][k - 1] == 'r' || str[i][k - 1] == 'y')
			 {
			  for (j = k - 1;j > k - 3;j--)
			  {
				str[i][j] = '\0';
			  }
			 }

		  if (str[i][k - 1] == 'g')
		  {
			  for (j = k - 1;j > k - 4;j--)
			  {
				  str[i][j] = '\0';
			  }
		  }
		 System.out.printf("%s\n",str[i]);
		 }
	}

}

