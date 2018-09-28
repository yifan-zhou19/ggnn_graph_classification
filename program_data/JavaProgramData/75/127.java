package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int time;
		int count = 0;
		int[] a = new int[1001];
		int i;
		char b;
		while (true)
		{
			time = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[time]++;
			count++;
			if (System.in.read() != ',')
			{
				break;
			}
		}
		for (i = 0;i < count;++i)
		{
			time = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = ConsoleInput.readToWhiteSpace(true).charAt(0);
			a[time]--;
		}
		int max = 0;
		int renshu = 0;
		for (i = 0;i < 1001;++i)
		{
			renshu += a[i];
			if (renshu > max)
			{
				max = renshu;
			}
		}
		System.out.print(count);
		System.out.print(" ");
		System.out.print(max);
		return 0;
	}

}

