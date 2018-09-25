package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		int i;
		int m = 0;
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) >= 65 && a.charAt(i) <= 90 && b.charAt(i) >= 65 && b.charAt(i) <= 90 || a.charAt(i) >= 97 && a.charAt(i) <= 122 & b.charAt(i) >= 97 && b.charAt(i) <= 122)
			{
				if (a.charAt(i) > b.charAt(i))
				{
					m = 1;
					break;
				}
				if (a.charAt(i) < b.charAt(i))
				{
					m = 2;
					break;
				}
			}
			if (a.charAt(i) > 96 && b.charAt(i) < 96)
			{
				if (a.charAt(i) - 32 < b.charAt(i))
				{
					m = 2;
					break;
				}
				if (a.charAt(i) - 32 > b.charAt(i))
				{
					m = 1;
					break;
				}
			}
			if (b.charAt(i) > 96 && a.charAt(i) < 96)
			{
				if (b.charAt(i) - 32 < a.charAt(i))
				{
					m = 1;
					break;
				}
				if (b.charAt(i) - 32 > a.charAt(i))
				{
					m = 2;
					break;
				}
			}
		}
		if (m == 0)
		{
			System.out.print("=");
		}
		if (m == 1)
		{
			System.out.print(">");
		}
		if (m == 2)
		{
			System.out.print("<");
		}
	}


}
