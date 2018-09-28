package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int p;
		String s = new String(new char[501]);
		char[][] a = new char[500][5];
		int[] c = new int[500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s = new Scanner(System.in).nextLine();
		m = 0;
		p = 0;
		while (s.charAt(p) != '\0')
		{
			p++;
		}
		for (i = 0;i < 500;i++)
		{
			for (j = 0;j < 5;j++)
			{
				a[i][j] = 0;
			}
		}
		for (i = 0;i < p - n + 1;i++)
		{
		   for (j = i;j < i + n;j++)
		   {
			   a[i][j - i] = s.charAt(j);
		   }
		}
	for (i = 0;i < 500;i++)
	{
			c[i] = 0;
	}
		for (i = 0;i < p - n - 1;i++)
		{
			for (j = i;j < p - n + 1;j++)
			{
				if (strcmp(a[j],a[i]) == 0)
				{
				c[i]++;
				}
			}
		}
		for (i = 0;i < p - n;i++)
		{

			if (c[i] > m)
			{
				m = c[i];
			}
		}
		if (m == 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",m);
		for (i = 0;i < p - n;i++)
		{
			if (c[i] == m)
			{
				System.out.printf("%s\n",a[i]);
			}
		}
		}

	}

}

