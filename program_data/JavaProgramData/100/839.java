package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String input = new String(new char[300]);
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			input = tempVar.charAt(0);
		}
		int[] cishu = new int[26];
		for (i = 0;i < 26;i++)
		{
			cishu[i] = 0;
		}
		int LEN;
		LEN = input.length();
		for (i = 0;i < LEN;i++)
		{
			if (input.charAt(i) >= 97 && input.charAt(i) <= 122)
			{

				cishu[input.charAt(i) - 97] += 1;
			}
		}
	int result = 0;
		for (i = 0;i < 26;i++)
		{
			if (cishu[i] == 0)
			{
				result += 0;
			}
			if (cishu[i] != 0)
			{
				result += 1;
			}
		}
	if (result != 0)
	{
			for (i = 0;i < 26;i++)
			{
			if (cishu[i] != 0)
			{
			System.out.printf("%c=%d\n",i + 97,cishu[i]);
			}
			}
	}
	else
	{
		System.out.print("No\n");
	}

	return 0;
	}

}

