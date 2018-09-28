package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int m;
		int t;
		int[] b = new int[100];
		int[] e = new int[100];
		char[][] a = new char[100][20];
		char[][] c = new char[100][20];
		char[][] d = new char[100][20];
		String str = new String(new char[20]);
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
				a[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0,j = 0,k = 0;i < n;i++)
		{
			if (b[i] >= 60)
			{
				c[j] = a[i];
				e[j] = b[i];
				j++;
			}
			else
			{
				d[k] = a[i];
				k++;
			}
		}
		for (i = 0;i < j - 1;i++)
		{
			for (m = 0;m < j - 1 - i;m++)
			{
				if (e[m] < e[m + 1])
				{
					t = e[m];
					e[m] = e[m + 1];
					e[m + 1] = t;
					str = c[m];
					c[m] = c[m + 1];
					c[m + 1] = str;
				}
			}
		}
		for (i = 0;i < j;i++)
		{
		System.out.printf("%s\n",c[i]);
		}
		for (i = 0;i < k;i++)
		{
		System.out.printf("%s\n",d[i]);
		}
		System.in.read();
		System.in.read();
	}
}

