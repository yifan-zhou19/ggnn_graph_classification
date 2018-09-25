package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = Integer.parseInt(tempVar);
	  }
	  b = a / 10000;
	  if (b != 0)
	  {
		  c = 5;
	  }
	  else
	  {
		  b = a / 1000;
		  if (b != 0)
		  {
			  c = 4;
		  }
		  else
		  {
			  b = a / 100;
			  if (b != 0)
			  {
				  c = 3;
			  }
			  else
			  {
				  b = a / 10;
			  if (b != 0)
			  {
				  c = 2;
			  }
			  else
			  {
				  c = 1;
			  }
			  }
		  }
	  }
	  switch (c)
	  {
	  case 5:
		  System.out.printf("%d%d%d%d%d\n",a % 10,a % 100 / 10,a % 1000 / 100,a % 10000 / 1000,a / 10000);
		  break;
	  case 4:
		  System.out.printf("%d%d%d%d\n",a % 10,a % 100 / 10,a % 1000 / 100,a / 1000);
		  break;
	  case 3:
		  System.out.printf("%d%d%d\n",a % 10,a % 100 / 10,a / 100);
		  break;
	  case 2:
		  System.out.printf("%d%d\n",a % 10,a / 10);
		  break;
	  case 1:
		  System.out.printf("%d\n",a);
	  }
	  return 0;
	}
}

