package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] weishu = {-1, -1, -1, -1, -1};
		int num;
		int i = 0;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		do
		{
			weishu[i] = num % 10;
			num = num / 10;
			i++;
		}while (num > 0);
		for (i = 0; i < 5; i++)
		{
			if (weishu[i] != -1)
			{
				System.out.print(weishu[i]);
			}
		}
		return 0;
	}
}

