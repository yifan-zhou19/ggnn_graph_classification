package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int m;
	  int n;
	  int x;
	  int i;
	  int r;
	  int y;
	  int k;
	  int s;
	  int c;
	  int time;
	  int t;
	  int haha;
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
	  c = 0;

	  for (x = m;x <= n;x++)
	  {
		  time = 0;
		  for (i = 2;i < x;i++)
		  {
			 if (x % i != 0)
			 {
				 time = time+1;
			 }
			 else
			 {
				 break;
			 }
		  }

		  if (time == x - 2)
		  {
			  y = 0;
			  for (r = 0;;r++)
			  {
				  haha = Math.pow(10,r); //pow????????><.....???
				  if (x / haha == 0)
				  {
					  break;
				  }
			  }
			  t = x; //?x???t?????x?m?n??????x???????????????????~
			  for (k = 1;k <= r;k++) //?????????~?????????~
			  {
				  s = t % 10;
				  t = t / 10;
				  y = 10 * y + s;
			  }
			  if (x == y)
			  {
				  c = c + 1;
				if (c == 1) //????????????????????c??????~~
				{
					System.out.printf("%d",x);
				}
				if (c > 1)
				{
					System.out.printf(",%d",x);
				}
			  }
		  }
	  }
	  if (c == 0)
	  {
			  System.out.print("no");
	  }
	}
}

