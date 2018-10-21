package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		int[] b = new int[101];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a, '0', (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b, 0, (Integer.SIZE / Byte.SIZE));
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0)
		{
			a = tangible.StringFunctions.changeCharacter(a, 100, '1');
		}
		else
		{
			a = tangible.StringFunctions.changeCharacter(a, 100, '1');
			for (i = 1; i <= n; i++)
			{
				for (j = 100; j >= 0; j--)
				{
					a = tangible.StringFunctions.changeCharacter(a, j, (a.charAt(j) - '0') * 2 + '0' + b[j]);
					if ((a.charAt(j) - '0') >= 10)
					{
						a.charAt(j) -= 10;
						b[j - 1] = 1;
					}
				}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				memset(b, 0, (Integer.SIZE / Byte.SIZE));
			}
		}
		for (i = 0; i <= 100; i++)
		{
			if (a.charAt(i) != '0')
			{
				for (j = i; j <= 100; j++)
				{
					System.out.print(a.charAt(j));
				}
				System.out.print("\n");
				break;
			}
		}
		return 0;
	}
}

