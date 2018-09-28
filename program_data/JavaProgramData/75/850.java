package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[1000];
		int[] y = new int[1000];
		int[] present = new int[1000];
		int max = 0;
		int i = 0;
		int j = 0;
		int num;
		x[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (System.in.read() == ',')
		{
			x[i + 1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			i++;
		}
		y[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		i = 0;
		while (System.in.read() == ',')
		{
			y[i + 1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			i++;
		} //????????????
		num = i + 1;
		for (i = 0;i < 1000;i++) //?????????????
		{
			for (j = 0;j < num;j++)
			{
				if ((i + 0.5) >= x[j] != 0 && (i + 0.5) < y[j])
				{
					present[i] += 1;
				}
			}
			if (present[i] > max) //????????
			{
				max = present[i];
			}
		}
		System.out.print(num);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}

