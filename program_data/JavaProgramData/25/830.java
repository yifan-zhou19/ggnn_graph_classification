package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[100]);
	public static int[] b = new int[100];
	public static void f(int i)
	{
		int j;
		int k;
		if (i == 0)
		{
			a = tangible.StringFunctions.changeCharacter(a, 100, '1');
		}
		else
		{
			a = tangible.StringFunctions.changeCharacter(a, 100, '1');
			for (j = i; j >= 1; j--)
			{
				for (k = 100; k >= 0; k--)
				{
					a = tangible.StringFunctions.changeCharacter(a, k, (a.charAt(k) - '0') * 2 + '0');
					if (b[k] == 1)
					{
						a.charAt(k)++;
					}
					if (a.charAt(k) - 10 >= '0')
					{
						a.charAt(k) -= 10;
						b[k - 1]++;
					}
				}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				memset(b, 0, (Integer.SIZE / Byte.SIZE));
			}
		}
		for (j = 0; j <= 1000; j++)
		{
			if (a.charAt(j) != '0')
			{
				for (k = j; k <= 100; k++)
				{
					System.out.print(a.charAt(k));
				}
				System.out.print("\n");
				break;
			}
		}
	}
	public static int Main()
	{
		int i;
		i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a, '0', (Character.SIZE / Byte.SIZE));
		f(i);

		return 0;

	}
}

