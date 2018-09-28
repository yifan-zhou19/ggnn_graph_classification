package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int al;
		int bl;
		int j;
		int i;
		int m;
		int n = 0;
		String a = new String(new char[255]);
		String b = new String(new char[255]);
		String ab = new String(new char[255]);
		char c = 62;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = tempVar3.charAt(0);
		}
		al = a.length();
		bl = b.length();
		if (al > bl)
		{
			m = bl;
			bl = al;
			al = m;
			ab = a;
			a = b;
			b = ab;
		} //b is larger than a
		for (i = al - 1;i >= 0;i--)
		{
			j = i - al + bl;
			b.charAt(j) += a.charAt(i) - 48;
		}
		for (i = bl - 1;i >= 0;i--)
		{
			if (b.charAt(i) > 57)
			{
				b.charAt(i) -= 10;
				if (i > 0)
				{
					b.charAt(i - 1)++;
				}
				else
				{
					n = 1;
				}
			}
		}
		if (n != 0)
		{
			System.out.print("1");
			System.out.printf("%s\n",b);
		}
		else
		{
			for (i = 0;i < bl;i++)
			{
				if (b.charAt(i) != '0')
				{
					for (j = i;j < bl;j++)
					{
						System.out.printf("%c",b.charAt(j));
					}
					break;
				}
				else
				{
					if (i == 0 && bl == 1)
					{
						System.out.print("0\n");
					}
				}
			}
		}
		return 0;
	}
}

