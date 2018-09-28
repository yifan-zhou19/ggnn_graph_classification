package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[100]);
		int i;
		int j;
		int n;
		int m;
		str = new Scanner(System.in).nextLine();
		for (n = 0;str.charAt(n) != '\0';)
		{
			n++;
		}
	for (i = n - 1,m = n;i >= 0;i--)
	{
			if (str.charAt(i) == ' ')
			{
				for (j = i + 1;j < m;j++)
				{
					System.out.printf("%c",str.charAt(j));
				}
				System.out.print(" ");
				m = i;
			}

	}
		for (i = 0;i < m;i++)
		{
		System.out.printf("%c",str.charAt(i));
		}
	}
}
