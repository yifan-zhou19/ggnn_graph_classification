public class children
{
	public char bracket;
	public int code;
}

package <missing>;

public class GlobalMembers
{
	public static char boy;
	public static char girl;

	public static void Main()
	{
		void func(struct children chd[],int n);
		int scan = new int(struct children * p,char string[100]);
		children[] chd =
		{
			new children('\0', 0),
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null
		};
		children p;
		p = chd;
		String str = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		int len = scan(p, str);
		boy = str.charAt(0);
		int point = 0;
		for (point = 0;point < len;point++)
		{
			if (str.charAt(point) != boy)
			{
				girl = str.charAt(point);
				break;
			}
		}
		func(chd, len);
	}

	public static void func(children[] chd, int n)
	{
		void exile(struct children chd[],int friendcode,int lenx);
		int j = 0;
		for (j = 0;j < n;j++)
		{
			if (chd[j].bracket == '\0')
			{
				break;
			}
			if (chd[j].bracket == boy && chd[j + 1].bracket == girl)
			{
				System.out.printf("%d %d\n",chd[j].code,chd[j + 1].code);
				exile(chd, j, n);
				j = j - 1;
				n = n - 2;
			}
			else
			{
				if (chd[j].bracket == boy && chd[j + 1].bracket == boy)
				{
					func(chd + 1, n - 1);
				}
				else
				{
					if (chd[j].bracket == girl)
					{
						func(chd - 1, n + 1);
					}
				}
			}
		}
	}

//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'p', so pointers on this parameter are left unchanged:
	public static int scan(children * p, String string)
	{
		int i = 0;
		while (String[i] != '\0')
		{
			p.bracket = string[i];
			p.code = i;
			p += 1;
			i += 1;
		}
		return (i);
	}
	public static void exile(children[] chd, int friendcode, int lenx)
	{
		int k = 0;
		for (k = friendcode;k < lenx - 1;k++)
		{
			chd[k] = chd[k + 2];
		}
	}
}

