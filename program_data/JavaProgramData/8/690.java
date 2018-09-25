package <missing>;

public class GlobalMembers
{
	//******************************************
	//?????????
	//??????
	public static int x; //??????
	public static int y;
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static int temp;
	public static int input() //???????
	{
		int k = 0;
		int t = 0;
		int temp = 0;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < x;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int j = 0;j < y;j++)
		{
			b[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		return 0;
	}
	public static int bubble() //???????
	{
		for (int i = 0;i < x - 1;i++)
		{
			for (int t = i + 1;t < x;t++)
			{
				if (a[i] > a[t])
				{
					temp = a[t];
					a[t] = a[i];
					a[i] = temp;
				}
			}
		}
		for (int j = 0;j < y - 1;j++)
		{
			for (int t = j + 1;t < y;t++)
			{
				if (b[j] > b[t])
				{
					temp = b[t];
					b[t] = b[j];
					b[j] = temp;
				}
			}
		}
		return 0;
	}
	public static int combine() //????????????
	{
		for (int i = 0;i < x;i++)
		{
			System.out.print(a[i]);
			System.out.print(' ');
		}
		for (int j = 0;j < y - 1;j++)
		{
			System.out.print(b[j]);
			System.out.print(' ');
		}
		System.out.print(b[y - 1]);
		return 0;
	}
	public static int Main() //???
	{
		input();
		bubble();
		combine();
		return 0;
	}
}

