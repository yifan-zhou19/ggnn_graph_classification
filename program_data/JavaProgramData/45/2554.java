package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[30]);
		String str2 = new String(new char[30]);
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		str2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int L = str.length();
		int len = str2.length();
		int k = 0;
		int i;
		for (i = 0;i < len;i++)
		{
			k = 0;
			while (str.charAt(k) == str2.charAt(i + k) && k < L)
			{
				k++;
			}
			if (k == L)
			{
				break;
			}
		}
		System.out.print(i);
		return 0;
	}
}

