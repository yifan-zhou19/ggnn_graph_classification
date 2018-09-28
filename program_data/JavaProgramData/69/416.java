package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[] num1 = new int[256];
		int[] num2 = new int[256];
		int[] ans = new int[256];
		String str = new String(new char[256]);
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = str.length();i >= 0;--i)
		{
			num1[i] = str.charAt(str.length() - i) - '0';
		}
		 str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = str.length();i >= 0;--i)
		{
			num2[i] = str.charAt(str.length() - i) - '0';
		}
		for (i = 0;i < 255;++i)
		{
			ans[i] = num1[i] + num2[i];
		}
		for (i = 0;i < 255;++i)
		{
			if (ans[i] >= 10)
			{
				ans[i + 1]++;
				ans[i] -= 10;
			}
		}
		for (i = 255;i >= 0;--i)
		{
			if (ans[i] != 0)
			{
				break;
			}
		}
		if (i == 0)
		{
			System.out.print(0);
			System.out.print("\n");
		}
		else
		{
			for (;i > 0;--i)
			{
				System.out.print(ans[i]);
			}
			System.out.print("\n");
		}
		return 0;
	}

}

