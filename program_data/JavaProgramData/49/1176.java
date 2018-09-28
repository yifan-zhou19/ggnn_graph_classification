package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[500]);
		int i;
		int j;
		int p;
		int q;
		int l;
		int t = 1;
		s = new Scanner(System.in).nextLine();
		l = s.length();
		i = 0;
		j = 1;
		p = 0;
		q = 0;
		for (j = 1;j < l;j++)
		{

			for (i = 0;i <= l - j;i++)
			{
				for (p = i,q = i + j;p <= q;p++,q--)
				{
					if (s.charAt(p) == s.charAt(q))
					{
						t = t * 1;
					}
					else
					{
						t = t * 0;
					}
				}
				if (t == 1)
				{
					for (t = i;t < i + j;t++)
					{
						System.out.printf("%c",s.charAt(t));
					}
					System.out.printf("%c\n",s.charAt(i + j));
				}
				t = 1;
			}
		}
	}
}
