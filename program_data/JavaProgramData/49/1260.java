package <missing>;

public class GlobalMembers
{
	public static void judge(int start, int l)
	{
		int flag = 1;
		for (int i = 0;i < l / 2;i++)
		{
			if (str.charAt(start + i) != str.charAt(start + l - 1 - i))
			{
				flag = 0;
				break;
			}
		}
		if (flag == 1)
		{
			for (int i = start;i < start + l;i++)
			{
				System.out.print(str.charAt(i));
			}
			System.out.print("\n");
		}
	}
	public static String str = new String(new char[505]);
	public static int Main()
	{
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int l = str.length();
		for (int i = 2;i <= l;i++)
		{
			for (int j = 0;j <= l - i;j++)
			{
				judge(j, i);
			}
		}
		return 0;
	}

}

