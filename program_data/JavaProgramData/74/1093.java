package <missing>;

public class GlobalMembers
{
	public static int huiwen(int a,int n)
	{
	if (a / 10 == 0)
	{
		return (n * 10 + a);
	}
	else
	{
		return (huiwen(a / 10, n * 10 + a % 10));
	}
	}

	public static int Main()
	{
	int a;
	int b;
	int j;
	int flag1;
	int flag2 = 0;
	int i;
	int k;
	int h;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		b = Integer.parseInt(tempVar2);
	}
	  for (i = a;i <= b;i++)
	  {
		  flag1 = 1;
		  k = Math.sqrt(i);
		for (j = 2;j <= k;j++)
		{
			if (i % j == 0)
			{
				flag1 = 0;
			}
		}
		if (flag1 != 0)
		{
			h = huiwen(i, 0);
			if (h == i)
			{
				if (flag2 != 0)
				{
					System.out.print(",");
				}
				System.out.printf("%d",i);

				flag2 = 1;
			}
		}
	  }
	  if (flag2 == 0)
	  {
		  System.out.print("no");
	  }
	}

}

