package <missing>;

public class GlobalMembers
{
	public static int cmp(Object p1, Object p2)
	{
		return 0;
	}

	public static String a = new String(new char[255]);
	public static String b = new String(new char[255]);
	public static int[] an = new int[255];
	public static int[] bn = new int[255];
	public static int[] c = new int[255];

	public static int Main()
	{
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(an, 0, 255);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(bn, 0, 255);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(c, 0, 255);

		int la = a.length();
		int lb = b.length();

		for (int i = la - 1; i >= 0; i--)
		{
			an[la - 1 - i] = a.charAt(i) - '0';
		}
		for (int i = lb - 1; i >= 0; i--)
		{
			bn[lb - 1 - i] = b.charAt(i) - '0';
		}

		//for (int i = 0; i < la; i ++)
		//	cout << an[i];
		//cout << endl;
		//for (int i = 0; i < lb; i ++)
		//	cout << bn[i];

		int pos = 0;
		for (int i = 0; i < la || i < lb; i++)
		{
			if (an[i] + bn[i] + c[i] >= 10)
			{
				c[i] = an[i] + bn[i] + c[i] - 10;
				c[i + 1]++;
			}
			else
			{
				c[i] = an[i] + bn[i] + c[i];
			}
		}
		int i = 254;
		while (i >= 0 && c[i] == 0)
		{
			i--;
		}

		if (i < 0)
		{
			i = 0;
		}

		while (i >= 0)
		{
			System.out.print(c[i]);
			i--;
		}
		System.out.print("\n");
		return 0;
	}
}

