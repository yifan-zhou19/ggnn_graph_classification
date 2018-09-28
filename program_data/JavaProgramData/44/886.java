package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int m;
	int i;
	int reverse = int num;
	for (i = 0;i < 6;i++)
	{
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 n = Integer.parseInt(tempVar);
			 }
			 m = reverse(n);
			 System.out.printf("%d\n",m);
	}
	System.in.read();
	System.in.read();
	System.in.read();
	}
	public static int reverse(int num)
	{
	int k;
	int p;
	p = 0;
	k = 0;
	if (num == 0)
	{
	return (0);
	}
	else
	{
			  if (num > 0)
			  {
					if (num < 10)
					{
					return (num);
					}
					else
					{
						while (k == 0)
						{
						   k = num % 10;
							if (k != 0)
							{
							break;
							}
						   num = num / 10;
						}
						while (num != 0)
						{
							 k = num % 10;
							 num = num / 10;

									p = p + k;
									p = 10 * p;
						}
						  return (p / 10);
					}
			  }
			   else
			   {
				   num = -num;
				  if (num < 10)
				  {
					return (num);
				  }
					else
					{
						while (k == 0)
						{
						   k = num % 10;
							if (k != 0)
							{
							break;
							}
						   num = num / 10;
						}
						while (num != 0)
						{
							 k = num % 10;
							 num = num / 10;

									p = p + k;
									p = 10 * p;
						}
						  return (-p / 10);
					}
			   }
	}
	}

}

