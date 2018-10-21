package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int l;
		int m;
		int n;
		int k;
		int i;
		int j;
		int sum;
		int p;
		int q;
		int[][] s = new int[150][150];
		int[][] a = new int[150][150];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
		 for (j = 0;j < n;j++)
		 {
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 a[i][j] = Integer.parseInt(tempVar3);
			 }
			 s[i][j] = 1;
		 }
		}
		 sum = m * n;
		 i = 0;
		 j = 0;
		 p = 0;
		 q = 1;
		 while (sum > 0)
		 {
			   k = 0;
			   while (s[i][j] == 1)
			   {
					 System.out.printf("%d\n",a[i][j]);
					 s[i][j] = 0;
					 sum--;
					 i += p;
					 j += q;
			   }
			 if ((p == 0) && (q == 1) && (k == 0))
			 {
							   p = 1;
							   q = 0;
							   i = i + 1;
							   j = j - 1;
							   k = 1;
			 }

			 if ((p == 1) && (q == 0) && (k == 0))
			 {
				  p = 0;
				  q = -1;
				  i = i - 1;
				  j = j - 1;
				  k = 1;
			 }
			 if ((p == 0) && (q == -1) && (k == 0))
			 {
							   p = -1;
							   q = 0;
							   j = j + 1;
							   i = i - 1;
							   k = 1;
			 }
			 if ((p == -1) && (q == 0) && (k == 0))
			 {
							   p = 0;
							   q = 1;
							   j = j + 1;
							   i = i + 1;
							   k = 1;
			 }
		 }

	return 0;
	}

}

