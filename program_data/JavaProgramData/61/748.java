package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int sum;
	int[] sz = new int[10000];
	int[] b = new int[30];
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
		 sz[i] = Integer.parseInt(tempVar2);
	 }
	 }
	 for (i = 0;i < n;i++)
	 {
		if (sz[i] == 1 || sz[i] == 2)
		{
		  sum = 1;
		}
		  else
		  {
		  for (j = 3;j <= sz[i];j++)
		  {
		  b[1] = 1;
		  b[2] = 1;
		  b[j] = b[j - 2] + b[j - 1];
		  sum = b[j];
		  }
		  }
	   System.out.printf("%d\n",sum);
	 }
	   return 0;
	}

}

