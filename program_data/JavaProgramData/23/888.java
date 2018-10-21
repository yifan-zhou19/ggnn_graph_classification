package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		int i;
		int n = 0;
		int t = 0;
		int j = 0;
		a = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			n = n + 1;
		}
		for (i = n - 1;i >= 0;i--)
		{
			if (a.charAt(i) == ' ')
			{
				for (j = i + 1;a.charAt(j) != ' ' && a.charAt(j) != '\0';j++)
				{
					System.out.printf("%c",a.charAt(j));
				}
				System.out.print(" ");
			}
		}
		for (i = 0;a.charAt(i) != ' ' && a.charAt(i) != '\0';i++)
		{
			System.out.printf("%c",a.charAt(i));
		}
	}
}
