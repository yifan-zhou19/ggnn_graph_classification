package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] yeah = new int[100]; //??????
		for (int i = 1 ; i <= n ; i++)
		{
			yeah[i - 1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = n ; i >= 2 ; i--)
		{
			System.out.print(yeah[i - 1]);
			System.out.print(" ");
		}
		System.out.print(yeah[0]);
		return 0;
	}
	// ( > w < ) finished~

}

