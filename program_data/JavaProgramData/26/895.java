package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 0;
		int i;
		int n;
		String A = new String(new char[101]);
		A = new Scanner(System.in).nextLine();
		for (i = 0;A.charAt(i) != '\0';i++)
		{
			if (A.charAt(i) != ' ')
			{
				System.out.printf("%c",A.charAt(i));
			}
			if (A.charAt(i) == ' ')
			{
			   System.out.print(" ");
			   for (n = i;A.charAt(n) == ' ';n++)
			   {
				   i = n;
			   }
			}
		}
	return 0;
	}
}
