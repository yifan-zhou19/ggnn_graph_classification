package <missing>;

public class GlobalMembers
{
	public static String str = new String(new char[100]);
	public static char x;
	public static char y;
	public static void line(String a)
	{
		int i;
		int j;
		for (i = 0;i < a.length();i++)
		{
			if (a[i].equals(y))
			{
				j = i;
				while (!a[j].equals(x))
				{
					j--;
				}
				a[i] = '0';
				a[j] = '0';
				System.out.print(j);
				System.out.print(" ");
				System.out.print(i);
				System.out.print("\n");
				break;
			}
		}
		if (i < a.length())
		{
			line(a);
		}
	}
	public static int Main()
	{
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		x = str.charAt(0);
		y = str.charAt(str.length() - 1);
		line(str);
		return 0;
	}
}

