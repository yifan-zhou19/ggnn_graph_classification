package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int m = 0;
		String a = new String(new char[256]);
		String b = new String(new char[256]);
		String c = new String(new char[256]);

		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();

		n = a.length();
		k = b.length();

		i = tangible.StringFunctions.strStr(a,b) - a;

		if (i >= 0 && i <= n - k)
		{
			for (j = 0;j < i;j++)
			{
				System.out.printf("%c",a.charAt(j));
			}
			for (j = 0;j < k;j++)
			{
				System.out.printf("%c",c.charAt(j));
			}
			for (j = i + k;j < n;j++)
			{
				System.out.printf("%c",a.charAt(j));
			}
		}
		else
		{
			for (i = 0;i < n;i++)
			{
				System.out.printf("%c",a.charAt(i));
			}
		}
		System.out.print("\n");
		return 0;
	}

}

