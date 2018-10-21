package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		int i;
		int n;
		int m;
		int l;
		a = new Scanner(System.in).nextLine();
		l = a.length();
		n = 0;
		for (i = 0;i < l;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, (n * 10 + a.charAt(i) - '0') / 13 + '0');
			n = (n * 10 + a.charAt(i) - '0') % 13;
		}
		if (l == 1)
		{
			System.out.print("0");
		}
		else if (l <= 2 && ((a.charAt(0) - '0') * 10 + a.charAt(1) - '0') <= 13)
		{
			System.out.print("0");
		}
		else
		{
			if (((a.charAt(0) - '0') * 10 + a.charAt(1) - '0') >= 13)
			{
				for (i = 1;i < l;i++)
				{
					System.out.printf("%c",b.charAt(i));
				}
			}
			else
			{
				for (i = 2;i < l;i++)
				{
					System.out.printf("%c",b.charAt(i));
				}
			}
		}
		System.out.print("\n");
		System.out.printf("%d",n);


	}
}

