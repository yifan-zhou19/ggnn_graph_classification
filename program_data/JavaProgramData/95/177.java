package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[30]);
		String b = new String(new char[30]);
		int i;
		int j;
		int num1;
		int num2;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		num1 = a.length();
		num2 = b.length();
		for (i = 0;i < num1;i++)
		{
			if (a.charAt(i) <= 'z' && a.charAt(i) >= 'a')
			{
				a.charAt(i) -= 32;
			}
		}
		for (i = 0;i < num2;i++)
		{
			if (b.charAt(i) <= 'z' && b.charAt(i) >= 'a')
			{
				b.charAt(i) -= 32;
			}
		}
			if (strcmp(a,b) > 0)
			{
				System.out.print(">");
			}
			else if (strcmp(a,b) < 0)
			{
				System.out.print("<");
			}
			else
			{
			System.out.print("=");
			}
		return 0;
	}

}
