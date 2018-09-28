package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int len;
		int i;
		int j;
		String str = new String(new char[101]);
		char[] ans = {'0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char a;
		char b;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = str.length();
		a = str.charAt(0);
		b = str.charAt(1);
		for (i = 0; i < len - 1;)
		{
			if (str.charAt(i) > '1')
			{
				if (str.charAt(i + 1) >= '3')
				{
					str.charAt(i)--;
					str.charAt(i + 1) -= 3;
				}
				else
				{
					str.charAt(i) -= 2;
					str.charAt(i + 1) += 7;
				}
				ans[i]++;
			}
			if (str.charAt(i) == '1')
			{
				if (str.charAt(i + 1) >= '3')
				{
					str.charAt(i)--;
					str.charAt(i + 1) -= 3;
					ans[i]++;
				}
				else
				{
					str.charAt(i + 1) += 10;
					i++;
					ans[i] = '0';
				}
			}
			if (str.charAt(i) == '0')
			{
				i++;
				ans[i] = '0';
			}
		}
		if (len == 1 || (len == 2 && a == '1' && b < '3'))
		{
			System.out.print("0");
		}
		else if (a == '1' && b < '3')
		{
			for (j = 1; j < i; j++)
			{
				System.out.print(ans[j]);
			}
		}
		else
		{
			for (j = 0; j < i; j++)
			{
				System.out.print(ans[j]);
			}
		}
		System.out.print("\n");
		if (str.charAt(i - 1) == '1')
		{
			str.charAt(i) -= 10;
			System.out.print(str.charAt(i - 1));
			System.out.print(str.charAt(i));
			System.out.print("\n");
		}
		else
		{
			System.out.print(str.charAt(i));
			System.out.print("\n");
		}
		return 0;
	}
}

