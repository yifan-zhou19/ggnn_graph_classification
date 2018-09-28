package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sho = new String(new char[100]);
		String lo = new String(new char[100]);
		int i;
		int sl;
		int l;
		int k;
		int j;
		int g;
		int h = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sho = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			lo = tempVar2.charAt(0);
		}
		sl = sho.length();
		l = lo.length();
		for (j = 0;j < l;j++)
		{

			if (sho.charAt(0) == lo.charAt(j))
			{
				g = j;
				for (k = g + 1,i = 1;k <= sl + g,i <= sl;k++,i++)
				{
					if (sho.charAt(i) == lo.charAt(k))
					{
						if (k == sl + g - 1)
						{
							h++;
							if (h == 1)
							{
							   System.out.printf("%d",g);
							}
							else if (h > 1)
							{
								break;
							}
						}
					}
					else
					{
						break;
					}
				}
			}

		}
		return 0;
	}



}

