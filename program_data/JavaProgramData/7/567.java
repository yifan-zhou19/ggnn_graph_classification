package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[300]);
		String d = new String(new char[300]);
		String r = new String(new char[300]);
		int i = 0;
		int j;
		int k;
		int ls;
		int lr;
		int ld;
		int flag = 0;
		int cont = 0;
		s = new Scanner(System.in).nextLine();
		d = new Scanner(System.in).nextLine();
		r = new Scanner(System.in).nextLine();
		ls = s.length();
		ld = d.length();
		lr = r.length();
		for (i = 0;i < ls;)
		{
			flag = 0;
			for (j = 0;j < ld;j++)
			{
				if (s.charAt(i + j) == d.charAt(j))
				{
					flag++;
				}
				if (flag == ld)
				{
					cont++;
				}
			}

			if (flag == ld && cont == 1)
			{
				cont++;
				for (k = 0;k < lr;k++)
				{
					s = tangible.StringFunctions.changeCharacter(s, i + k, r.charAt(k));
				}
				i = i + lr;
				continue;
			}
			else
			{
				i++;
				continue;
			}

		}
		System.out.println(s);
	}

}

