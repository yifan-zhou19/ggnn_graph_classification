package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[300];
	public static int[] b = new int[300];
	public static int[] c = new int[300];

	public static int Main()
	{
		int flag = 0;

		for (int i = 0 ; i < 300 ; i++)
		{
			a[i] = b[i] = c[i] = 0;
		}

		String arr = new String(new char[300]);
		int len1;
		int len2;
		arr = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len1 = arr.length();
		for (int i = 0 ; i < len1 ; i++)
		{
			a[i] = arr.charAt(len1 - i - 1) - '0';
		}
		arr = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len2 = arr.length();
		for (int i = 0 ; i < len2 ; i++)
		{
			b[i] = arr.charAt(len2 - i - 1) - '0';
		}

		int len = (len1 > len2 != 0?len1:len2);

		for (int i = 0 ; i < len ; i++)
		{
			c[i] += a[i] + b[i];
			if (c[i] > 9)
			{
				c[i + 1]++;
				c[i] -= 10;
			}
		}

		for (int i = len ; i >= 0 ; i--)
		{
			if (c[i] != 0)
			{
				flag = i;
				break;
			}
		}
		for (int i = flag ; i >= 0 ; i--)
		{
			System.out.print(c[i]);
		}
		System.out.print("\n");

		return 0;
	}
}

