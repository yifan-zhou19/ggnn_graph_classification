package <missing>;

public class GlobalMembers
{
	//?????
	//??????
	//?????
	public static int QuLing(int num)
	{
		while (num % 10 == 0)
		{
			num /= 10;
		}
		return num;
	}
	public static void reverse(int num)
	{
		System.out.print(num % 10);
		if (num / 10 != 0)
		{
			reverse(num / 10);
		}
		else
		{
			System.out.print("\n");
		}
	}

	public static int Main()
	{
		int[] a = new int[6];
		for (int i = 0;i < 6;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < 6;i++)
		{
			if (a[i] >= 0)
			{
				reverse(QuLing(a[i]));
			}
			else
			{
				System.out.print("-");
				reverse(QuLing(-a[i]));
			}
		}
		return 0;
	}
}

