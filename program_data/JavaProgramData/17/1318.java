package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int p;
		int j;
		int k;
		int s;
		int l;
		String a = new String(new char[110]);
		char[] b = {' ', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 1;k <= n;k++)
		{
			s = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			l = a.length();
			for (i = 0;i <= l - 1;i++)
			{
				if (a.charAt(i) == '(')
				{
					s += 1;
					b[i] = ' ';
					continue;
				}
				else if (a.charAt(i) == ')')
				{
					if (s > 0)
					{
						s -= 1;
						b[i] = ' ';
						continue;

					}
					else if (s == 0)
					{
						b[i] = '?';
					}
					continue;
				}
				else
				{
					b[i] = ' ';
				}
				continue;


			}
			s = 0;
			for (i = l - 1;i >= 0;i--)
			{
				if (a.charAt(i) == ')')
				{
					s += 1;
					continue;
				}
				else if (a.charAt(i) == '(')
				{
					if (s > 0)
					{
						s -= 1;
						continue;

					}
					else if (s == 0)
					{
						b[i] = '$';
					}
					continue;
				}
			}

			for (j = 0;j <= l - 1;j++)
			{
				System.out.printf("%c",a.charAt(j));
			}

			System.out.print("\n");
			for (j = 0;j <= l - 1;j++)
			{
				System.out.printf("%c",b[j]);
			}
			System.out.print("\n");

		}


	}

}

