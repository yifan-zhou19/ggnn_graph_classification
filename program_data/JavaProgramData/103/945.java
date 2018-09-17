package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000]);
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (int i = 0;i < str.length();i++)
		{
			if ((str.charAt(i) >= 'a') && (str.charAt(i) <= 'z'))
			{
				str.charAt(i) -= 32;
			}
		}
		for (int i = 0;i < str.length();i++)
		{
			System.out.print('(');
			System.out.print(str.charAt(i));
			System.out.print(',');
			int j = 1;
			while (str.charAt(i + j) == str.charAt(i))
			{
				j++;
			}
			System.out.print(j);
			System.out.print(')');
			i += (j - 1);
		}
		System.out.print("\n");
		return 0;
	}
}

