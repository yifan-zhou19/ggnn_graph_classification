package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		int i;
		int[] c = new int[301];
		int t = 300;
		int flag = 0;
		double aver;
		double[] a = new double[301];
		double[] b = new double[301];
		double sum = 0.0;
		double max;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < num; i++)
		{
			a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			sum = sum + a[i];
		}
		aver = sum / (double)num;
		max = 0;
		for (i = 0; i < num; i++)
		{
			b[i] = Math.abs(a[i] - aver);
			if ((b[i] - max) > 0)
			{

				max = b[i];
				c[t] = 0;
				t = i;
				c[i] = 1;
			}
		}
		for (i = 0; i < num; i++)
		{
			if (c[i] == 1 || Math.abs((double)b[i] - max) < 1e-9)
			{
				if (flag == 0)
				{
					System.out.print(a[i]);
					flag++;
				}
				else
				{
					System.out.print(",");
					System.out.print(a[i]);
				}
			}
		}
		i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}

}

