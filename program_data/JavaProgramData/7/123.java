package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		int l;
		int p;
		int q;
		int i;
		int j;
		int s;
		int m = 0;
		int k;
		int y;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		l = a.length();
		p = b.length();
		for (i = 0;i < l;i++)
		{
				k = i;
				j = 0;
				while (a.charAt(k) == b.charAt(j) && j < p)
				{
					k++;
					j++;
				}
				if (j == p)
				{
					for (s = i;s < i + p;s++)
					{
						a = tangible.StringFunctions.changeCharacter(a, s, c.charAt(m));
						m++;
						y = 1;
					}
				}
				if (y == 1)
				{
					break;
				}
		}
		System.out.printf("%s\n",a);
	}
}

