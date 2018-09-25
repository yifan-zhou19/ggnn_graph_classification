package <missing>;

public class GlobalMembers
{
		public static String a = new String(new char[302]);
		public static int[] flag = new int[302];
		public static int[] upper = new int[27];
		public static int[] lower = new int[27];
		public static int len;
		public static int t = 0;
	public static void get()
	{
		int i;
		a = new Scanner(System.in).nextLine();
		len = a.length();
		for (i = 0;i < 27;i++)
		{
			upper[i] = 0;
			lower[i] = 0;
		}
	}
	public static void arrange()
	{
		int i;
		int j = 0;
		for (i = 0;i < len;i++)
		{
			if (Character.isUpperCase(a.charAt(i)))
			{
				flag[i] = 1;
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 'A' + 1);
			}
			else if (Character.isLowerCase(a.charAt(i)))
			{
				flag[i] = -1;
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 'a' + 1);
			}
			else
			{
				j++;
			}
		}
			if (j == i)
			{
				t = 1;
			}
		for (i = 0;i < len;i++)
		{
			if (flag[i] == 1)
			{
				upper[a.charAt(i)] = upper[a.charAt(i)] + 1;
			}
			else if (flag[i] == -1)
			{
				lower[a.charAt(i)] = lower[a.charAt(i)] + 1;
			}




		}

	}

	public static void put()
	{
		int i;
		int j = 0;
		for (i = 1;i <= 26;i++)
		{
			if (upper[i] != 0)
			{
				System.out.printf("%c=%d\n",i + 'A' - 1,upper[i]);
			}
		}
		for (i = 1;i <= 26;i++)
		{
			if (lower[i] != 0)
			{
				System.out.printf("%c=%d\n",i - 1 + 'a',lower[i]);
			}
		}
		if (t != 0)
		{
			System.out.print("No");
		}
	}
	public static void Main()
	{
		get();
		arrange();
		put();
	}

}

