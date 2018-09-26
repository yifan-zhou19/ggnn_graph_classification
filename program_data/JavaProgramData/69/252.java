package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[251]);
		String b = new String(new char[252]);
		int[] c = new int[251];
		int[] d = new int[251];
		int[] s = new int[251];
		int len1;
		int len2;
		int j = 0;
		int i;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len1 = a.length();
		len2 = b.length();
		for (i = len1 - 1;i >= 0;i--)
		{
			c[j] = a.charAt(i) - '0';
			j++;
		}
		j = 0;
		for (i = len2 - 1;i >= 0;i--)
		{
			d[j] = b.charAt(i) - '0';
			j++;
		}
		for (i = 0;i < len1 || i < len2;i++)
		{
			s[i] = c[i] + d[i] + s[i];
			if (s[i] >= 10)
			{
				s[i + 1]++;
				s[i] = s[i] - 10;
			}
		}
		i = 250;
		while (s[i] == 0 && i > 0)
		{
			i--;
		}
		for (j = i;j >= 0;j--)
		{
			System.out.print(s[j]);
		}
		System.out.print("\n");
		return 0;
	}



}

