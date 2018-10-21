package <missing>;

public class GlobalMembers
{
	public static int f(int[] an1, int[] an2)
	{
		int i;
		for (i = 0;i < 201;i++)
		{
			an1[i] = an1[i] + an2[i];
			if (an1[i] >= 10)
			{
				an1[i] = an1[i] - 10;
				an1[i + 1]++;
			}
			if (an1[i] != 0)
			{
				nHighestPos = i;
			}
		}
		return nHighestPos;
	}
	public static int[] an1 = new int[211];
	public static int[] an2 = new int[211];
	public static int nHighestPos = 0;
	public static String num1 = new String(new char[211]);
	public static String num2 = new String(new char[211]);
	public static int Main()
	{
		int i;
		int j;
		int len1;
		int len2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(an1,(Integer.SIZE / Byte.SIZE),0);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(an2,(Integer.SIZE / Byte.SIZE),0);
		num1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		num2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len1 = num1.length();
		len2 = num2.length();
		for (j = 0,i = len1 - 1;i >= 0;i--)
		{
			an1[j++] = num1.charAt(i) - '0';
		}
		for (j = 0,i = len2 - 1;i >= 0;i--)
		{
			an2[j++] = num2.charAt(i) - '0';
		}
		nHighestPos = f(an1, an2);
		for (i = nHighestPos;i >= 0;i--)
		{
			System.out.print(an1[i]);
		}
		return 0;
	}
}

