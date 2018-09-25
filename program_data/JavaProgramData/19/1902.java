package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String s = new String(new char[100]);
		String ex = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int j;
		int k;
		int l;
		int m = 0;
		int n;
		int flag;
		int len;
		int[] D = new int[100];
		int A = 0;
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		len = a.length();
		for (i = 0;i < 100;i++)
		{
			D[i] = 0;
		}
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			flag = 1;
			if ((i != 0 && s.charAt(i) == a.charAt(0) && s.charAt(i - 1) == ' ' && (s.charAt(i + len) == ' ' || s.charAt(i + len) == '\0')) || (i == 0 && s.charAt(i) == a.charAt(0) && s.charAt(i + len) == ' '))
			{
				k = i;
				for (j = i;j < i + len;j++)
				{
					ex = tangible.StringFunctions.changeCharacter(ex, j - i, s.charAt(k));
					k++;
				}
				for (j = 0;j < len;j++)
				{
					if (ex.charAt(j) != a.charAt(j))
					{
						flag = 0;
					}
				}
			}
			else
			{
				flag = 0;
			}
			if (flag != 0)
			{
				D[m] = i;
				m++;
	//			printf("%d %d %d\n",m,D[m-1],i);
			}
		}
		if (m == 1)
		{
			for (i = 0;i < D[0];i++)
			{
				System.out.printf("%c",s.charAt(i));
			}
			for (i = 0;b.charAt(i) != '\0';i++)
			{
				System.out.printf("%c",b.charAt(i));
			}
			for (i = D[0] + len;s.charAt(i) != '\0';i++)
			{
				System.out.printf("%c",s.charAt(i));
			}
		}
		else if (m > 1)
		{
			for (i = 0;i < D[0];i++)
			{
				System.out.printf("%c",s.charAt(i));
			}
			for (n = 0;n < m;n++)
			{
				for (i = 0;b.charAt(i) != '\0';i++)
				{
					System.out.printf("%c",b.charAt(i));
				}
				for (i = D[n] + len;i < D[n + 1];i++)
				{
					System.out.printf("%c",s.charAt(i));
				}
			}
			for (i = D[m - 1] + len;s.charAt(i) != '\0';i++)
			{
				System.out.printf("%c",s.charAt(i));
			}
		}
		else
		{
			for (l = 0;s.charAt(l) != '\0';l++)
			{
				System.out.printf("%c",s.charAt(l));
			}
		}
		System.out.print("\n");
		return 0;
	}
}

