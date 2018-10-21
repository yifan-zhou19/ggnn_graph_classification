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
	int x;
	int y;
	int a;
	int i = 0;
	int b = 0;
	if (n == 1)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		x = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		y = Integer.parseInt(tempVar3);
	}
	if (x < 90 || x>140 || y < 60 || y>90)
	{
	   b = 0;
	}
		  else
		  {
	  b = 1;
		  }
	}
	else
	{
	  while (true)
	  {
	  i++;
	if (i == n + 1)
	{
		  a = n + 1;
			  b = n;
		  break;
	}
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		x = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead(" ");
	if (tempVar5 != null)
	{
		y = Integer.parseInt(tempVar5);
	}
		if (x < 90 || x>140 || y < 60 || y>90)
		{
	  a = i;
	  b = a - b - 1;
		  break;
		}
	  }
	 while (i <= n != 0 && i >= a)
	 {
		i++;
			if (i == n + 1)
			{
		  if (n - a > b)
		  {
		b = n - a;
		break;
		  }
	  else
	  {
			  b = b;
			  break;
	  }
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				x = Integer.parseInt(tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				y = Integer.parseInt(tempVar7);
			}
			if (x < 90 || x>140 || y < 60 || y>90)
			{
				if (i - a - 1 > b)
				{
					b = i - a - 1;
					a = i;
				}
				else
				{
					b = b;
					a = i;
				}
			}
	 }
	}
		System.out.printf("%d",b);
		return 0;
	}

}

