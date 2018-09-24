package <missing>;

public class GlobalMembers
{
	public static void arc()
	{
		String str = new String(new char[10000]);
		String str2 = new String(new char[10000]);
		int a;
		int b = 0;
		int c;
		str = new Scanner(System.in).nextLine();
		a = str.length();
		if (a == 1)
		{
			System.out.print(str.charAt(0));
		}
		else
		{
			if (str.charAt(0) == '-')
			{
				System.out.print(str.charAt(0));
			}
			for (c = a - 1;;c--)
			{
				if (str.charAt(c) == '0')
				{
					b++;
				}
				else
				{
					System.out.printf("%c",str.charAt(c));
					b++;
					break;
				}
			}
			for (;b < a;b++)
			{

				if (str.charAt(a - b - 1) != '-')
				{
					System.out.printf("%c",str.charAt(a - b - 1));
				}
			}
		}
		System.out.print("\n");
	}
	public static void Main()
	{
		int i = 0;
		for (;i < 6;i++)
		{
			arc();
		}
	}

}
