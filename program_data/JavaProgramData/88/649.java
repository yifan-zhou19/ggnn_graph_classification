package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int l;
		int p = 0;
		int q = 0;
		String a = new String(new char[40]);
		char[][] b = new char[40][40];
		a = new Scanner(System.in).nextLine();
		l = a.length();
		*(a.Substring(l)) = 'a'; //????????
		for (i = 0;i < l;i++)
		{
			if ((*(a.Substring(i)) >= '0') && (*(a.Substring(i)) <= '9'))
			{
				*(*(b + p) + q) = *(a.Substring(i));
				q++;
				if ((*(a.Substring(i) + 1) < '0') || (*(a.Substring(i) + 1)>'9'))
				{
					*(*(b + p) + q) = '\0';
					p++;
					q = 0;
				}
			}
		}
		for (i = 0;i < p;i++)
		{
			System.out.println(*(b + i));
		}
		return 0;
	}
}
