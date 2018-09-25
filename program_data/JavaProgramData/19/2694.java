package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[105]);
		String b = new String(new char[105]);
		String s = new String(new char[105]);
		char[][] c = new char[105][105];
		int i;
		int len;
		int startp;
		int endp;
		int cur_c;
		int k;
		s = new Scanner(System.in).nextLine();
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = s.length();
		startp = 0;
		endp = 1,cur_c = 0;
		while (endp <= len)
		{
			if (s.charAt(endp) == ' ' || s.charAt(endp) == '\0')
			{
				for (i = startp,k = 0;i <= endp - 1;i++,k++)
				{
					c[cur_c][k] = s.charAt(i);
				}
				c[cur_c][k + 1] = '\0';
				cur_c++;
				startp = endp + 1;
				endp = startp + 1;
			}
			else
			{
				endp++;
			}
		}
		for (i = 0;i < cur_c;i++)
		{
			if (!strcmp(a,c[i]))
			{
				c[i] = b;
			}
		}
		System.out.print(c[0]);
		for (i = 1;i < cur_c;i++)
		{
			System.out.print(' ');
			System.out.print(c[i]);
		}
		System.out.print("\n");
	}

}

