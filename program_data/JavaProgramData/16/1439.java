package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int[] a = new int[10];
		int m;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= 4;i++)
		{
			a[i] = t % 10;
			t = t / 10;
		}
		for (i = 4;i >= 0;i--)
		{
			if (a[i] != 0)
			{
				m = i;
				break;
			}
		}
		for (i = 0;i <= m;i++)
		{
			System.out.printf("%d",a[i]);
		}
		return 0;
	}
}

