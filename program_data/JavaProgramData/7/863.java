package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[256]);
		String b = new String(new char[256]);
		String c = new String(new char[256]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		int q;
		int w;
		int e;
		q = a.length();
		w = b.length();
		e = c.length();
		int i;
		int j;
		int k;
		int result = 1;
		int d;
		for (k = 0;k < q;k++)
		{
			if (a.charAt(k) == b.charAt(0))
			{
				result = 1;
				for (i = k,j = 0;i < w + k,j < w;i++,j++)
				{
					d = a.charAt(i) - b.charAt(j);
					if (d != 0)
					{
						result = 0;
					}
				}
				if (result != 0)
				{
					for (i = k,j = 0;j < e,i < w + k;i++,j++)
					{
						a = tangible.StringFunctions.changeCharacter(a, i, c.charAt(j));
					}
					break;
				}
			}
		}
		System.out.println(a);
	}


}

