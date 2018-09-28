package <missing>;

public class GlobalMembers
{
	public static int[] aa = {100, 50, 20, 10, 5, 1};
	public static int Main()
	{
		int x;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < 7;i++)
		{
				int s = x / aa[i];
				System.out.print(s);
				System.out.print("\n");
				x = x % aa[i];
		}
		return 0;
	}


}

