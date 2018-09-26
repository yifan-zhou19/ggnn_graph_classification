package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m = 0;
		int x;
		int j;
		int k;
		int p;
		String a = new String(new char[501]);
		String b = new String(new char[501]);
		a = new Scanner(System.in).nextLine();
		for (p = 2;p <= 500;p++)
		{
			i = 0;
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			j = 0;
			for (k = i;k <= i + p - 1;k++)
			{
				b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(k));
				j++;
			}
			b = tangible.StringFunctions.changeCharacter(b, j, '\0');
			m = 0;
			for (x = 0;x <= ((p - 1) / 2);)
			{
				if (b.charAt(x) == a.charAt(i + p - 1 - x))
				{
					x++;
				}
				else
				{

					m = 1;
					break;
				}
			}
			if (m == 0)
			{
				System.out.println(b);
			}
		}
		}
		return 0;
	}






}

