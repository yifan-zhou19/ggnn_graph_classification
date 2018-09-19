package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
	//	printf("%s %s %s",a,b,s);
		int i;
		int j;
		int k;
		int ls;
		int la;
		int lb;
		int r;
		ls = s.length();
		la = a.length();
		lb = b.length();
		for (i = 0;i < ls;i++)
		{
			if (s.charAt(i) == a.charAt(0) && (s.charAt(i - 1) == 32 || i == 0) && (s.charAt(i + la) == 32 || i == ls - 1))
			{
				r = 1;
				for (k = i,j = 0;j < la;j++,k++)
				{

					if (s.charAt(k) != a.charAt(j))
					{
						r = 0;
						break;
					}
				}
				if (r == 1)
				{
					for (k = 0;k < lb;k++)
					{
						System.out.printf("%c",b.charAt(k));
					}
						i = i + la - 1;
						r = 0; //?????


				}
			}
			else
			{
				System.out.printf("%c",s.charAt(i));
			}
		}

		return 0;
	}
}
