package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] in = new int[1000];
		int[] out = new int[1000];
		int num = 1;
		int time = 0;
		int ma = 0;
		int s = 0;
		while (true)
		{
			in[num] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (System.in.read() == '\n')
			{
				break;
			}
			else
			{
				num++;
			}
		}
		num = 1;
		while (true)
		{
			out[num] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (System.in.read() == '\n')
			{
				break;
			}
			else
			{
				num++;
			}
		}
		for (time = 1;time <= 1000;time++)
		{
			s = 0;
			for (int i = 1;i <= num;i++)
			{
				if (in[i] <= time != 0 && out[i]> time)
				{
					s++;
				}
			}
			if (ma < s)
			{
				ma = s;
			}
		}
		System.out.print(num);
		System.out.print(" ");
		System.out.print(ma);
		System.out.print("\n");
		return 0;
	}
}

