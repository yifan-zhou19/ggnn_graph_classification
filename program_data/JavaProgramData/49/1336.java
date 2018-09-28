package <missing>;

public class GlobalMembers
{
	public static int panduan(tangible.RefObject<String> c, int l)
	{
		int f = 0;
		int t = 0;
		int i;
		if (l % 2 == 0)
		{
			for (i = 0;i <= (l / 2) - 1;i++)
			{
				if (*(c.argValue.Substring(i)) == *(c.argValue.Substring(l) - 1 - i))
				{
					f += 1;
				}
			}
			if (f == l / 2)
			{
				t = 1;
			}
		}
		else
		{
			f = 0;
			for (i = 0;i <= (l - 3) / 2;i++)
			{
				if (*(c.argValue.Substring(i)) == *(c.argValue.Substring(l) - 1 - i))
				{
					f += 1;
				}
			}
			if (f == (l - 1) / 2)
			{
				t = 1;
			}
		}
		return (t);
	}
	public static int Main()
	{
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int i;
		int l;
		int f;
		int k;
		String c = new String(new char[100]);
		int panduan = new int(char * c,int l);
		c = new Scanner(System.in).nextLine();
		n = c.length();
		for (i = 2;i <= n;i++)
		{
			for (l = 0;l <= n - 1;l++)
			{
				p = c.charAt(l);
			tangible.RefObject<String> tempRef_p = new tangible.RefObject<String>(p);
				f = panduan(tempRef_p, i);
				p = tempRef_p.argValue;
				if (f == 1)
				{
					for (k = l;k <= l + i - 2;k++)
					{
						System.out.printf("%c",c.charAt(k));
					}
					System.out.printf("%c\n",c.charAt(l + i - 1));
				}
			}
		}
		return 0;
	}





}

