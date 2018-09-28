package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int max = new int(int m,int b[]);
		int i = 1;
		int n;
		int t;
		int[] a = new int[300];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		while (scanf(",%d", a[i]))
		{
			i++;
		}
		n = i;

		t = max(n, a);
		for (i = 0;i < n;i++)
		{
			if (a[i] == t)
			{
				a[i] = -1;
			}
		}

			t = max(n, a);
		if (t == -1)
		{
			System.out.print("No\n");
		}
		else
		{
			System.out.printf("%d\n",t);
		}
	}

	public static int max(int m, int[] b)
	{
		int i;
		int t;
		t = b[0];
		for (i = 1;i < m;i++)
		{
			if (t < b[i])
			{
				t = b[i];
			}
		}

		return (t);
	}


}

