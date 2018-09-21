package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		String a = new String(new char[101]);

		a = new Scanner(System.in).nextLine();
		for (i = a.length() - 1;i > 0;i--)
		{
			if (a.charAt(i) == ' ')
			{
						  for (j = i + 1;a.charAt(j) != ' ' && a.charAt(j) != '\0';j++)
						  {
					System.out.printf("%c",a.charAt(j));
						  }
				if (j != i + 1)
				{
					System.out.print(" ");
				}
			}
		}
			  for (j = i;a.charAt(j) != ' ' && a.charAt(j) != '\0';j++)
			  {
			 System.out.printf("%c",a.charAt(j));
			  }
	}
}
