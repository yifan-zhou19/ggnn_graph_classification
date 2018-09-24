package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[500]);
		String b = new String(new char[500]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int length1 = 0;
		int length2 = 0;
		int c = 0;
		int i = 0;
		int flag1 = 1;
		length1 = a.length();
		length2 = b.length();
		int[] a1 = new int[501];
		int[] b1 = new int[501];
		int[] result = new int[501];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a1,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b1,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(result,0,(Integer.SIZE / Byte.SIZE));
		for (i = 0; i <= length1 - 1; i++)
		{
			a1[length1 - 1 - i] = a.charAt(i) - '0';
		}
		for (i = 0; i <= length2 - 1; i++)
		{
			b1[length2 - 1 - i] = b.charAt(i) - '0';
		}
		for (i = 0; i <= 500; i++)
		{
			result[i] = a1[i] + b1[i] + result[i];
			if (result[i] >= 10)
			{
				result[i + 1] = result[i] / 10 + result[i + 1];
				result[i] = result[i] % 10;
			}
		}
		for (i = 500; i >= 0; i--)
		{
			if (result[i] != 0)
			{
				flag1 = 0;
				break;
			}
		}
		c = i;
		if (flag1 == 0)
		{
			for (i = c; i >= 0; i--)
			{
				System.out.print(result[i]);
			}
			System.out.print("\n");
		}
		if (flag1 == 1)
		{
			System.out.print(0);
			System.out.print("\n");
		}
		return 0;
	}
}

