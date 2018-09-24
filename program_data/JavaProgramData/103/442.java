package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int len = 0;
		int counts = 0;
		int k = 0;
		int i;
		String str = new String(new char[1001]);
		char c;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (len = 0;str.charAt(len) != '\0';len++)
		{
			;
		}
		while (k < len)
		{
			c = str.charAt(k);
			if (c >= 'a')
			{
				c = c - 32;
			}
			for (i = 0;i < len;i++)
			{
				if (str.charAt(k + i) == c || str.charAt(k + i) == (c + 32))
				{
					counts++;
				}
				else
				{
					break;
				}
			}
			System.out.print('(');
			System.out.print(c);
			System.out.print(',');
			System.out.print(counts);
			System.out.print(')');
			k = k + i;
			counts = 0;
		}
		System.out.print("\n");
		System.in.read();
		System.in.read();
		return 0;
	}
}

