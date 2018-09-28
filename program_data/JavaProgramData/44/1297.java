package <missing>;

public class GlobalMembers
{
	public static int reverse(int x)
	{
		int i;
		int s;
		int cishu;
		int[] sz = new int[20];
		int a;
		cishu = 0;
		a = 1;
		if (x < 0)
		{
			 a = -1;
			 x = -x;
		}
		  if (x == 0)
		  {
			  s = 0;
		  }
		  else
		  {
			  for (i = 1;;i++)
			  {
				 if (x % 10 == 0)
				 {
				   x /= 10;
				 }
				 else
				 {
					 break;
				 }
			  }
			  for (i = 0;;i++)
			  {
				sz[i] = x % 10;
				x = x / 10;
				cishu += 1;
				if (x == 0)
				{
					break;
				}
			  }
			  s = sz[0];
			  for (i = 1;i < cishu;i++)
			  {
				  s = 10 * s;
				  s = s + sz[i];
			  }
			  s = a * s;
		  }
		  return s;
	}

	public static int Main()
	{
		int p;
		int num;
		int k;
		for (k = 1;k < 7;k++)
		{
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   num = Integer.parseInt(tempVar);
		   }
		   p = reverse(num);
		   System.out.printf("%d\n",p);
		}
		return 0;
	}
}

