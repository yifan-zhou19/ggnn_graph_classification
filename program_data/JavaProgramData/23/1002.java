package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s1 = new String(new char[100]);
		int i;
		int j;
		int num;
		s1 = new Scanner(System.in).nextLine();
		num = s1.length();
		for (i = num - 1;i >= 0;i--)
		{
			if (s1.charAt(i) == ' ')
			{
				for (j = i + 1;(s1.charAt(j) != ' ' && s1.charAt(j) != '\0');j++)
				{
					System.out.printf("%c",s1.charAt(j));
				}
				System.out.print(" ");
			}
			if (i == 0)
			{
				for (j = i;(s1.charAt(j) != ' ' && s1.charAt(j) != '\0');j++)
				{
					System.out.printf("%c",s1.charAt(j));
				}
			}
		}
	}
}
