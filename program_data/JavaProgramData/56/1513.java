package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int[] x = new int[5];
		int i;
		int j = 0;
		int n;
		int m;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		while (a > 0)
		{
				 x[j] = a % 10;
			  j++;
			  a = a / 10;
		}
		for (i = 0;i < j;i++)
		{
		System.out.printf("%d",x[i]);
		}
	}

}

