package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int i;
		int j;
		int x;
		int y;
		int m;
		int l = 0;
		int t;
		String b = new String(new char[N]);
		String a = new String(new char[N]);
		String c = new String(new char[N]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = tempVar3.charAt(0);
		}

		for (y = 0;i < N;y++)
		{
			if (a.charAt(y) == '\0')
			{
				break;
			}
		}


		for (i = 0;i < N;i++)
		{
			m = 0;
			for (j = i;j - i < y;j++)
			{
				if (a.charAt(j - i) == b.charAt(j))
				{
					m++;
				}
			}
			if (m >= y)
			{
				break;
			}
		}

		   for (t = i;c.charAt(t - i) != 0 && t < 256;t++)
		   {
			b = tangible.StringFunctions.changeCharacter(b, t, c.charAt(t - i));
			if (c.charAt(t - i) == '\0')
			{
				break;
			}
		   }
		System.out.println(b);
		return 0;


	}

}

