package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[100];
		int t;
		int[] b = new int[100];
		int[] c = new int[100];
		char[][] h = new char[100][10];
		char[][] h1 = new char[100][10];
		char[][] h2 = new char[100][10];
		String y = new String(new char[10]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int k;
		int i1;
		int j1;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				h[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		i1 = 0;
		j1 = 0;
		for (k = 0;k < n;k++)
		{
			if (a[k] >= 60)
			{
				b[i1] = a[k];
			h1[i1] = h[k];
			i1++;
			}
			else
			{
				c[j1] = a[k];
			h2[j1] = h[k];
			j1++;
			}

		}

		for (j = 0;j < i1 - 1;j++)
		{
			for (i = 0;i < i1 - 1 - j;i++)
			{
				if (b[i] < b[i + 1])
				{
					t = b[i];
					b[i] = b[i + 1];
					b[i + 1] = t;
					y = h1[i];
					h1[i] = h1[i + 1];
					h1[i + 1] = y;
				}
			}
		}

				for (i = 0;i < i1;i++)
				{
					System.out.println(h1[i]);
				}
				for (i = 0;i < j1;i++)
				{
					System.out.println(h2[i]);
				}
	}


}

