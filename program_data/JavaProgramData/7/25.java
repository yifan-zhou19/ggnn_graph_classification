package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int d;
		int e;
		int f;
		int k;
		String a = new String(new char[256]);
		String b = new String(new char[256]);
		String c = new String(new char[256]);
		a = new Scanner(System.in).nextLine();
		scanf("\n");
		b = new Scanner(System.in).nextLine();
		scanf("\n");
		c = new Scanner(System.in).nextLine();
		d = a.length();
		e = b.length();
		f = c.length();
		for (i = 0;i < d;i++)
		{
			if (b.charAt(0) == a.charAt(i))
			{
				k = i;
				for (j = 0;j < e;j++,k++)
				{
					if (b.charAt(j) != a.charAt(k))
					{
						break;
					}
				}
					if (j < e)
					{
						continue;
					}
					else
					{
						break;
					}
			}
			else
			{
				continue;
			}
		}
		if (i < d)
		{
			for (j = i + e;j < (d - i - e);j++)
			{
				a = tangible.StringFunctions.changeCharacter(a, f + j - e, a.charAt(j));
			}
			for (j = i;j < (i + f);j++)
			{
				a = tangible.StringFunctions.changeCharacter(a, j, c.charAt(j - i));
			}
			System.out.printf("%s\n",a);
		}
		else
		{
			System.out.printf("%s\n",a);
		}
	}

}

