package <missing>;

public class GlobalMembers
{
	public static int sum1 = 0;
	public static int sum2 = 0;
	public static void cal(String a, int k, char ch)
	{
		int i;
		int j;
		int longth = a.length();
		for (i = k;;i++)
		{
			if (!a[i].equals(ch) && !a[i].equals('0'))
			{
				a[i] = '0';
				for (j = i - 1; ; j--)
				{
					if (a[j].equals(ch) && !a[j].equals('0'))
					{
						a[j] = '0';
						System.out.print(j);
						System.out.print(' ');
						System.out.print(i);
						System.out.print("\n");
						break;
					}
				}
				break;
			}
		}
		if (i == longth - 1)
		{
		return;
		}
		else
		{
			cal(a, i + 1, ch);
		}
	}
	public static int Main()
	{
		String a = new String(new char[200]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		char ch = a.charAt(0);
		cal(a, 0, ch);
		return 0;
	}

}

