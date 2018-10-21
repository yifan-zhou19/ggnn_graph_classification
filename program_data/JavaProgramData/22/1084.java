package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int n;
		int i;
		int first;
		int second;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		for (i = 1;i < 300;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead(",");
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		n = i;
		first = 0;
		second = 0;
		for (i = 0;i < n;i++)
		{
			if (a[i] > first)
			{
				first = a[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] < first && a[i] >= second)
			{
				second = a[i];
			}
		}
		if (second == 0)
		{
			System.out.print("No\n");
		}
		else
		{
			System.out.printf("%d\n",second);
		}
	}

}

