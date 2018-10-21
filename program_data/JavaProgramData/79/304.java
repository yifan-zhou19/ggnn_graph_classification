public class person
{
	public int number;
	public int nextp;
}

package <missing>;

public class GlobalMembers
{
	public static person[] link = tangible.Arrays.initializeWithDefaultpersonInstances(300);
	public static int king(int n,int m)
	{
		int i;
		int t;
		int h;
		for (i = 1;i <= n;i++)
		{
			if (i == n)
			{
				link[i].nextp = 1;
			}
			else
			{
				link[i].nextp = i + 1;
			}
			link[i].number = i;
		}
		t = 0;
		h = n;
		while (t < n - 1)
		{
			i = 0;
		while (i != m)
		{
			h = link[h].nextp;
			if (link[h].number != 0)
			{
				i++;
			}
		}
		link[h].number = 0;
		t++;
		}
		for (i = 1;i <= n;i++)
		{
			if (link[i].number != 0)
			{
				return (link[i].number);
			}
		}
	}
	public static void Main()
	{
		int king = new int(int a,int b);
		int[] a = new int[1000];
		int k;
		int i;
		int[] b = new int[1000];
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
			if (a[i] == 0)
			{
				break;
			}
		}
		k = i;
		for (i = 0;i < k;i++)
		{
			System.out.printf("%d\n",king(a[i], b[i]));
		}
	}
}

