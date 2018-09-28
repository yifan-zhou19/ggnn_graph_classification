package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[100]);
		final String s2 = "";
		char c;
		int[] a = new int[100];
		int b;
		int k;
		int i;
		int len;
		int l;
		int num;
		s1 = new Scanner(System.in).nextLine();
		len = s1.length();
		if (len == 2 && (10 * (s1.charAt(0) - '0') + s1.charAt(1) - '0') < 13)
		{
			System.out.printf("0\n%d",10 * (s1.charAt(0) - '0') + s1.charAt(1) - '0');
		}
		else if (len == 1)
		{
			System.out.printf("0\n%d",s1.charAt(0) - '0');
		}
		else
		{
		k = s1.charAt(0) - '0';
		for (i = 1;i < len;i++)
		{
			b = 10 * k + s1.charAt(i) - '0';
			if (b >= 13)
			{
				k = b % 13;
				a[i - 1] = (b - k) / 13;
			}
			else
			{
				k = b;
			}
		}
		if ((10 * (s1.charAt(0) - '0') + s1.charAt(1) - '0') >= 13)
		{
		for (l = 0;l < len - 1;l++)
		{
			s2 = tangible.StringFunctions.changeCharacter(s2, l, a[l] + '0');
		}
		}
		else
		{
		for (l = 0;l < len - 2;l++)
		{
			s2 = tangible.StringFunctions.changeCharacter(s2, l, a[l + 1] + '0');
		}
		}
		System.out.println(s2);
		System.out.printf("%d",k);
		}
	}
}

