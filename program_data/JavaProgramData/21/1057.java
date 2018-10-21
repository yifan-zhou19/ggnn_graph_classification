package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] s = new int[310];
		int temp;
		int y = 0;
		double sum = 0;
		double p;
		double c;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			s[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum += s[i];
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (s[j] > s[j + 1])
				{
					temp = s[j];
					s[j] = s[j + 1];
					s[j + 1] = temp;
				}
			}
		}
		p = sum / ((double)n);
		if (p - s[0] < s[n - 1] - p)
		{
			c = s[n - 1] - p;
		}
		else
		{
			c = p - s[0];
		}
		for (i = 0;i < n;i++)
		{
			if (Math.abs(p - s[i] - c) < 1e-9 || Math.abs(s[i] - p - c) < 1e-9)
			{
				if (y != 0)
				{
					System.out.print(",");
				}
				y++;
				System.out.print(s[i]);
			}
		}
		return 0;
	}
}

