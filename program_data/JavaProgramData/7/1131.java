package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[200]);
		String b = new String(new char[300]);
		String c = new String(new char[300]);
		int d = 0;
		int i;
		int j;
		int k;
		int m;
		int n;
		int lenb;
		int lena;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = tempVar3.charAt(0);
		}
		lena = a.length();
		lenb = b.length();
		for (i = 0;i < lena;i++)
		{
			if (a.charAt(i) == b.charAt(0))
			{
				for (j = i,k = 0;j < i + lenb,k < lenb;j++,k++)
				{
					if (a.charAt(j) != b.charAt(k))
					{
						break;
					}
				}
				if (k == lenb)
				{
					d = 1;
				}
			}
			if (d == 1)
			{
				break;
			}
		}
		if (d == 1)
		{
			for (m = i,n = 0;m < i + lenb,n < lenb;m++,n++)
			{
				a = tangible.StringFunctions.changeCharacter(a, m, c.charAt(n));
			}
			System.out.printf("%s",a);
		}
		if (d == 0)
		{
			System.out.printf("%s",a);
		}
		return 0;
	}

}

