package <missing>;

public class GlobalMembers
{
	public static int judgeChar(char c)
	{
		if (Character.isLetterOrDigit(c) || c == '_')
		{
			return 1;
		}
		return 0;
	}
	public static int judgeChars(tangible.RefObject<String> c, int n)
	{
		int i;
		if ((judgeChar(c.argValue.charAt(0)) == 0) || Character.isDigit(c.argValue.charAt(0)))
		{
			return 0;
		}
		for (i = 1; i < n; i++)
		{
			if (judgeChar(c.argValue.charAt(i)) == 0)
			{
				return 0;
			}
		}
		return 1;
	}

	public static int Main()
	{
		int i;
		int n;
		int[] result = new int[100];
		String c = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		c = new Scanner(System.in).nextLine();
		for (i = 0; i < n; i++)
		{
			c = new Scanner(System.in).nextLine();
		tangible.RefObject<String> tempRef_c = new tangible.RefObject<String>(c);
			result[i] = judgeChars(tempRef_c, c.length());
			c = tempRef_c.argValue;
		}

		if (result[0] != 0)
		{
				System.out.print("yes");
		}
		else
		{
				System.out.print("no");
		}

		for (i = 1; i < n; i++)
		{
			if (result[i] != 0)
			{
				System.out.print("\nyes");
			}
			else
			{
				System.out.print("\nno");
			}
		}
		return 0;
	}

}

