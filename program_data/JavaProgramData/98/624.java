package <missing>;

public class GlobalMembers
{
	public static int n; //?????
	public static char[][] words = new char[1000][100]; //?????????
	public static int[] wordlen = new int[1000]; //?????????
	public static int longsum = 0;
	public static void out(int location)
	{
		int i;
		int j;
		for (i = location;i < n;i++)
		{
			longsum = longsum + wordlen[i] + 1;
			if (longsum - 1 > 80)
			{
				for (j = location;j <= i - 2;j++)
				{
					System.out.print(words[j]);
					System.out.print(' ');
				}
				System.out.print(words[i - 1]);
				System.out.print("\n");
				break;
			}
			if (longsum - 1 == 80)
			{
				for (j = location;j <= i - 1;j++)
				{
					System.out.print(words[j]);
					System.out.print(' ');
				}
				System.out.print(words[i]);
				System.out.print("\n");
				i++;
				break;
			}
			if (i == n - 1)
			{
				for (j = location;j < n - 1;j++)
				{
					System.out.print(words[j]);
					System.out.print(' ');
				}
				System.out.print(words[n - 1]);
				System.out.print("\n");
				return;
			}
		}
		longsum = 0;
		location = i;
		out(location);
	}
	public static int Main()
	{
		int i; //????
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			words[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			wordlen[i] = String.valueOf(words[i]).length();
		}
		out(0);
		return 0;
	}
}

