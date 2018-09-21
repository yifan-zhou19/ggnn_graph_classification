package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int l;
		int j;
		int[] a = new int[100];
		int[] b = new int[100];
		String e = new String(new char[100]);
		char[][] c = new char[100][100];
		char[][] d = new char[100][100];
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
				c[i] = tempVar2.charAt(0);
			}
			d[i] = c[i];
			a[i] = String.valueOf(c[i]).length();
			b[i] = a[i];
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (a[j] > a[i])
				{
					l = a[i];
					a[i] = a[j];
					a[j] = l;
					e = d[i];
					d[i] = d[j];
					d[j] = e;
				}
			}
		}
		if (a[0] > a[1])
		{
			System.out.printf("%s\n",d[0]);
		}
		else
		{
			for (i = 0;i < n;i++)
			{
				if (b[i] == a[0])
				{
					System.out.printf("%s\n",c[i]);
					break;
				}
			}
		}
		if (a[n - 1] < a[n - 2])
		{
			System.out.printf("%s\n",d[n - 1]);
		}
		else
		{
			for (i = 0;i < n;i++)
			{
				if (b[i] == a[n - 1])
				{
					System.out.printf("%s\n",c[i]);
					break;
				}
			}
		}
		return 0;
	}
}

