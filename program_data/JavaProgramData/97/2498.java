package <missing>;

public class GlobalMembers
{
	public static int[] money = {100, 50, 20, 10, 5, 1}; //????
	public static int need; //?????
	public static int[] ans = new int[6];
	public static int Main()
	{
		int i = 0;
		need = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (need > 0)
		{
			while (need >= money[i])
			{
				ans[i]++;
				need -= money[i];
			}
			i++;
		} //??????????
		for (i = 0;i < 6;++i)
		{
			System.out.print(ans[i]);
			System.out.print("\n");
		}
		return 0; //?????????
	}

}

