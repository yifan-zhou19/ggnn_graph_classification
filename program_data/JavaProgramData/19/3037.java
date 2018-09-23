package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int q;
		int j;
		int k;
		int flag = 0;
		String a = new String(new char[102]);
		String b = new String(new char[102]);
		String c = new String(new char[102]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		n = b.length();
		q = c.length();
		for (i = 0;i < a.length();i++)
		{
			if ((a.charAt(i - 1) == ' ') || ((a.charAt(i) >= 'A') && (a.charAt(i) < 'a')))
			{
				for (j = 0;j < n;j++)
				{
					if (a.charAt(i + j) != b.charAt(j))
					{
					flag = 1;
					break;
					}
				}
					if (flag == 0)
					{
						for (k = 0;k < q;k++)
						{
							System.out.printf("%c",c.charAt(k));
						}
						i = i + n - 1;
					}
				else
				{
					System.out.printf("%c",a.charAt(i));
					flag = 0;
				}
			}
				else
				{
					System.out.printf("%c",a.charAt(i));
					flag = 0;
				}
		}
		return 0;
	}
}
