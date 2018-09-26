package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j = 0;
		int k = 0;
		int m;
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[100];
		char[][] p = new char[100][30];
		char[][] q = new char[100][30];
		char[][] r = new char[100][30];
		char[][] s = new char[1][30];
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
				r[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] >= 60)
			{
				p[j] = r[i];
				b[j] = a[i];
				j++;
			}
			if (a[i] < 60)
			{
				q[k] = r[i];
				c[k] = a[i];
				k++;
			}
		}
		for (k = 0;k < j - 1;k++)
		{
				for (i = 0;i < j - k - 1;i++)
				{
				if (b[i] < b[i + 1])
				{
					m = b[i];
					b[i] = b[i + 1];
					b[i + 1] = m;
					s = p[i];
					p[i] = p[i + 1];
					p[i + 1] = s;
				}
				}

		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%s\n",p[i]);
		}
		for (i = 0;i < n - j;i++)
		{
			System.out.printf("%s\n",q[i]);
		}
	}
}

