package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[10];
	int m;
	int n;
	int x;
	int i;
	int w;
	int k;
	int t;
	int r;
	int time;
	int ji;
	int chu;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	time = 0;
	ji = 1;

	   for (x = m;x <= n;x++)
	   {

		   w = 0;
		   for (i = 2;i < x;i++)
		   {
			  if (x % i != 0)
			  {
				  w = w + 1;
				  if (w == x - 2)
				  {
										for (k = 1;k <= 100;k++)
										{
										  ji = (int)(Math.pow(10,k));
											if (x / ji == 0)
											{
											 t = k - 1;
											 break;
											}
										  else
										  {
											  continue;
										  }
										}


										   for (r = 0;r <= t;r++)
										   {
												chu = (int)(Math.pow(10,r));
												a[r] = (x / chu) % 10;
										   }


										  for (r = 0;r <= t;r++)
										  {
											   if (a[r] == a[t - r])
											   {

												  //if((time<t/2+1)&&(time>=t/2))
												  if (r == t)
												  {
													  if (time == 0)
													  {
													  System.out.printf("%d",x);
													  }
													  if (time >= 1)
													  {
														  System.out.printf(",%d",x);
													  }
														  time = time+1;
												  } //continue;
											   }
											 else
											 {
												 break;
											 }
										  }
				  }

			  }
			  else
			  {
				  break;
			  }
		   }
	   }
	   if (time == 0)
	   {
		   System.out.print("no");
	   }

	return 0;
	}
}

