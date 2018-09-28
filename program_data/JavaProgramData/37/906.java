package <missing>;

public class GlobalMembers
{
	public static int test(char A, char B)
	{
		if (A == B)
		{
			return 1;
		}
		if (A != B)
		{
			return 0;
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int len;
		int TEST;
		int CHECK = 1;
		int SUM = 0;
		String input = new String(new char[NO]);
		String pinput = input;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				input = tempVar2.charAt(0);
			}
			len = input.length();
			CHECK = 1;
			for (a = 0;a < len && CHECK != 0;a++)
			{
				SUM = 0;
				for (b = 0;b < len;b++)
				{
					if (a != b)
					{
						TEST = test(*(pinput.Substring(a)), *(pinput.Substring(b)));
						SUM += TEST;
					}
				}
				if (SUM == 0)
				{
					System.out.printf("%c\n",*(pinput.Substring(a)));
					CHECK = 0;
				}
			}
			if (CHECK == 1)
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}
}

