package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		int[] b = new int[101];
		int c = 0;
		int i;
		int t = 0;
		int len;
		int[] result = new int[101];
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = a.length();
		for (i = 0;i < len;i++)
		{
			b[i] = a.charAt(i) - '0'; //?????
		}
		for (i = 0;i < len;i++)
		{
			c = c * 10 + b[i];
			if (c >= 13)
			{
				result[t] = c / 13; //???
				t++;
				c = c % 13;
			}
			else
			{
				result[t] = 0;
				t++;
			}
		}
		i = 0;
		while (result[i] == 0)
		{
			i++;
		}
		if (i >= len) //???????
		{
			System.out.print("0");
		}
		else
		{
		for (;i < t;i++)
		{
			System.out.print(result[i]);
		}
		}
		System.out.print("\n");
		System.out.print(c);
		System.out.print("\n");
		return 0;
	}



}

