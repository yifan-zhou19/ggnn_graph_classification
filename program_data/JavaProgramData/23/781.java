package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int t = 0;
		int m;
		int n;
		int a = 0;
		String str = new String(new char[100]);
		str = new Scanner(System.in).nextLine();
	for (i = 99;i >= 0;i--)
	{
		if (str.charAt(i) == '\0')
		{
		t = 1;
	   m = i - 1;
	   continue;
		}
	 if (t == 1)
	 {
		if (str.charAt(i) == ' ')
		{
			a = 1;
			for (n = i + 1;n <= m;n++)
			{
		System.out.printf("%c",str.charAt(n));
			}
		System.out.print(" ");
		m = i - 1;
		}
		if (i == 0 && a == 1)
		{
		for (n = 0;n <= m;n++)
		{
			System.out.printf("%c",str.charAt(n));
		}
		}

	 }

	}
	if (a == 0)
	{
	for (n = 0;n <= m;n++)
	{
	 System.out.printf("%c",str.charAt(n));
	}
	}
	System.out.print("\n");
	}
}
