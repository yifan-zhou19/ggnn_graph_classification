package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //n??????i,j??????t??????????q,s?????????????
		int i;
		int j;
		int t;
		int q;
		int s;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		t = n * (n - 1) / 2; //??t
		int[] x = new int[n + 1]; //???????a[n+1],b[n+1]??????????????
		int[] y = new int[n + 1];
		int[] z = new int[n + 1];
		int[] a = new int[t + 1];
		int[] b = new int[t + 1];
		float[] dis = new float[t + 1]; //???p?????
		float p;
		for (i = 1;i <= n;i++) //?????????
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			z[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i <= n - 1;i++) //???????????????????????
		{
			for (j = i + 1;j <= n;j++)
			{
				dis[(2 * n - i) * (i - 1) / 2 + j - i] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]));
				a[(2 * n - i) * (i - 1) / 2 + j - i] = i;
				b[(2 * n - i) * (i - 1) / 2 + j - i] = j;
			}
		}
		for (j = 1;j <= t;j++) //????
		{
			for (i = 1;i <= t;i++)
			{
				if (dis[i] < dis[i + 1])
				{
					p = dis[i];
					dis[i] = dis[i + 1];
					dis[i + 1] = p;
					q = a[i];
					a[i] = a[i + 1];
					a[i + 1] = q;
					s = b[i];
					b[i] = b[i + 1];
					b[i + 1] = s;
				}
			}
		}
		for (i = 1;i <= t;i++) //????
		{
			System.out.print("(");
			System.out.print(x[a[i]]);
			System.out.print(",");
			System.out.print(y[a[i]]);
			System.out.print(",");
			System.out.print(z[a[i]]);
			System.out.print(")-(");
			System.out.print(x[b[i]]);
			System.out.print(",");
			System.out.print(y[b[i]]);
			System.out.print(",");
			System.out.print(z[b[i]]);
			System.out.print(")=");
			System.out.printf("%.2f", dis[i]);
			System.out.printf("%.2f", "\n");
		}
		return 0;
	}

}

