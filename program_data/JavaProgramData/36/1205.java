package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] c = new int[128];
		int i;
		String str1 = new String(new char[N]);
		String str2 = new String(new char[N]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(c, 0, (Integer.SIZE / Byte.SIZE));
		str1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len1 = str1.length();
		for (i = 0; i < len1; i++)
		{
			c[str1.charAt(i)]++;
		}
		str2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len2 = str2.length();
		for (i = 0; i < len2; i++)
		{
			c[str2.charAt(i)]--;
		}
		for (i = 0; i < 128; i++)
		{
			if (c[i] != 0)
			{
				System.out.print("NO");
				System.out.print("\n");
				return 0;
			}
		}
		System.out.print("YES");
		System.out.print("\n");
		return 0;
	}
}

