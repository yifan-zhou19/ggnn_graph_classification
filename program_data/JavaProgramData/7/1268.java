package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[300]);
		String b = new String(new char[300]);
		String c = new String(new char[300]);
		int i = 0;
		int j = 0;
		int len1;
		int len2;
		int len3;
		int t = 0;
		int k;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		len1 = a.length();
		len2 = b.length();
		len3 = c.length();
			while (i < len1 && t < len2)
			{
			if (a.charAt(i) != b.charAt(j))
			{
				i++;
				j = 0;
				t = 0;
			}
			else
			{
				i++;
				j++;
				t++;
			}
			}
			if (t >= len2)
			{
			for (j = 0;j < i - t;j++)
			{
				System.out.printf("%c",a.charAt(j));
			}
			for (j = 0;j < len3;j++)
			{
				System.out.printf("%c",c.charAt(j));
			}
			for (j = i - t + len2;j < len1;j++)
			{
				System.out.printf("%c",a.charAt(j));
			}
			}
			if (t < len2)
			{
				for (j = 0;j < len1;j++)
				{
					System.out.printf("%c",a.charAt(j));
				}
			}
		return 0;
	}

}
