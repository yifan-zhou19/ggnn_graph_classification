package <missing>;

public class GlobalMembers
{
	public static void delsuffix(String main, int m)
	{
		main[main.length() - m] = '\0';
	}
	public static int check(String main, int len1, String suffix, int len2)
	{
		int n = len1 - 1;
		int m = len2 - 1;
		while (m >= 0 && main[n].equals(suffix[m]))
		{
			m--;
			n--;
		}
		if (m >= 0)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
	public static void Main()
	{
		int number;
		int i;
		int[] lensuffix = {2, 2, 3};
		String s = new String(new char[30]);
		String[] suffix = {"er", "ly", "ing"};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			number = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= number + 1;i++)
		{
			s = new Scanner(System.in).nextLine();
			int m;
			for (m = 0;m < 3;m++)
			{
				if (check(s, s.length(), suffix[m], lensuffix[m]) != 0)
				{
					delsuffix(s, lensuffix[m]);
					System.out.printf("%s\n",s);
					break;
				}
			}
		}
	}
}

