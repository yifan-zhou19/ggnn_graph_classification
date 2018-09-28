package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		int n;
		int i;
		int a;
		int j;
		str = new Scanner(System.in).nextLine();
		n = str.length();
		a = n - 1;
		for (i = n - 1;i > 0;i--)
		{
			if (str.charAt(i) == ' ')
			{
				for (j = i + 1;j <= a;j++)
				{
					System.out.printf("%c",str.charAt(j));
				}
					System.out.printf("%c",str.charAt(i));
				a = i - 1;
			}
		}
		for (i = 0;i < a + 1;i++)
		{
			System.out.printf("%c",str.charAt(i));
		}
	}
}
