package <missing>;

public class GlobalMembers
{
	public static final String s1 = "";
	public static final String s2 = "";
	public static final String out = "";
	public static int[] used = new int[10];
	public static int length = 0;
	public static int x = 0;
	public static int sum = 0;
	public static void ranker(int n)
	{
		for (int i = 0;i < length;i++)
		{
			if (used[i] == 0)
			{
				out = tangible.StringFunctions.changeCharacter(out, n, s1.charAt(i));
				used[i] = 1;
				ranker(n + 1);
				used[i] = 0;
			}
		}
		if (n == length - 1)
		{
			if (strcmp(out,s2) == 0)
			{
				x = 1;
			}
			else
			{
				x = 0;
			}
			sum = sum + x;
		}
	}
	public static int Main()
	{
		s1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		s2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int i;
		for (i = 0;i < 10;i++)
		{
			if (s1.charAt(i) != '\0')
			{
				length++;
			}
		}
		ranker(0); //????????
		if (sum != 0)
		{
			System.out.print("YES");
			System.out.print("\n");
		}
		else
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		return 0;
	}
}

