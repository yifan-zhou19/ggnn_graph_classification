package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		String a = new String(new char[30]);
		a = new Scanner(System.in).nextLine();
		i = 0;
		while (i < a.length())
		{
			if (a.charAt(i) >= '0' && a.charAt(i) <= '9')
			{
				for (j = i;a.charAt(j) >= '0' && a.charAt(j) <= '9';j++)
				{
				System.out.printf("%c",a.charAt(j));
				}
				System.out.print("\n");
				i = j + 1;
			}
			else
			{
				i++;
			}
		}
	}
}
