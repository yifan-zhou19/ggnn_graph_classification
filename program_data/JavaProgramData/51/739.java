package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String str = new String(new char[510]);
		char[][] a = new char[510][6];
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str = tempVar2.charAt(0);
		}
		for (int i = 0;i <= (str.length() - n);i++)
		{
			for (int m = i;m <= i + n - 1 ;m++)
			{
				a[i][m - i] = str.charAt(m);
			}
		}
		int[] b = new int[510];
		for (int e = 0;e <= (str.length() - n);e++)
		{
			int l = 0;
			for (int j = e;j <= (str.length() - n);j++)
			{
				if (strcmp(a[e],a[j]) == 0)
				{
				l++;
				}
				else
				{
				l = l;
				}
			}
			b[e] = l;

		}

		int lmax = b[0];
		for (int c = 1;c <= (str.length() - n);c++)
		{
				if (b[c] > lmax)
				{
				lmax = b[c];
				}
				else
				{
					lmax = lmax;
				}
		}

		if (lmax == 1)
		{
		System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",lmax);
		for (int d = 0;d <= (str.length() - n);d++)
		{
				if (b[d] == lmax)
				{
				System.out.printf("%s\n",a[d]);
				}
		}
		}
	}
}

