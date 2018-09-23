package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sz = new String(new char[301]);
		int a = 0;
		int i;
		int k;
		int b;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sz = tempVar.charAt(0);
		}
		b = sz.length();
		char e;
		for (k = 1 ; k <= b ; k++)
		{
			for (i = 0; i < b - k; i++)
			{
					if (sz.charAt(i) >= sz.charAt(i + 1))
					{
						e = sz.charAt(i + 1);
						sz = tangible.StringFunctions.changeCharacter(sz, i + 1, sz.charAt(i));
						sz = tangible.StringFunctions.changeCharacter(sz, i, e);
					}
			}
		}

		for (i = 0;i < b;i++)
		{
			a = 0;
			for (k = i;k < b;k++)
			{

				if (sz.charAt(k) < 'a' || sz.charAt(k)>'z')
				{
					break;
				}
				if (sz.charAt(i) == sz.charAt(k))
				{
					a++;
				}
				if (sz.charAt(i) - sz.charAt(i - 1) == 0)
				{
					a = 0;
				}
			}
							  if (a != 0)
							  {
				System.out.printf("%c=%d\n",sz.charAt(i),a);
							  }
		}
		c = 0;
		for (i = 0;i < b;i++)
		{
			if (sz.charAt(i) >= 'a' && sz.charAt(i) <= 'z')
			{
				c++;
			}
		}
		if (c == 0)
		{
			System.out.print("No");
		}
		return 0;
	}


}

