package <missing>;

public class GlobalMembers
{
	public static int cmp(int x,int y)
	{
		if (x > y)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		String str1 = new String(new char[260]);
		String str2 = new String(new char[260]);
		String str3 = new String(new char[260]);
		str1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		str2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		str3 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int L = str2.length();
		int len = str1.length();
		int k;
		int i;
		for (i = 0;i < len;i++)
		{
			k = 0;
			while (str2.charAt(k) == str1.charAt(i + k) && k < L)
			{
				k++;
			}
			if (k == L)
			{
				break;
			}
		}
		if (i == len)
		{
			for (int q = 0;q < len;q++)
			{
				System.out.print(str1.charAt(q));
			}
			return 0;
		}
		for (int q = 0;q < i;q++)
		{
			System.out.print(str1.charAt(q));
		}
		System.out.print(str3);
		for (int q = i + str2.length();q < len;q++)
		{
			System.out.print(str1.charAt(q));
		}
		return 0;
	}
}

