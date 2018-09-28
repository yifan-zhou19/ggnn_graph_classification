package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c = new String(new char[100]);
		int n;
		int i;
		int j;
		int t;
		c = new Scanner(System.in).nextLine();
		n = c.length();
		t = n;
		for (i = n - 1;i >= 0;i--)
		{
			if (c.charAt(i) == ' ')
			{
				for (j = i + 1;j < t;j++)
				{
					System.out.printf("%c",c.charAt(j));
				}
				t = i;
				System.out.print(" ");
			}
		}
		for (j = 0;j < t;j++)
		{
			System.out.printf("%c",c.charAt(j));
		}
		System.out.print("\n");
	}
}
