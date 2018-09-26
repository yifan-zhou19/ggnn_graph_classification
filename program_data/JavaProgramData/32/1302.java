package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[101]);
		String d = new String(new char[101]);
		int[] i = new int[101];
		int[] j = new int[101];
		int tmp;
		int flag;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int m = 0; m < n; m++)
		{
			for (int k = 0; k < 101; k++)
			{
			c = tangible.StringFunctions.changeCharacter(c, k, d[k] = '0');
			i[k] = j[k] = 0;
			}
		c = ConsoleInput.readToWhiteSpace(true).charAt(0);
		d = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (int k = c.length() - 1; k >= 0; k--)
		{
			i[k] = c.charAt(k) - '0';
		}
		for (int k = d.length() - 1; k >= 0; k--)
		{
			j[k + c.length() - d.length()] = d.charAt(k) - '0';
		}
		for (int l = c.length() - 1; l >= 0; l--)
		{
			tmp = i[l] - j[l];
			if (tmp < 0)
			{
				tmp += 10;
				i[l - 1]--;
			}
			i[l] = tmp;
		}
		for (int k = 0; k < c.length(); k++)
		{
			if (i[k] > 0)
			{
				flag = k;
				break;
			}
		}
		for (int k = flag; k < c.length(); k++)
		{
			System.out.print(i[k]);
		}
		System.out.print("\n");
		}
		return 0;
	}
}

