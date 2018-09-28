package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int ii = 0;
		int j;
		int k;
		int[] num = new int[511];
		int p = 0;
		int q = 0;
		int s = 0;
		int v;
		int mm;
		int nn;
		String a = new String(new char[511]);
		char[][] b = new char[511][511];
		String max = new String(new char[511]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		System.in.read();
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0;i <= n - m;i++)
		{
			ii = 0;
		for (j = 0;j < m;)

		{
			b[p][j] = a.charAt(i + ii);
			ii += 1;

			j += 1;
		}


		b[p][j] = '\0';

					p += 1;

		}
		for (q = 0;q <= n - m;q++)
		{
			for (s = q;s <= n - m;s++)
			{
				if (strcmp(b[q],b[s]) == 0)
				{
					num[q] += 1;
				}
			}
		}
		mm = num[0];
		for (v = 0;v <= n - m;v++)
		{
			if (num[v] > mm)
			{
				mm = num[v];
			}
		}
		if (mm > 1)
		{
			System.out.printf("%d\n",mm);
			for (v = 0;v <= n - m;v++)
			{
				if (num[v] == mm)
				{
					System.out.printf("%s\n",b[v]);

				}
			}
		}
		else
		{
			System.out.print("NO");
		}
		return 0;
	}

}

