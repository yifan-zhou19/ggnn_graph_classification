package <missing>;

public class GlobalMembers
{
		public static int Main()
		{
			int[] a = new int[100];
			int[] e = new int[100];
			int[] f = new int[100];
			char[][] c = new char[100][100];
			char[][] b = new char[100][100];
			char[][] d = new char[100][100];
			String x = new String(new char[100]);
			int n;
			int p = -1;
			int q = -1;
			int k;
			int z;
			int i;
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
						  c[i] = tempVar2.charAt(0);
					  }
					  String tempVar3 = ConsoleInput.scanfRead(" ");
					  if (tempVar3 != null)
					  {
						  a[i] = Integer.parseInt(tempVar3);
					  }
				if (a[i] >= 60)
				{
					p++;
					e[p] = a[i];
					b[p] = c[i];
				}
				if (a[i] < 60)
				{
					q++;
					f[q] = a[i];
					d[q] = c[i];
				}
			}

		for (k = 1;k <= p + 1;k++)
		{
			for (i = 0;i < p + 1 - k;i++)
			{
				if (e[i] < e[i + 1])
				{
					z = e[i];
					e[i] = e[i + 1];
					e[i + 1] = z;
				x = b[i];
				b[i] = b[i + 1];
				b[i + 1] = x;
				}

			}
		}
		for (i = 0;i <= p;i++)
		{
			System.out.printf("%s\n",b[i]);
		}
		for (i = 0;i <= q;i++)
		{
			System.out.printf("%s\n",d[i]);
		}

		return 0;
		}
}

