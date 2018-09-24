package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[300];
	public static int[] b = new int[300];
	public static int[] c = new int[300];

	public static int Main()
	{
		String aa = new String(new char[300]);
		String bb = new String(new char[300]);
		aa = ConsoleInput.readToWhiteSpace(true).charAt(0);
		bb = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int lena = aa.length();
		int lenb = bb.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a, 0, 260);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b, 0, 260);
		for (int i = 0; i < lena; i++)
		{
			a[i] = aa.charAt(lena - i - 1) - '0';
		}
		for (int i = 0; i < lenb; i++)
		{
			b[i] = bb.charAt(lenb - i - 1) - '0';
		}
		int cc = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(c, 0, 300);
		for (int i = 0; i < Math.max(lena, lenb) + 1; i++)
		{
			c[i] = a[i] + b[i] + cc;
			if (c[i] > 9)
			{
				cc = 1;
				c[i] -= 10;
			}
			else
			{
				cc = 0;
			}
		}
		int lenc = 0;
		for (int i = 260; i >= 0; i--)
		{
			if (c[i] != 0)
			{
				lenc = i + 1;
				break;
			}
		}
		for (int i = lenc - 1; i >= 0; i--)
		{
			System.out.print(c[i]);
		}
		if (lenc == 0)
		{
			System.out.print('0');
		}
		System.out.print("\n");
	}
}

