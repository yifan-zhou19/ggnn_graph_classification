package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] s = new int[20];
		s[0] = s[1] = 1;
		for (int i = 2;i < 20;i++)
		{
			   s[i] = s[i - 1] + s[i - 2]; //???????????20???????????
		}
		int temp; //???????
		for (int j = 0;j < n;j++)
		{
			   temp = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			   System.out.print(s[temp - 1]);
			   System.out.print("\n");
		}
		return 0;
	}
}

