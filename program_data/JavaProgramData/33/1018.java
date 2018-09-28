package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int a;
	   int j;
	   int m;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   String A = new String(new char[260]);
	   char[][] B = new char[n][260];
	   for (i = 0;i < n;i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   A = tempVar2.charAt(0);
		   }
		   a = A.length();
		   for (j = 0;j < a;j++)
		   {
			   if (A.charAt(j) == 'A')
			   {
				   B[i][j] = 'T';
			   }
				if (A.charAt(j) == 'T')
				{
				   B[i][j] = 'A';
				}
				if (A.charAt(j) == 'C')
				{
				   B[i][j] = 'G';
				}
				if (A.charAt(j) == 'G')
				{
				   B[i][j] = 'C';
				}
		   }
		   B[i][j] = '\0';

	   }
		for (m = 0;m < n - 1;m++)
		{
			System.out.printf("%s\n",B[m]);
		}
		 System.out.printf("%s",B[n - 1]);

		return 0;

	}

}

