package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int t;
		int l1;
		int l2;
		int l3;
		int judge;
		String s = new String(new char[256]);
		String a = new String(new char[256]);
		String b = new String(new char[256]);
		s = new Scanner(System.in).nextLine();
		l1 = s.length();
		a = new Scanner(System.in).nextLine();
		l2 = a.length();
		b = new Scanner(System.in).nextLine();
		l3 = b.length();
		for (i = 0;i <= l1 - l2;i++)
		{
			judge = 1;
			for (j = 0;j < l2;j++)
			{
				if (s.charAt(i + j) != a.charAt(j))
				{
					judge = 0;
					break;
				}
			}
			if (judge == 1)
			{
				t = i;
				break;
			}
		}
		if (judge == 1)
		{
			for (k = 0;k < l3;k++)
			{
				s = tangible.StringFunctions.changeCharacter(s, t + k, b.charAt(k));
			}
		}
		System.out.println(s);
	}
}

