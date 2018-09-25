package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		float m;
		float max = 0F;
		float min = 1000000F;
		float sum = 0F;
		float ave;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			m = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			sum += m;
			if (max < m)
			{
				max = m;
			}
			if (min > m)
			{
				min = m;
			}
		}
		ave = sum / n;
		if (2 * ave < max + min)
		{
			System.out.print(max);
			System.out.print("\n");
		}
		else if (2 * ave > max + min)
		{
			System.out.print(min);
			System.out.print("\n");
		}
		else
		{
			System.out.print(min);
			System.out.print(",");
			System.out.print(max);
			System.out.print("\n");
		}
		return 0;
	}
}

