package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] p = new int[15];
		int m;
		int n;
		int i;
		int j;
		int k;
		int h;
		for (i = 0;;i++)
		{
			n = 0;
			for (j = 0;;j++)
			{
			   String tempVar = ConsoleInput.scanfRead();
			   if (tempVar != null)
			   {
				   m = Integer.parseInt(tempVar);
			   }
			   if (m == 0)
			   {
				   break;
			   }
			   if (m == -1)
			   {
				   return 0;
			   }
			   p[j] = m;
			}
			for (k = 0;k < j;k++)
			{
				for (h = 0;h < j;h++)
				{
				 if (p[k] == 2 * p[h])
				 {
					 n++;
				 }
				}
			}
			System.out.printf("%d\n",n);
		}
		return 0;
	}
}

