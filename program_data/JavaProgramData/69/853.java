package <missing>;

public class GlobalMembers
{
	public static final int len = 300;
	public static String a = new String(new char[len]);
	public static String b = new String(new char[len]);
	public static int[] an = new int[len];
	public static int[] bn = new int[len];

	public static int Main()
	{
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(an,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(bn,0,(Integer.SIZE / Byte.SIZE));
		int lena = a.length();
		int lenb = b.length();
		int i = 0;
		int j = 0;
		for (i = lena - 1;i >= 0;i--)
		{
			an[j++] = a.charAt(i) - '0';
		}
		j = 0;
		for (i = lenb - 1;i >= 0;i--)
		{
			bn[j++] = b.charAt(i) - '0';
		}
		for (i = 0;i < 210;i++)
		{
			an[i] += bn[i];
			if (an[i] > 9)
			{
				an[i] -= 10;
				an[i + 1]++;
			}
		}
		i = len - 3;
		while (an[i] == 0 && i > 0)
		{
			i--;
		}
		if (i == 0)
		{
			System.out.print(an[0]);
		}
		else
		{
			for (;i >= 0;i--)
			{
				System.out.print(an[i]);
			}
		}
	}

}

