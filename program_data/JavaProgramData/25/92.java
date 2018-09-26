package <missing>;

public class GlobalMembers
{
	public static void change(String a)
	{
		int k = len;
		int b;
		int q = 0;

		while (k >= 1)
		{

			b = (a[k - 1] - '0') * 2;
			if (b < 10)
			{
				a[k - 1] = b + '0';
			}
			else

			{

				a[k - 1] = b - 10 + '0';
				if (a[k].equals('\0'))
				{
					a[k] = '1';
					len++;
					a[k + 1] = '\0';
				}
				else
				{
					a[k] = a[k].Substring(1);
				}
			}

			k--;
		}
	}
	public static int len = 1;
	public static int Main()
	{
		int n;
		int i;
		String a = new String(new char[500]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = tangible.StringFunctions.changeCharacter(a, 0, '1');
		a = tangible.StringFunctions.changeCharacter(a, 1, '\0');

		for (i = 1;i <= n;i++)
		{



			change(a);
		}

		for (i = len - 1;i >= 0;i--)
		{
		   System.out.print(a.charAt(i));
		}

		return 0;
	}


}

