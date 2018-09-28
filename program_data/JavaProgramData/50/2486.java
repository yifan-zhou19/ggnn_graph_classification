package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int days = 0; //days???????????firstday???????
		int firstday;
		firstday = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (int i = 0;i < 12;i++)
		{
			for (int j = 0;j < i;j++)
			{
				days = days + month[j]; //?????????????
			}
			days = days + 12 + firstday; //????13???????????
			if (days % 7 == 5)
			{
				System.out.print(i + 1);
				System.out.print("\n");
			}
			days = 0;
		}
	}
}

