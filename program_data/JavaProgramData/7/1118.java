package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String a = new String(new char[257]);
		String b = new String(new char[257]);
		String r = new String(new char[257]);
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
			r = tempVar3.charAt(0);
		}
		int c;
		int d;
		int count;
		int e;
		int j;
		int h;
		int y;
		c = a.length();
		d = b.length();
		e = r.length();


		for (j = 0;j < d;j++)
		{
		   y = 0;
			h = j;
			if (b.charAt(j) != a.charAt(0))
			{
				continue;
			}
			else
			{
				count = 1;
				for (int t = 1;t < c;t++)
				{

					if (a.charAt(t) == b.charAt(j + t))
					{
						count++;
					}

				}
			}
			if (count == c)
			{
				y = 1;
				break;
			}
			if (y == 1)
			{
				break;
			}

		}
		if (y == 1)
		{

		for (j = 0;j < h;j++)
		{
		System.out.printf("%c",b.charAt(j));
		}
		for (j = 0;j < e;j++)
		{
		System.out.printf("%c",r.charAt(j));
		}
		for (j = h + c;j < d;j++)
		{
		System.out.printf("%c",b.charAt(j));
		}
		}
		else
		{
			System.out.printf("%s",b);
		}


	}
}

