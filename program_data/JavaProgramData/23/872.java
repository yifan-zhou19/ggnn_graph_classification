package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int i;
		int j;
		int n;
		int word = 0;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = n - 1;i >= 0;i--)
		{
			if (a.charAt(i) != ' ')
			{
				word++;
			}
			if (a.charAt(i) == ' ')
			{
				for (j = 0;j < word;j++)
				{
					System.out.printf("%c",a.charAt(i + j + 1));
				}
				word = 0;
				if (i != 0)
				{
					System.out.print(" ");
				}
			}
			if (i == 0)
			{
				for (j = 0;j < word;j++)
				{
					System.out.printf("%c",a.charAt(j));
				}
			}
		}
	}
}
