package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int time;
		int count = 0;
		int[] a = new int[1001];
		while (true)
		{
			time = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[time] = a[time] + 1; //???????????????1
			count = count + 1;
			if (System.in.read() != ',')
			{
				break;
			}
		}
		int i;
		char c;
		for (i = 0; i < count; ++i)
		{
			time = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c = ConsoleInput.readToWhiteSpace(true).charAt(0);
			a[time] = a[time] - 1; //???????????????1
		}
		int p = 0;
		int max = 0;
		for (i = 0; i < 1001; ++i)
		{
			p = p + a[i];
			if (p > max) //???????????????
			{
				max = p;
			}
		}
		System.out.print(count);
		System.out.print(' ');
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}


}

