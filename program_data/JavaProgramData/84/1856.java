package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int n;
		int first = 0;
		int second = 0;
		int i;
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
				a[i] = Integer.parseInt(tempVar2);
			}
			if (first < a[i])
			{
				first = a[i];
			}
			else
			{
				first = first;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (second < a[i] && a[i] != first)
			{
				second = a[i];
			}
			else
			{
				second = second;
			}
		}
		System.out.printf("%d\n",first);
		System.out.printf("%d\n",second);
		return 0;
	}

}

