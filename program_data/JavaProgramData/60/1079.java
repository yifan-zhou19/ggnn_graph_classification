package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[10002];
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n < 5)
		{
			System.out.print("empty");
		}
		else if (n < 10001)
		{
		for (i = 2;i < Math.sqrt(n);i++)
		{
			for (j = 2 * i;j < n + 1;j = j + i)
			{
				a[j] = 1;
			}
		}
		for (i = 2;i < n - 1;i++)
		{
			if (a[i] == 0 && a[i + 2] == 0 && i < n - 1)
			{
				System.out.printf("%d %d\n",i,i + 2);
			}
		}
		}
		else
		{
			System.out.print("!");
		}
	}


}

