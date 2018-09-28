package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int c;
		int k;
		int ma;
		int mi;
		int nma;
		int nmi;
		String s = new String(new char[500]);
		char[][] a = new char[50][50];
		s = new Scanner(System.in).nextLine();
		for (i = 0,j = 0,k = 0;i < 500;i++)
		{
			if (s.charAt(i) != ' ' && s.charAt(i) != '\0')
			{
				a[j][k] = s.charAt(i);
				k++;
			}
			else if (s.charAt(i) == ' ')
			{
				a[j][k] = '\0';
				j++;
				k = 0;
			}
			else
			{
				a[j][k] = '\0';
				break;
			}
		}
		nma = 0;
		nmi = 0;
		ma = String.valueOf(a[0]).length();
		mi = String.valueOf(a[0]).length();
		for (i = 1;i <= j;i++)
		{
			c = String.valueOf(a[i]).length();
			if (c < mi)
			{
				mi = c;
				nmi = i;
			}
			if (c > ma)
			{
				ma = c;
				nma = i;
			}
		}
		System.out.println(a[nma]);
		scanf("\n");
		System.out.println(a[nmi]);
		scanf("\n");
		return 0;
	}






}
