package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[103]);
		String a = new String(new char[103]);
		String b = new String(new char[103]);
		char[][] t = new char[103][103];
		int i;
		int len;
		int start = 0;
		int end = 1;
		int cur = 0;
		int k = 0;
		int w;
		int e;

		int result;
		String p = null;
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		len = s.length();
		w = a.length();
		e = b.length();


		while (end < len)
		{
			if (s.charAt(end) == ' ' || s.charAt(end) == 0)
			{
				for (i = start,k = 0;i < end;i++,k++)
				{
					t[cur][k] = s.charAt(i);
				}
					t[cur][k + 1] = '\0';
					cur++;
					start = end + 1;
					end = start + 1;
			}
			else
			{
				end++;
			}
		}


					for (i = start,k = 0;i < end;i++,k++)
					{
					t[cur][k] = s.charAt(i);
					}
					t[cur][k + 1] = '\0';
					cur++;

		for (i = 0;i < cur;i++)
		{
		if (i == cur - 1)
		{
			if (strcmp(t[i],a) == 0)
			{
				System.out.printf("%s",b);
			}
			else
			{
				System.out.printf("%s",t[i]);
			}
		}
		else
		{
			if (strcmp(t[i],a) == 0)
			{
				System.out.printf("%s ",b);
			}
			else
			{
				System.out.printf("%s ",t[i]);
			}
		}


		}

	}



}
