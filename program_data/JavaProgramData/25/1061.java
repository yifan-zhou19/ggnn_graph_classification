package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String a = new String(new char[200]);
		int len;
		int p = 0;
		int q = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Character.SIZE / Byte.SIZE));
		a = tangible.StringFunctions.changeCharacter(a, 0, '2');
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0)
		{
			System.out.print("1");
			System.out.print("\n");
		}
		else
		{
			for (int i = 1; i < n; i++)
			{
				len = a.length();
				for (int j = 0; j < len; j++)
				{
					p = a.charAt(j) - '0';
					a = tangible.StringFunctions.changeCharacter(a, j, (char)((p * 2) % 10 + '0' + q));
					q = (p * 2) / 10;
				}
				if (q > 0)
				{
					a = tangible.StringFunctions.changeCharacter(a, len, (char)(q + '0'));
				}
				p = 0;
				q = 0;
			}
			len = a.length();
			for (int i = len - 1; i >= 0; i--)
			{
				System.out.print(a.charAt(i));
			}
		}
		return 0;
	}
}

