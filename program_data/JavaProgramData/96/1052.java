package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int m;
		int[] a = new int[100];
		String str = new String(new char[100]);
		str = new Scanner(System.in).nextLine();
		n = str.length();
		if (n == 1)
		{
			System.out.printf("0\n%c",str.charAt(0));
		}
		else if (n == 2 && (str.charAt(1) - '0' + (str.charAt(0) - '0') * 10) < 13)
		{
			m = str.charAt(1) - '0' + (str.charAt(0) - '0') * 10;
			System.out.printf("0\n%d",m);
		}
		else
		{
		for (i = 0;i < n - 1;i++)
		{
			m = (str.charAt(i) - '0') * 10 + str.charAt(i + 1) - '0';
			a[i] = m / 13;
			str = tangible.StringFunctions.changeCharacter(str, i + 1, m % 13 + '0');
		}
		if (a[0] != 0)
		{
			System.out.printf("%d",a[0]);
		}
		for (i = 1;i < n - 1;i++)
		{
			System.out.printf("%d",a[i]);
		}
		System.out.print("\n");
		System.out.printf("%c",str.charAt(n - 1));
		}
		return 0;
	}
}

