package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[300];
		int i;
		int w;
		int m;
		int t;
		int k = 2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[1] = Integer.parseInt(tempVar);
		}
		for (n = 2;scanf(",%d", a[n]);n++)
		{
		for (i = 1;i < n;i++)
		{
			for (m = n;m > i;m--)
			{
			if (a[i] < a[m])
			{
				t = a[i],a[i] = a[m],a[m] = t;
			}
			}
		}
		}
		if (a[1] == a[n - 1])
		{
			System.out.print("No\n");
		}
		else
		{
			for (i = 1;i <= n;i++)
			{
				w = i + 1;
				if (a[i] == a[w])
				{
					k++;
				}
				else
				{
					break;
				}
			}
			System.out.printf("%d",a[k]);
		}
		return 0;
	}

}

