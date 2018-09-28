package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		int i;
		int j;
		int m;
		int k;
		int n = 0;
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = tempVar3.charAt(0);
		}
		m = b.length();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) == b.charAt(0))
			{
				n = 0;
				for (j = 0;b.charAt(j) != '\0';j++)
				{
					if (a.charAt(i + j) == b.charAt(j))
					{
						n++;
					}
				}
				if (m == n)
				{
					break;
				}
			}
		}
	if (m == n)
	{
		for (k = 0;k < i;k++)
		{
			System.out.printf("%c",a.charAt(k));
		}
		System.out.printf("%s",c);
		for (k = i + m;a.charAt(k) != '\0';k++)
		{
			System.out.printf("%c",a.charAt(k));
		}
	}


		if (n != m)
		{
			System.out.printf("%s",a);
		}
		return 0;
	}




}

