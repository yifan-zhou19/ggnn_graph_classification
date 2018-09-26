package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[20001];
		int i;
		int j;
		int t;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			f = Integer.parseInt(tempVar2);
		}
		System.out.printf("%d",f);
		for (i = 1;i <= n - 1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			for (j = 1;j <= i - 1;j++)
			{
				t = a[i] - a[j];
				if (t == 0)
				{
					break;
				}
			}
			if (t == 0 || a[i] == f)
			{
				continue;
			}
				System.out.printf(",%d",a[i]);
		}
		return 0;
	}
}

