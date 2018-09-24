package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int k;
	int n;
	int[] x = new int[100];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i <= n - 1;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x[i] = Integer.parseInt(tempVar2);
		}
		if (i == 0)
		{
			System.out.printf("%d",x[i]);
		}
		else
		{
		   for (j = 0,k = 0;j <= i - 1;j++)
		   {
			   if (x[j] != x[i])
			   {
				   k++;
			   }
		   }
		   if (k == i)
		   {
		   System.out.printf(",%d",x[i]);
		   }
		}
	}
	System.out.print("\n");
	}
}

