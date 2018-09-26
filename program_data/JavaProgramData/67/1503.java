package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] cc = new int[n + 1];
		double[] bb = new double[n + 1];
		for (i = 1;i <= n;i++)
		{
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		bb[i] = (double)b / (double)a;
		}
	   for (i = 2;i <= n;i++)
	   {
		if (bb[i] - bb[1] > 0.05)
		{
		cc[i] = 2;
		}
		if (bb[i] - bb[1] < -0.05.getValue() != 0)
		{
		cc[i] = 0;
		}
		if (bb[i] - bb[1] <= 0.05 && bb[i] - bb[1] >= -0.05)
		{
		cc[i] = 1;
		}
	   }
		  for (i = 2;i <= n;i++)
		  {
	   if (cc[i] == 0)
	   {
		System.out.print("worse");
		System.out.print("\n");
	   }
		if (cc[i] == 1)
		{
		System.out.print("same");
		System.out.print("\n");
		}
		if (cc[i] == 2)
		{
		System.out.print("better");
		System.out.print("\n");
		}
		  }
	return 0;
	}
}

