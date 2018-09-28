package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (num != 0)
		{
		int fail;
		fail = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (fail == 0)
		{
			System.out.print("60");
			System.out.print("\n");
		}
		else
		{
		int[] n = new int[fail];
		for (int i = 0;i < fail;i++)
		{
			n[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int t = 0;
		for (int i = 0;i < fail;i++)
		{
			t = n[i] + 3 * (i + 1);
			if (63 > t && t > 60)
			{
				System.out.print(n[i]);
				System.out.print("\n");
				break; //????3????
			}
			else if (t >= 63)
			{
				System.out.print(60 - 3 * i);
				System.out.print("\n");
				break; //??
			}
			else if (i == fail - 1)
			{
				System.out.print(60 - 3 * (i + 1));
				System.out.print("\n");
			}
		}
		}
		num--;
		}
		return 0;
	}
}

