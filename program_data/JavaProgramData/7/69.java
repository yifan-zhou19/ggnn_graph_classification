package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		int lenb;
		int lena;
		int len;
		int i = 0;
		int j;
		int k;
		int flag;
		c = new Scanner(System.in).nextLine();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		len = c.length();
		lena = a.length();
		lenb = b.length();
		for (i = 0;i < len;++i)
		{
			if (c.charAt(i) == a.charAt(0))
			{
				flag = 1;
				for (j = 0;j < lena && i + j < len;++j)
				{
					if (a.charAt(j) != c.charAt(i + j))
					{
						flag = 0;
						break;
					}
				}
				if (flag != 0)
				{
					System.out.printf("%s",b);
					i += lena;
					break;
				}
				else
				{
					System.out.printf("%c",c.charAt(i));
				}
			}
			else
			{
				System.out.printf("%c",c.charAt(i));
			}
		}
		System.out.printf("%s",c.Substring(i));
		return 0;
	}

}

