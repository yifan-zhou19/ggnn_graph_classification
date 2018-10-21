package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int i = 1;
		int b;
		int r;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = Integer.parseInt(tempVar);
		}
		String d = new String(new char[100]);
		d = new Scanner(System.in).nextLine();
		do
		{
			String c = new String(new char[100]);
			c = new Scanner(System.in).nextLine();
			r = c.length();
			int t = 0;
			int m = 0;
			do
			{
				if (c.charAt(t) == '_')
				{
					t++;
				}
				else
				{
					if (c.charAt(t) >= 65 && c.charAt(t) <= 90)
					{
						t++;
					}
					else
					{
						if (c.charAt(t) >= 97 && c.charAt(t) <= 122)
						{
							t++;
						}
						else
						{
							if (c.charAt(t) >= 48 && c.charAt(t) <= 57)
							{
								t++;
							}
							else
							{
								t++;
								m = m + 1;
							}
						}
					}
				}
			}while (t <= (r - 1));
			if (m == 0)
			{
				if (c.charAt(0) == '_')
				{
					a[i] = 1;
					i++;
				}
				else
				{
					if (c.charAt(0) >= 65 && c.charAt(0) <= 90)
					{
						a[i] = 1;
						i++;
					}
					else
					{
						if (c.charAt(0) >= 97 && c.charAt(0) <= 122)
						{
							a[i] = 1;
							i++;
						}
						else
						{
							a[i] = 0;
							i++;
						}
					}
				}
			}
			else
			{
				a[i] = 0,i++;
			}
		}while (i <= b);
		int e = 1;
		do
		{
			System.out.printf("%d\n",a[e]);
			e++;
		}while (e <= b);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			e = Integer.parseInt(tempVar2);
		}
		return 0;
	}
}

