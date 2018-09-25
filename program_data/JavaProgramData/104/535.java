package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		int i;
		int j;
		int j2 = 1;
		int a1;
		int b1;
		b1 = b;
		for (i = 1;;i++)
		{
			int i1 = 1;
			int j1 = 1;
			a1 = a;
			for (j = 1;;j++)
			{
				if (a1 != b1)
				{
					a1 /= 2;
					j1++;
					j2 = j1;
					if (a1 == 0)
					{
						break;
					}
				}
				else
				{
					i1 = 0;
					break;
				}
			}
			if (i1 == 0)
			{
				break;
			}
			else
			{
				b1 /= 2;
			}
		}
		if (a == 1)
		{
			System.out.print("1");
		}

		else if (j2 == 1)
		{
			System.out.printf("%d",a);
		}
		else
		{
			for (i = 1;i < j2;i++)
			{
				a /= 2;
			}
			System.out.printf("%d",a);
		}

	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		i = Integer.parseInt(tempVar3);
	}
		return 0;
	}
}

