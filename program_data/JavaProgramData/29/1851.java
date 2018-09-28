package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  double t = 2.0;
	  double[] sum = new double[128];
	  int i;
	  sum[1] = t;
	  for (i = 2; i < 128; ++i)
	  {
		t = 1.0 / t + 1;
		sum[i] = sum[i - 1] + t;
	  }
	  int n;
	  int m;
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  while (scanf("%d", m) != EOF)
	  {
		System.out.printf("%.3lf\n", sum[m]);
	  }
	  return 0;
	}
}

