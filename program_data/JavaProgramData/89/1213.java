package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int p;
		int[] a = new int[10001];
		int[] b = new int[10001];
		int s = 0;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			if (a[i] == 0 && b[i] == 0)
			{
			break;
			}
		}
		for (j = 0;j <= i - 1;j++)
		{
			for (k = 0;k <= i - 1;k++)
			{
				if (b[j] == b[k])
				{
				s++;
				}
			}
			if (s == n - 1)
			{
				for (p = 0;p <= i - 1;p++)
				{
					if (a[p] == b[j])
					{
					break;
					}
				}
				if (p == i)
				{
					System.out.printf("%d",b[j]);
					t = 1;
					break;
				}
			}
			s = 0;
		}
		if (t == 0)
		{
		System.out.print("NOT FOUND");
		}
	}
}

