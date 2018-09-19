package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int s;
		int k;
		String a = new String(new char[15]);
		String b = new String(new char[5]);
		while (scanf("%s%s",a,b) != EOF)
		{
			s = 0;
			k = 0;
			n = a.length();
			for (i = 0;i < n;i++)
			{
				if (a.charAt(i) > k)
				{
					k = a.charAt(i);
					s = i;
				}
			}

			for (i = 0;i <= s;i++)
			{
				System.out.printf("%c",a.charAt(i));
			}
			System.out.printf("%s",b);
			for (i = s + 1;i < n;i++)
			{
				System.out.printf("%c",a.charAt(i));
			}
			System.out.print("\n");
		}
			return 0;
	}
}
