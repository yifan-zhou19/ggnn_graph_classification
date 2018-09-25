package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String S = new String(new char[1000]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(S,0,(Character.SIZE / Byte.SIZE));

		S = ConsoleInput.readToWhiteSpace(true).charAt(0);

		int LEN = S.length();
		int nn = 0;
		char n = '0';
		for (int i = 0;i <= LEN;i++)
		{
			char de = (Character.isUpperCase(S.charAt(i)) == 1) ? S.charAt(i) : Character.toUpperCase(S.charAt(i));
			if (n == '0' || de != n || i == LEN)
			{
				if (n != '0')
				{
					System.out.print('(');
					System.out.print(n);
					System.out.print(',');
					System.out.print(nn);
					System.out.print(')');
				}
				n = de;
				nn = 1;
			}
			else
			{
				nn++;
			}
		}

		return 0;
	}

}

