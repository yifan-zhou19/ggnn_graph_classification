package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int i;
		int max = 0;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}
		while (i > 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			if (a[i] > max)
			{
				t = max;
				max = a[i];
			}
			else if (t < a[i])
			{
				t = a[i];
			}
			i--;
		}
		System.out.printf("%d\n",max);
		System.out.printf("%d",t);
		return 0;
	}
}

