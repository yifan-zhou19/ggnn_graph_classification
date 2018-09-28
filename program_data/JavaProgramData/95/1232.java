package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int h = 0;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		char i;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) != b.charAt(i) && a.charAt(i) != b.charAt(i) + 32 && a.charAt(i) != b.charAt(i) - 32)
			{
				if (a.charAt(i) > 96 && b.charAt(i) > 96 && a.charAt(i) > b.charAt(i))
				{
			h = 2;
				}
			else if (a.charAt(i) < 96 && b.charAt(i) < 96 && a.charAt(i)> b.charAt(i))
			{
			h = 2;
			}
			else if (a.charAt(i) < 96 && b.charAt(i) < 96 && a.charAt(i) < b.charAt(i))
			{
			h = 1;
			}
			else if (a.charAt(i) > 96 && b.charAt(i) > 96 && a.charAt(i) < b.charAt(i))
			{
			h = 1;
			}
			else if (a.charAt(i) > 96 && b.charAt(i) < 96 && a.charAt(i)>(b.charAt(i) + 32))
			{
			h = 2;
			}
			else if (a.charAt(i) > 96 && b.charAt(i) < 96 && a.charAt(i) < (b.charAt(i) + 32))
			{
			h = 1;
			}
			else if (a.charAt(i) < 96 && b.charAt(i)>96 && a.charAt(i) > (b.charAt(i) - 32))
			{
			h = 2;
			}
			else if (a.charAt(i) < 96 && b.charAt(i)>96 && a.charAt(i) < (b.charAt(i) - 32))
			{
			h = 1;
			}
			}
		}
		if (h == 0)
		{
			System.out.print("=");
		}
		else if (h == 1)
		{
			System.out.print("<");
		}
		else if (h == 2)
		{
			System.out.print(">");
		}
		return (0);
	}
}
