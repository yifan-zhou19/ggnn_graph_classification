package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[6000]);
		char[][] f = new char[300][20];
		int b;
		int d = 0;
		int i;
		int e = 0;
		int[] s = new int[100];
		a = new Scanner(System.in).nextLine();
		b = a.length();
		for (i = 0;i < b;i++)
		{
			if (a.charAt(i) == '\0' || a.charAt(i) == ' ')
			{
				if (a.charAt(i + 1) != ' ')
				{
					d = 0;
					e++;
				}
			}
			else
			{
				f[e][d] = a.charAt(i);
				d++;
				f[e][d] = '\0';
			}
		}
		for (i = 0;i <= e;i++)
		{
			s[i] = String.valueOf(f[i]).length();
		}
		for (i = 0;i < e;i++)
		{
			System.out.printf("%d,",s[i]);
		}
		System.out.printf("%d\n",s[e]);
		return 0;
	}


}
