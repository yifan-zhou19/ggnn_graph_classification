package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		char[][] d = new char[100][100];
		int i;
		int j;
		int w;
		int m;
		int k = 0;
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		w = s.length();
		for (i = 0,j = 0;i < w + 1;j++,i++)
		{
			if (s.charAt(i) != ' ' && s.charAt(i) != 0)
			{
				d[k][j] = s.charAt(i);
			}
			else
			{
				d[k][j] = 0;
				k += 1;
				j = -1;
			}
		}
		for (i = 0;i < k;i++)
		{
			if (strcmp(d[i],a) == 0)
			{
				d[i] = b;
			}
		}
		for (i = 0;i < k - 1;i++)
		{
			System.out.printf("%s ",d[i]);
		}
		System.out.printf("%s",d[k - 1]);
		return 0;
	}
}
