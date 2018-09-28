package <missing>;

public class GlobalMembers
{
	//**********************************
	//* ????????               *
	//* ??????                   *
	//* ???2010-11-24               *
	//* ?????????             *
	//**********************************
	public static void judge(String n, int i, int len)
	{
		int j = 0;
		for (j = 0; j < len; j++)
		{
			if (!n[i + j].equals(n[i + len - j - 1]))
			{
				return;
			}
		}
		for (j = 0; j < len; j++)
		{
			System.out.print(n[i + j]);
		}
		System.out.print('\n');
		return;
	}
	public static int Main()
	{
		String n = new String(new char[500]);
		char str;
		int i = 0;
		int len = 2;
		n = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (len = 2; len <= n.length(); len++)
		{
			for (i = 0; i <= n.length() - len; i++)
			{
				judge(n, i, len);
			}
		}
		return 0;
	}
}

