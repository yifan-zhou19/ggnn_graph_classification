package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int a;
	int i;
	int n;
	int[] b = new int[100];
	int c; //a'
	for (i = 0;i < 101;i++)
	{
	b[i] = 0;
	}
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	c = a;
	for (i = 0;i < a;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b[i] = Integer.parseInt(tempVar2);
		}

	}
	for (i = 0;i < a;i++)
	{
		if (i != 0)
		{
			for (n = i - 1;n >= 0;n--)
			{
				if (b[i] == b[n])
				{
					b[i] = 0;
					c--;
				}
			}
		}

	}
	for (i = 0;i < a;i++)
	{
		if (b[i] != 0)
		{
			if (i == 0)
			{
				System.out.printf("%d",b[i]);
			}
			else
			{
				System.out.printf(",%d",b[i]);
			}
		}
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b[0] = Integer.parseInt(tempVar3);
	}
	}


}

