package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int max = 0;
		int second = 0;
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			if (max < a[i])
			{
			   second = max;
			   max = a[i];
			}
			else if ((max > a[i]) && (a[i] > second))
			{
			   second = a[i];
			   max = max;
			}
		}
		System.out.printf("%d\n%d\n",max,second);
		return 0;
	}
}

