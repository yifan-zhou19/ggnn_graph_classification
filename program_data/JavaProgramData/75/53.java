package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] time = new int[1001];
		int[] tin = new int[1001];
		int[] tout = new int[1001];
		char a = ',';
		int p_num = 1;
		tin[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while ((a = System.in.read()) != '\n')
		{
			p_num++;
			tin[p_num] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		p_num = 1;
		tout[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while ((a = System.in.read()) != '\n')
		{
			p_num++;
			tout[p_num] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int p = 1; p <= p_num; p++)
		{
			for (int i = tin[p]; i < tout[p]; i++)
			{
				time[i]++;
			}
		}
		int p_max = 0;
		for (int i = 0; i <= 1000; i++)
		{
			if (p_max < time[i])
			{
				p_max = time[i];
			}
		}
		System.out.print(p_num);
		System.out.print(' ');
		System.out.print(p_max);

		return 0;
	}
}

