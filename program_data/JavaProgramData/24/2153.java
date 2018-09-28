package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[200][50];
		int n;
		int i;
		int j;
		int q = 0;
		int k;
		int[] r = new int[200];
		int[] b = new int[200];
		char c;
		for (i = 0;i <= 199;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[q] = tempVar.charAt(0);
			}
			c = System.in.read();
			if (c == '\n')
			{
				break;
			}
			q++;
		}
		for (j = 0;j < q + 1;j++)
		{
			r[j] = String.valueOf(a[j]).length();
		 b[j] = r[j];
		}
		for (int x1 = 0;x1 <= q - 1;x1++)
		{
			for (int x2 = x1;x2 <= q;x2++)
			{
				if (r[x1] < r[x2])
				{
					k = r[x1];
					r[x1] = r[x2];
					r[x2] = k;
				}
			}
		}
		for (int w = 0;w <= q;w++)
		{
			if (b[w] == r[0])
			{
					System.out.printf("%s\n",a[w]);
			break;
			}
		}
		for (int e = 0;e <= q;e++)
		{
			if (b[e] == r[q])
			{
				System.out.printf("%s",a[e]);
			break;
			}
		}
		return 0;
	}
}

