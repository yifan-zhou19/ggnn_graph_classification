package <missing>;

public class GlobalMembers
{
	public static final int maxlen = 255;
	public static int Main()
	{
		String str1 = new String(new char[maxlen]);
		String str2 = new String(new char[maxlen]);
		int[] a1 = new int[maxlen];
		int[] a2 = new int[maxlen];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a1,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a2,0,(Integer.SIZE / Byte.SIZE));
		str1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		str2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (int i = 0;i < str1.length();i++)
		{
			a1[i] = str1.charAt(str1.length() - 1 - i) - '0';
		}
		for (int i = 0;i < str2.length();i++)
		{
			a2[i] = str2.charAt(str2.length() - 1 - i) - '0';
		}
		int pos = 0;
		for (int i = 0;i < maxlen - 1;i++)
		{
			int temp = a1[i] + a2[i];
			if (temp >= 10)
			{
				a1[i] = temp % 10;
				a1[i + 1] += 1;
			}
			else
			{
				a1[i] = temp;
			}
			if (a1[i] != 0)
			{
				pos = i;
			}
		}
		for (int i = pos;i >= 0;i--)
		{
			System.out.print(a1[i]);
		}
		System.out.print("\n");
		return 0;
	}
}

