package <missing>;

public class GlobalMembers
{
	//????


	public static int Main()
	{
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		a = new Scanner(System.in).nextLine(); //?????
		b = new Scanner(System.in).nextLine();
		for (int i = 0;a.charAt(i) != '\0';i++) //????????
		{
			if (a.charAt(i) >= 65 && a.charAt(i) <= 90)
			{
				a.charAt(i) += 32;
			}
		}
		for (int i = 0;b.charAt(i) != '\0';i++)
		{
			if (b.charAt(i) >= 65 && b.charAt(i) <= 90)
			{
				b.charAt(i) += 32;
			}
		}
		int c = strcmp(a,b); //??
		if (c > 0)
		{
			System.out.print('>');
			System.out.print("\n");
		}
		if (c == 0)
		{
			System.out.print('=');
			System.out.print("\n");
		}
		if (c < 0)
		{
			System.out.print('<');
			System.out.print("\n");
		}
		return 0;
	}
}
