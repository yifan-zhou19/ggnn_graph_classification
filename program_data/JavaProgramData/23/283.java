package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		char s;
		s = ' ';
		int j = 1;
		int d;
		int i;
		int k;
		a = new Scanner(System.in).nextLine();
		for (k = 0;k < 100;k++)
		{
			if (a.charAt(k) != s)
			{
				if (a.charAt(k + 1) == 0)
				{
				System.out.println(a);
			break;
				}
				else
				{
					continue;
				}
			}
			else
			{
		for (j = 99;j > 0;j--)
		{
			if (a.charAt(j) == s)
			{
				for (i = j + 1;i < 100;i++)
				{
						System.out.printf("%c",a.charAt(i));
		if (a.charAt(i + 1) == s || a.charAt(i + 1) == 0)
		{
		System.out.printf("%c",s);
		break;
		}
				}
			}
		}
		for (d = 0;d < 100;d++)
		{
			System.out.printf("%c",a.charAt(d));
		if (a.charAt(d + 1) == s)
		{
			break;
		}
		}
			break;
			}
		}
	}
}
