package <missing>;

public class GlobalMembers
{
	public static String array = new String(new char[N]);
	public static int Main()
	{
		array = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len = array.length();
		for (int t = 2; t <= len; t++) //?????????
		{
		for (int i = 0; i <= len - t; i++)
		{
			int sum = 0;
			for (int j = 0; j < t / 2; j++) //?????????
			{
				if (array.charAt(i + j) == array.charAt(i + t - 1 - j))
				{
					sum++;
				}
			}
			if (sum == t / 2) //?
			{
				for (int j = i; j < i + t; j++)
				{
				System.out.print(array.charAt(j));
				}
				System.out.print("\n");
			}
		}
		}
		return 0;
	}
}

