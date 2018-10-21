package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] shu = new double[300];
		double ping;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			shu[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		double sum = 0;
		for (int i = 0;i < n;i++)
		{
			sum = sum + shu[i];
		}
		ping = sum / n;
		double temp;
		for (int i = 0;i < n - 1;i++)
		{
			for (int j = i + 1;j < n;j++)
			{
				if (shu[i] > shu[j])
				{
					temp = shu[i];
					shu[i] = shu[j];
					shu[j] = temp;
				}
			}
		}
		double[] cha = new double[300];
		for (int i = 0;i < n;i++)
		{
			cha[i] = Math.abs(ping - shu[i]);
		}
		double max = 0;
		for (int i = 0;i < n;i++)
		{
			if (max <= cha[i])
			{
				max = cha[i];
			}
		}
		int count = 0;
		int flag;
		for (int i = 0;i < n;i++)
		{
			if (max == cha[i])
			{
				count++;
				flag = i;
			}
		}
		if (count == 1)
		{
			System.out.print(shu[flag]);
		}
		else
		{
			for (int i = 0;i < n;i++)
			{
				if (max == cha[i])
				{
					System.out.print(shu[i]);
					flag = i;
					break;
				}
			}
			for (int i = flag + 1;i < n;i++)
			{
				if (max == cha[i])
				{
					System.out.print(',');
					System.out.print(shu[i]);
				}
			}
		}
		return 0;
	}
}

