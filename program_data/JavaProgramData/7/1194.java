package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int la;
		int lb;
		int i;
		int j;
		int n;
		int k;
		int x;
		int p;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		String d = new String(new char[100]);
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
			d = tempVar3.charAt(0);
		}
		la = a.length();
		lb = b.length();
		n = la - lb;
		for (i = 0;i <= n;i++)
		{
			if (b.charAt(0) == a.charAt(i))
			{
				k = i;
				p = i;
				for (j = 0;j < lb;j++)
				{
					c = tangible.StringFunctions.changeCharacter(c, j, a.charAt(k));
					k++;
				}
				c = tangible.StringFunctions.changeCharacter(c, lb, '\0');
				if (strcmp(c,b) == 0)
				{
					for (x = 0;x < lb;x++)
					{
						a = tangible.StringFunctions.changeCharacter(a, p, d.charAt(x));
						p++;
					}
					break;
				}
			}
			else
			{
				continue;
			}
		}


	System.out.printf("%s",a);

	}
}

