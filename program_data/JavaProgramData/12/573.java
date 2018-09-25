package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[16];
		int i;
		int j;
		int s;
		int n;
		for (; ;)
		{
			for (i = 0;i <= 15;i++)
			{
				a[i] = 0;
			}
			for (i = 0;i <= 15;i++)
			{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			if (a[i] == 0)
			{
				break;
			}
			if (a[i] == -1)
			{
				return 0;
			}
			}
		n = i;
		s = 0;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[j] == 2 * a[i])
				{
					s = s + 1;
				}
			}
		}
		System.out.printf("%d\n",s);
		}
		return 0;
	}

}

