package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int n;
	 int i;
	 int j;
	 int k;
	 int m = 0;
	 int[] b = new int[50000];
	 int[] flag = new int[50000];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 3;i < n;i++)
	 {
	  if (i % 2 != 0)
	  {
	   k = 1;
	   for (j = 2;j <= Math.sqrt(i);j++)
	   {
		if (i % j == 0)
		{
		 k = 0;
		}
	   }
	   if (k == 1)
	   {
		b[m] = i;
		flag[i] = 1;
		m++;
	   }
	  }
	 }
	 for (k = 6;k <= n;k += 2)
	 {
	  for (i = 0; i <= m; i++)
	  {
	   if (flag[k - b[i]] == 1)
	   {
		System.out.printf("%d=%d+%d\n",k,b[i],k - b[i]);
		break;
	   }
	  }
	 }
	}

}

