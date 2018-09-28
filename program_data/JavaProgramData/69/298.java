package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[300]);
	public static String b = new String(new char[300]);
	public static String x = new String(new char[300]);
	public static String y = new String(new char[300]);
	public static int[] he = new int[300];
	public static int l;
	public static int Main()
	{
		int i;
		int j;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		if (a.length() == 1 && b.length() == 1 && a.charAt(0) == '0' && b.charAt(0) == '0')
		{
			System.out.print("0");
			System.out.print("\n");
		}
		else
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(he,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(x,'0',(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(y,'0',(Character.SIZE / Byte.SIZE));
			for (i = 0;i < a.length();i++)
			{
				x = tangible.StringFunctions.changeCharacter(x, a.length() - i - 1, a.charAt(i));
			}
			for (i = 0;i < b.length();i++)
			{
				y = tangible.StringFunctions.changeCharacter(y, b.length() - i - 1, b.charAt(i));
			}
			if (a.length() > b.length())
			{
				l = a.length();
				for (i = b.length();i < a.length();i++)
				{
					y = tangible.StringFunctions.changeCharacter(y, i, '0');
				}
			}
			else
			{
				l = b.length();
				for (i = a.length();i < b.length();i++)
				{
					x = tangible.StringFunctions.changeCharacter(x, i, '0');
				}
			}
			for (i = 0;i < l;i++)
			{
				he[i] = he[i] + ((int)x.charAt(i) - 48) + ((int)y.charAt(i) - 48);
				if (he[i] >= 10)
				{
					he[i + 1]++;
					he[i] = he[i] % 10;
				}
			}
			for (i = 299;i >= 0;i--)
			{
				if (he[i] != 0)
				{
					break;
				}
			}
			for (j = i;j >= 0;j--)
			{
				System.out.print(he[j]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

