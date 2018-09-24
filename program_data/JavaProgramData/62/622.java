package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int b;
		int[] c = new int[100];
		String a = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		b = a.length();
		for (i = 0;i <= b;i++)
		{
		c[i] = 0;
		}
		for (i = 0;i < b;i++)
		{
			if (a.charAt(i) == ' ')
			{
			c[i] = 1;
			}
		}
		for (i = 0;i < b;i++)
		{
			if (c[i] == 0 && (c[i + 1] == 0 || a.charAt(i + 1) == '\n'))
			{
			System.out.printf("%c",a.charAt(i));
			}
			else if (c[i] == 0 && c[i + 1] == 1)
			{
			System.out.printf("%c ",a.charAt(i));
			}
		}
		return 0;
	}
}
