package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int[] a = new int[10000];
	int[] b = new int[10000];
	int m;
	int[] x = new int[100];
	int[] y = new int[100];
	int[] z = new int[100];
	float[] dis = new float[10000];
	float t;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1; i <= n; i++)
	{
		x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		z[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	int cnt = 0;
	for (i = 1; i <= n; i++)
	{
		for (j = i + 1; j <= n; j++)
		{
			dis[cnt] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]));
			a[cnt] = i;
			b[cnt] = j;
			cnt = cnt + 1;
		}
	}


	for (i = 0; i < cnt - 1; i++)
	{
		for (j = 0; j < cnt - 1 - i; j++)
		{
			if (dis[j] < dis[j + 1])
			{
				t = dis[j];
				dis[j] = dis[j + 1];
				dis[j + 1] = t;
				m = a[j];
				a[j] = a[j + 1];
				a[j + 1] = m;
				m = b[j];
				b[j] = b[j + 1];
				b[j + 1] = m;
			}
		}
	}
	for (i = 0; i < cnt; i++)
	{
		System.out.printf("%.2f", "(");
		System.out.printf("%.2f", x[a[i]]);
		System.out.printf("%.2f", ",");
		System.out.printf("%.2f", y[a[i]]);
		System.out.printf("%.2f", ",");
		System.out.printf("%.2f", z[a[i]]);
		System.out.printf("%.2f", ")-(");
		System.out.printf("%.2f", x[b[i]]);
		System.out.printf("%.2f", ",");
		System.out.printf("%.2f", y[b[i]]);
		System.out.printf("%.2f", ",");
		System.out.printf("%.2f", z[b[i]]);
		System.out.printf("%.2f", ")=");
		System.out.printf("%.2f", dis[i]);
		System.out.printf("%.2f", "\n");
	}
	return 0;
	}
}

