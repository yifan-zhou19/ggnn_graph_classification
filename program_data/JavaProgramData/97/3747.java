package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		int j;
		int i;
		int[] an = {100, 50, 20, 10, 5, 1};
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(num / an[0]);
		System.out.print("\n");
		for (i = 1;i < 6;i++)
		{
		num = num - num / an[i - 1] * an[i - 1];
		System.out.print(num / an[i]);
		System.out.print("\n");
		}
		return 0;
	}
}

