package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int i;
		int[] date = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		int sum = 0;
		w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < 12;i++)
		{
			sum += date[i];
			if (w <= 5)
			{
				if ((sum + w + 7) % 7 == 0)
				{
					System.out.print(i + 1);
					System.out.print("\n");
				}
			}
			else
			{
				if ((w + sum) % 7 == 0)
				{
					System.out.print(i + 1);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

