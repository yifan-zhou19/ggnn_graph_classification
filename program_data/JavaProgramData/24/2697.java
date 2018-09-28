package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int l;
		int min = 1000;
		int max = 0;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		for (i = 0;i < n;i++)
		{
			for (j = 0;;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead(null, 1);
				if (tempVar2 != null)
				{
					a = tangible.StringFunctions.changeCharacter(a, j, tempVar2);
				}
				if (a.charAt(j) == ' ' || a.charAt(j) == '\n')
				{
					l = j;
					break;
				}
			}
			if (l > max)
			{
				max = l;
				for (j = 0;j < l;j++)
				{
					b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(j));
				}
			}
			if (l < min)
			{
				min = l;
				for (j = 0;j < l;j++)
				{
					c = tangible.StringFunctions.changeCharacter(c, j, a.charAt(j));
				}
			}
		}
		for (i = 0;i < max;i++)
		{
			System.out.printf("%c",b.charAt(i));
		}
		System.out.print("\n");
		for (j = 0;j < min;j++)
		{
			System.out.printf("%c",c.charAt(j));
		}
		return 0;
	}



}

