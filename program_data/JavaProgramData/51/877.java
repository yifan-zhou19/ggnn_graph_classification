package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String s = new String(new char[1000]);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		int len = s.length();

		char[][] t = new char[600][10];
		int i;
		int j;
		int k;




		k = 0;
		for (i = 0;k + n <= len;i++)
		{
		for (j = 0;j < n;j++)
		{
			t[i][j] = s.charAt(k);
			k++;
			if (j == n - 1)
			{
				k = k + 1 - n;
			}

		}
		}

		int m;
		m = i;

		int[] a = new int[600];
		for (i = 0;i < 600;i++)
		{
			a[i] = 1;
		}
		for (i = 0;i < m;i++)
		{
			if (a[i] != -1)
			{
				for (j = i + 1;j < m;j++)
				{
			if (strcmp(t[i],t[j]) == 0)
			{
				a[i] += 1;
				a[j] = -1;
			}
				}
			}
		}

		for (i = 0;i < m;i++)
		{
			for (j = m - 1;j > i;j--)
			{
				if (a[j - 1] < a[j])
				{
					int c;
					String exc = new String(new char[10]);
					c = a[j - 1];
					a[j - 1] = a[j];
					a[j] = c;
					exc = t[j - 1];
					t[j - 1] = t[j];
					t[j] = exc;
				}
			}
		}

		if (a[0] == 1)
		{
			System.out.print("NO");
		}
		else
		{
			for (i = 0;a[i] == a[0];i++)
			{
				;
			}
			System.out.printf("%d\n",a[0]);
			for (j = 0;j < i;j++)
			{
				System.out.printf("%s\n",t[j]);
			}
		}






	}

}

