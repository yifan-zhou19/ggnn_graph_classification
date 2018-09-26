package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int bad;
		int[] a = new int[100];
		int i;
		int j;
		int b;
		int all = new int(int bad, int a[100]);
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
				bad = Integer.parseInt(tempVar2);
			}
			if (bad == 0)
			{
				System.out.print("60\n");
			}
			else
			{
			for (j = 0;j < bad;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[j] = Integer.parseInt(tempVar3);
				}
			}
				b = all(bad, a);
				System.out.printf("%d\n", b);
			}
		}
		return 0;
	}
	public static int all(int bad, int[] a)
	{
		int i;
		for (i = bad - 1;i >= 0;i--)
		{
			if (a[i] + 3 * (i + 1) < 60)
			{
				return (60 - 3 * (i + 1));
			}
			else if (a[i] + 3 * i <= 60 && a[i] + 3 * i >= 57)
			{
				return a[i];
			}
			else
			{
				continue;
			}
		}
	}


}

