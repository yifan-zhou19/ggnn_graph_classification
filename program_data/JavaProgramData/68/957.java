package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] t = new int[50001];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 2;i <= n;i++)
	   {
		   t[i] = 1;
			if (i % 2 == 0)
			{
			t[i] = 0;
			}
			for (j = 3;j <= Math.sqrt(i) + 1;j = j + 2)
			{
				if (i % j == 0)
				{
					  t[i] = 0;
				   break;
				}
			}
	   }
	   for (i = 6;i <= n;i = i + 2)
	   {
		   for (j = 3;j <= n / 2;j = j + 2)
		   {
		   if (t[j] == 1 && t[i - j] == 1)
		   {
		   System.out.printf("%d=%d+%d\n",i,j,i - j);
			   break;
		   }
		   }
	   }


	  return 0;
	}
}

