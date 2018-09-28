package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int l;
		int i;
		int j;
		int c;
		int d;
		int e;
		int[] b = new int[100];
		String a = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		l = a.length();
		for (i = 0;i < l;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 48);
		}
		if (l == 1 || (l == 2 && a.charAt(0) * 10 + a.charAt(1) < 13))
		{
			d = 0;
			if (l == 2)
			{
			e = a.charAt(0) * 10 + a.charAt(1);
			}
			else
			{
			e = a.charAt(0);
			}
			System.out.printf("%d\n",d);
			System.out.printf("%d",e);
		}

		else
		{
		for (j = 0,i = 0;j < l - 1 ;j++)
		{
			b[j] = (a.charAt(i) * 10 + a.charAt(i + 1)) / 13;
			a = tangible.StringFunctions.changeCharacter(a, i + 1, (a.charAt(i) * 10 + a.charAt(i + 1)) % 13);
			c = a.charAt(i + 1);
			i = i + 1;
		}
		if (b[0] == 0)
		{
			for (j = 1;j < l - 1;j++)
			{
			System.out.printf("%d",b[j]);
			}
		}
		else
		{
			for (j = 0;j < l - 1;j++)
			{
			System.out.printf("%d",b[j]);
			}
		}
		System.out.print("\n");
		System.out.printf("%d",c);
		}
		System.in.read();
		System.in.read();
		System.in.read();
	}




}

