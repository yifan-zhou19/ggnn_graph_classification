package <missing>;

public class GlobalMembers
{
	public static int[] num = new int[40];
	public static int[] jinwei = new int[40];
	public static void square() //?2
	{
		for (int i = 39;i > 0;i--)
		{
			int a = num[i] * 2;
			jinwei[i - 1] = a / 10;
			num[i] = a % 10 + jinwei[i];
		}
	}
	public static int Main()
	{
		num[39] = 1; //???2?0??=1
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++) //?n?2
		{
			square();
		}
		int head;
		for (int i = 0;i < 40;i++)
		{
			if (num[i] != 0)
			{
				head = i;
				break;
			}
		}
		for (int i = head;i < 40;i++)
		{
			System.out.print(num[i]);
		}

		return 0;
	}
}

