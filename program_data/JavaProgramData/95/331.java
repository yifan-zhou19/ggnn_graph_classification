package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int j = 0;
		int k = 0;
		int m;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			k++;
		}
		for (i = 0;b.charAt(i) != '\0';i++)
		{
			j++;
		}
		if (k > j)
		{
			m = k;
		}
		else
		{
			m = j;
		}
		for (i = 0;i < m;i++)
		{
			if (a.charAt(i) != b.charAt(i) && a.charAt(i) != (b.charAt(i) + 32) && a.charAt(i) != (b.charAt(i) - 32))
			{
				if (a.charAt(i) > 96)
				{
					a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
				}
				if (b.charAt(i) > 96)
				{
					b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 32);
				}
				if (a.charAt(i) > b.charAt(i))
				{
					System.out.print(">\n");
				}
				else
				{
					System.out.print("<\n");
				}
				break;
			}
			else if (i == m - 1)
			{
				System.out.print("=\n");
			}
		}
		return 0;
	}
}

