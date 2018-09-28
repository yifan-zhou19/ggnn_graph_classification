package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c1 = new String(new char[1000]);
		String c2 = new String(new char[1000]);
		int i;
		int j;
		int k = 0;
		int l1;
		int l2;
		int[] x = new int[1000];
		for (i = 0;i < 100;i++)
		{
			x[i] = -1;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c2 = tempVar2.charAt(0);
		}
		l1 = c1.length();
		l2 = c2.length();
		if (l1 != l2)
		{
			System.out.print("NO");
		}
		else
		{
			for (i = 0;i < l1;i++)
			{
				for (j = 0;j < l2;j++)
				{
					for (k = 0;k <= i;k++)
					{
						if (j == x[k])
						{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
							goto loop;
						}
					}
					if (c1.charAt(i) == c2.charAt(j))
					{
						x[i] = j;
					}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	if (true)
	{
		;
	}
				}
			}
			for (i = 0;i < l1;i++)
			{
				if (x[i] != -1)
				{
					continue;
				}
				else
				{
					System.out.print("NO");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto loop1;
				}
			}
			System.out.print("YES");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop1:
	if (true)
	{
		;
	}
		}
	}
}

