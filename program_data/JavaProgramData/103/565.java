package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[1000]);
	public static int Main()
	{
		int i;
		int j;
		int n = 1;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		j = a.length();
		for (i = 0;i < j;i++)
		{
			if (a.charAt(i) > 96)
			{
				a.charAt(i) -= 32;
			}
		}
		for (i = 1;i <= j;i++)
		{
			if (a.charAt(i) == a.charAt(i - 1))
			{
				n++;
			}
			else
			{
				System.out.print('(');
				System.out.print(a.charAt(i - 1));
				System.out.print(',');
				System.out.print(n);
				System.out.print(')');
				n = 1;
			}
		}
	}

}

