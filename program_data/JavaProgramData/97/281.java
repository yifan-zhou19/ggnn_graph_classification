package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = {100, 50, 20, 10, 5, 1};
		int[] s = new int[6];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 60;i++)
		{
			for (j = 0;j < 10;j++)
			{
				if (n - a[i] >= 0)
				{
					n = n - a[i];
					s[i] += 1;
				}
			}
		}
		for (i = 0;i < 6;i++)
		{
			System.out.printf("%d\n",s[i]);
		}
		return 0;
	}
}

