package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[100];
		int[] d = new int[100];
		int[] e = new int[100];
		int[] f = new int[100];
		int i;
		for (i = 0;i < 100;i++)
		{
			if (scanf("0 0 0 0 0 0"))
			{
				break;
			}
			else
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i] = Integer.parseInt(tempVar);
				}
				String tempVar2 = ConsoleInput.scanfRead(" ");
				if (tempVar2 != null)
				{
					b[i] = Integer.parseInt(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					c[i] = Integer.parseInt(tempVar3);
				}
				String tempVar4 = ConsoleInput.scanfRead(" ");
				if (tempVar4 != null)
				{
					d[i] = Integer.parseInt(tempVar4);
				}
				String tempVar5 = ConsoleInput.scanfRead(" ");
				if (tempVar5 != null)
				{
					e[i] = Integer.parseInt(tempVar5);
				}
				String tempVar6 = ConsoleInput.scanfRead(" ");
				if (tempVar6 != null)
				{
					f[i] = Integer.parseInt(tempVar6);
				}
			}
		}
		int t;
		t = i - 3;
		int[] second = new int[100];
		for (i = 0;i <= t;i++)
		{
			second[i] = (60 - c[i]) + (60 - (b[i] + 1)) * 60 + f[i] + e[i] * 60 + (d[i] + 12 - a[i] - 1) * 3600;
			System.out.printf("%d\n", second[i]);
		}
		return 0;
	}

}

