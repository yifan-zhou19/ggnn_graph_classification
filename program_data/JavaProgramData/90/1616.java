package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int a = new int(int x,int y);
		  int t;
		  int n;
		  int m;
		  int i;
		  int g;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  t = Integer.parseInt(tempVar);
		  }
		  for (i = 1;i <= t;i++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  m = Integer.parseInt(tempVar2);
			  }
			  String tempVar3 = ConsoleInput.scanfRead(" ");
			  if (tempVar3 != null)
			  {
				  n = Integer.parseInt(tempVar3);
			  }
				  g = a(m, n);
				  System.out.printf("%d\n",g);


		  }


	}

		  public static int a(int x,int y)
		  {
			  int t;
			  if (x < y)
			  {
			  t = a(x, y - 1);
			  }
			 else
			 {
			 if (x == 0)
			 {
			t = 1;
			 }
			 else
			 {
			   if (y == 0)
			   {
			   t = 0;
			   }
			  else
			  {
				  if (x == 1 && y == 1)
				  {

								t = 1;
				  }
				else
				{
				t = a(x, y - 1) + a(x - y, y);
				}
			  }
			 }
			 // printf("%d",t);
			 }
			  return (t);
		  }

}

