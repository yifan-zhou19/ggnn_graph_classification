package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int x;
		int n;
		String str = new String(new char[10000]);
		char c;
		str = new Scanner(System.in).nextLine();
		n = str.length();
		x = 0;
		for (i = 0;i <= n;i++)
		{
			if (str.charAt(i) == ' ' || str.charAt(i) == '\0')
			{
				while (str.charAt(i + 1) == ' ')
				{
					i++;
				}
				System.out.printf("%d",x);
				if (str.charAt(i) != '\0')
				{
					System.out.print(",");
				x = 0;
				}
			}
			else
			{
				x = x + 1;
			}
		}
		return 0;
	}
}
