package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] flag = new int[1000];
		for (int i = 0;i < 1000;i++)
		{
			flag[i] = 0;
		}
		int x;
		int n = 1;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		flag[x]++;
		while (System.in.read() == ',')
		{
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n++;
			flag[x]++;
		} //????????
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		flag[x]--;
		while (System.in.read() == ',')
		{
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			flag[x]--;
		} //????????
		int max = 0;
		int now = 0;
		for (int i = 0;i < 1000;i++)
		{
			now += flag[i];
			if (max < now)
			{
				max = now;
			}
		} //??????
		System.out.print(n);
		System.out.print(' ');
		System.out.print(max);
		return 0;
	}
}

