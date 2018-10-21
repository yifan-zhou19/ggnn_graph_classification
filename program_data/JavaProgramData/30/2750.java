package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int a;
	int b;
	int c;
	int d;
	c = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	for (b = 1;b <= a;b++)
	{
		if (b % 7 != 0)
		{
			if (b % 10 != 7)
			{
			  if (b / 10 != 7)
			  {
				c = c + b * b;
			  }
			}
		}
	}
	System.out.printf("%d",c);
	}
}

