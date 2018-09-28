package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		float a = 0F;
		float b = 0F;
		float c = 0F;
		float d = 0F;
		int[] x = new int[n];
		for (int i = 0;i < n;i++)
		{
				x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int j = 0;j < n;j++)
		{
				if (x[j] >= 1 && x[j] <= 18)
				{
					a++;
				}
				else if (x[j] >= 19 && x[j] <= 35)
				{
					b++;
				}
				else if (x[j] >= 36 && x[j] <= 60)
				{
					c++;
				}
				else if (x[j] > 60)
				{
					d++;
				}
		}
		float a1 = 100.0 * a / n;
		float b1 = 100.0 * b / n;
		float c1 = 100.0 * c / n;
		float d1 = 100.0 * d / n;
		System.out.printf("1-18: %.2f%%\n", a1);
		System.out.printf("19-35: %.2f%%\n", b1);
		System.out.printf("36-60: %.2f%%\n", c1);
		System.out.printf("60??: %.2f%%\n", d1);
		return 0;
	}

}

