package <missing>;

public class GlobalMembers
{
	public static int i;
	public static int l;
	public static String str = new String(new char[501]);
	public static void f(int number, int length)
	{
		int j;
		if (length <= 0)
		{
			for (j = i ; j <= i + l - 1 ; j++)
			{
				System.out.printf("%c", str.charAt(j));
			}
				System.out.print("\n");
		}
		else if (str.charAt(number) == str.charAt(number + length - 1))
		{
			f(number + 1, length - 2);
		}
		return;
	}
	public static int Main()
	{
		int lenth;
		str = new Scanner(System.in).nextLine();
		lenth = str.length();
		for (l = 2 ; l <= lenth - 1 ; l++)
		{
			for (i = 0 ; i <= lenth - 2 ; i++)
			{
				if (i + l - 1 <= lenth)
				{
					f(i, l);
				}
			}
		}
		return 0;
	}





}
