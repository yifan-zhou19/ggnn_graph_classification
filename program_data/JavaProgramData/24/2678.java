package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] b =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int i = 0;
		int l;
		int n;
		int p;
		int q;
		int max;
		int min;
		int[] c = new int[200];
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		while (scanf("%s",b[i]) != EOF)
		{
		l = String.valueOf(b[i]).length();
		if (b[i][l - 1] == ',')
		{
			b[i][--l] = 0;
		}
		c[i] = l;
		i++;
		}
		n = i - 1;
		p = q = 0;
		max = min = c[0];
		for (i = 1;i <= n;i++)
		{
			if (c[i] > max)
			{
			max = c[i];
			p = i;
			}
			else if (c[i] < min)
			{
				min = c[i];
				q = i;
			}
		}
		System.out.println(b[p]);
		System.out.println(b[q]);
	}

}

