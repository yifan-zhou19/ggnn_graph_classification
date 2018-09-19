package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[] s = {0, 0, 0, 0, 0, 0};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		int i = 0;
		for (i = 5; i >= 1 && s[i] == 0; i--)
		{
			;
		}
		for (; i >= 0; i--)
		{
			System.out.printf("%c", s[i]);
		}
		return 0;
	}

}

