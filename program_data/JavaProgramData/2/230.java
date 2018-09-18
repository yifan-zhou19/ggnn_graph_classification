package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int m;
	   int n;
	   int j;
	   int k;
	   int[] id = new int[1001];
	   int[] a = new int[26];
	   char[][] c = new char[1001][26];
	   char[] b = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (j = 1;j <= n;j++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   id[j] = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   c[j] = tempVar3.charAt(0);
		   }
	   }
	   for (m = 0;m < 26;m++)
	   {
				 for (j = 1;j <= n;j++)
				 {
							   for (k = 0;k < 26;k++)
							   {
								   if (b[m] == c[j][k])
								   {
									   a[m] = a[m] + 1;
								   }
							   }
				 }
	   }
	   int t = 0;
	   int r = 0;
	   for (m = 0;m <= 25;m++)
	   {
			if (t < a[m])
			{
				t = a[m];
				r = m;
			}
	   }
	   System.out.printf("%c\n%d",b[r],a[r]);
	   for (j = 1;j <= n;j++)
	   {
				 for (k = 0;k < 26;k++)
				 {
						if (c[j][k] == b[r])
						{
							System.out.printf("\n%d",id[j]);
						}
				 }
	   }
	}
}

