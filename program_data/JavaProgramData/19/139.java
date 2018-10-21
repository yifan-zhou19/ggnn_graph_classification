package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		String c = new String(new char[101]);
		String q = new String(new char[101]);
		int m;
		int i;
		int k;
		int t;
		int n;
		int l;
		int N;
		int z = 0;
		a = new Scanner(System.in).nextLine();
		m = a.length();
		q = a;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		n = b.length();
		l = c.length();


		for (i = 0;i < m;i++)
		{
			N = n;

				if ((i == 0) || (a.charAt(i - 1) == 32 && a.charAt(i) == b.charAt(0) && (a.charAt(i + n) == 32 || a.charAt(i + n) == '\0')))
				{
					for (k = i, t = 0;t < n && k < m;k++, t++)
					{
						if (a.charAt(k) == b.charAt(t))
						{
							N--;
						}
					}
				}
				if (N == 0)
				{
					z = 1;

					if (n >= l)
					{
						for (k = 0,t = i;k < l;t++,k++)
						{
							a = tangible.StringFunctions.changeCharacter(a, t, c.charAt(k));
						}

							a = tangible.StringFunctions.changeCharacter(a, i + l, ' ');
						for (k = i;k < m - (n + 1);k++)
						{

							a = tangible.StringFunctions.changeCharacter(a, k + l + 1, q.charAt(k + n + 1));
						}
						a = tangible.StringFunctions.changeCharacter(a, m - (n - l), '\0');



					}
					if (n < l)
					{
						for (k = 0,t = i;k < l;t++,k++)
						{
							a = tangible.StringFunctions.changeCharacter(a, t, c.charAt(k));
						}
						a = tangible.StringFunctions.changeCharacter(a, i + l, ' ');
						for (k = i;k < m - (n + 1);k++)
						{

							a = tangible.StringFunctions.changeCharacter(a, k + l + 1, q.charAt(k + n + 1));
						}
						a = tangible.StringFunctions.changeCharacter(a, m + (l - n), '\0');


					}
					m = a.length();
					q = a;

				}
		}


		 if (z == 1)
		 {
			 System.out.printf("%s",a);
		 }
		if (z == 0 && N != 0)
		{

			for (i = 0;i < m;i++)
			{
			System.out.printf("%c",q.charAt(i));
			}
		}
		return 0;
	}

}

