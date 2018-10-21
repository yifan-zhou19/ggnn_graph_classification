package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int m;
		int j;
		int k;
		int[] b = new int[501];
		int d;
		int max;
		int h;
		String a = new String(new char[501]);
		char[][] c = new char[501][10];

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	System.in.read();
	a = new Scanner(System.in).nextLine();
	m = a.length();
	for (i = 0;i < m - n + 1;i++)
	{

		b[i] = 0;
		for (j = 0;j < n;j++)
		{
			c[i][j] = a.charAt(i + j);
		}

		for (j = 0;j < m - n + 1;j++)
		{
			d = 0;
			for (k = 0;k < n;k++)
			{
				if (c[i][k] != a.charAt(j + k))
				{
					continue;
				}
				else
				{
					d++;
				}
			}
			if (d == n)
			{
				b[i]++;
			}
		}
	}

	max = 0;
	for (i = 0;i < m + 1 - n;i++)
	{
		if (b[i] == 1)
		{
			b[i] = 0;
		}
		if (b[i] > max)
		{
			max = b[i];
		}
	}
	if (max != 0)
	{
	System.out.printf("%d\n",max);
	}
	for (i = 0;i < m + 1 - n;i++)
	{
		 if (b[i] == max && max != 0)
		 {
			 h = 0;
			 for (j = 0;j < i;j++)
			 {
				 d = 0;
				 for (k = 0;k < n;k++)
				 {
					 if (c[i][k] == c[j][k])
					 {
						 d++;
					 }
				 }
				 if (d == n)
				 {
					 h = 1;
				 }
			 }
			 if (h == 1)
			 {
				 continue;
			 }
			 for (j = 0;j < n - 1;j++)
			 {
				 System.out.printf("%c",c[i][j]);
			 }
			 System.out.printf("%c\n",c[i][n - 1]);
		 }
	}
	 if (max == 0)
	 {
			 System.out.print("NO");
	 }
	return 0;
	}





}

