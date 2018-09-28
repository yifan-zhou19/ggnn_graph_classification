package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[1000]);
		int i;
		int m = 0;
		int j;
		a = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			m++;
		}
		for (i = m - 1;i >= 0;i--)
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
