public class dian
{
		public int a;
		public int b;
		public int c;
}

package <missing>;

public class GlobalMembers
{
		public static dian[] zb = tangible.Arrays.initializeWithDefaultdianInstances(11);
	public static int Main()
	{

		int q;
		int n;
		int i;
		int j;
		int s = 1;
		int[] k1 = new int[50];
		int[] k2 = new int[50];
		int h1;
		double[] k = new double[50];
		double h;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			zb[i].a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			zb[i].b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			zb[i].c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i <= n - 1;i++)
		{
			for (j = i + 1;j <= n;j++)
			{
				k[s] = Math.sqrt((zb[i].a - zb[j].a) * (zb[i].a - zb[j].a) + (zb[i].b - zb[j].b) * (zb[i].b - zb[j].b) + (zb[i].c - zb[j].c) * (zb[i].c - zb[j].c));
				k1[s] = i;
				k2[s] = j;
				s++;
			}
		}
		for (i = 1;i <= n * (n - 1) / 2 - 1;i++)
		{
			for (j = 1;j <= n * (n - 1) / 2 - i;j++)
			{
				if (k[j] < k[j + 1])
				{
					h = k[j];
					k[j] = k[j + 1];
					k[j + 1] = h;
					h1 = k1[j];
					k1[j] = k1[j + 1];
					k1[j + 1] = h1;
					h1 = k2[j];
					k2[j] = k2[j + 1];
					k2[j + 1] = h1;
				}
			}
		}
		for (i = 1;i <= n * (n - 1) / 2;i++)
		{
			System.out.print("(");
			System.out.print(zb[k1[i]].a);
			System.out.print(",");
			System.out.print(zb[k1[i]].b);
			System.out.print(",");
			System.out.print(zb[k1[i]].c);
			System.out.print(")-(");
			System.out.print(zb[k2[i]].a);
			System.out.print(",");
			System.out.print(zb[k2[i]].b);
			System.out.print(",");
			System.out.print(zb[k2[i]].c);
			System.out.print(")=");
			System.out.printf("%.2f",k[i]);
			System.out.print("\n");
		}
		q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}
}

