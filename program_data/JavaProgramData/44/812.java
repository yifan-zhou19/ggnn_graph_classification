package <missing>;

public class GlobalMembers
{
	public static int pow(int x,int y)
	{
	int i;
	int sum = 1;
	for (i = 0;i < y;i++)
	{
	sum *= x;
	}
	return (sum);

	}


	public static int rev(int x)
	{
	int i;
	int k;
	int j;
	int m;
	int ans = 0;
	if (x == 0)
	{
	ans = 0;
	}
	else
	{
		while (x % 10 == 0)
		{
			x = x / 10;
		}
		for (j = 0;x != 0;j++)
		{
		ans = ans * 10 + x % 10;
		x = x / 10;
		}

	}
	return (ans);
	}

	public static int Main()
	{
	int a;
	int i;
	  for (i = 0;i < 6;i++)
	  {
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = Integer.parseInt(tempVar);
	  }
	  System.out.printf("%d\n",rev(a));

	  }
	  return (0);

	}
}

