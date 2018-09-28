public class a
{
	public String id = new String(new char[100]);
	public int year;
}

package <missing>;

public class GlobalMembers
{
	public static a[] p = tangible.Arrays.initializeWithDefaultaInstances(100);
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int t = 0;
		int r = 0;
		int[] a = new int[200];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a[] b = tangible.Arrays.initializeWithDefaultaInstances(100);
		a[] c = tangible.Arrays.initializeWithDefaultaInstances(100);
		a temp = new a();
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i].id = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p[i].year = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (p[i].year >= 60)
			{
				b[t] = p[i];
				t++;
			}
		}
		for (i = 0;i <= t - 1;i++)
		{
			a[b[i].year]++;
		}
		for (i = 200;i >= 60;i--)
		{
			if (a[i] > 0)
			{
				for (j = 0;j <= t - 1;j++)
				{
					if (b[j].year == i)
					{
						c[r] = b[j];
						r++;
					}
				}
			}
		}


		for (i = 0;i <= t - 1;i++)
		{
			System.out.printf("%s\n",c[i].id);
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (p[i].year < 60)
			{
				System.out.printf("%s\n",p[i].id);
			}
		}
		return 0;
	}
}

