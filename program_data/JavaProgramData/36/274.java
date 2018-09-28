package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[1000]);
		String str2 = new String(new char[1000]);
		int n;
		int m;
		int i;
		int l;
		int com = new int(char,char yy[],int);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str2 = tempVar2.charAt(0);
		}
		m = str1.length();
		n = str2.length();
		if (m != n)
		{
			System.out.print("NO");
		}
		else
		{
			for (i = 0,l = 0;i < m;i++)
			{
				if (com(str1.charAt(i), str2, m) == 1)
				{
					l = l + 1;
					continue;
				}
				else
				{
					break;
				}
			}
			if (l < m)
			{
				System.out.print("NO");
			}
			else
			{
				System.out.print("YES");
			}
		}
	}

	public static int com(char x, String yy, int y)
	{
		int i;
		int z = 0;
		for (i = 0;i < y;i++)
		{
			if (yy[i].equals(x))
			{
				z = 1;
				yy[i] = '\0';
				break;
			}
		}
		return (z);
	}
}

