package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int a;
		 int b;
		 int c;
		 int d;
		 int e;
		 int f;
		 int g;
		 int h;
		 int i;
		 int j = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  c = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  d = Integer.parseInt(tempVar2);
	  }
	  i = 0;
	  for (a = c;a <= d;a++)
	  {
	   b = a;
	   e = 0;
				 while (b != 0)
				 {
		 e = e * 10 + b % 10;
		 b /= 10;
				 }
		if (e == a)
		{
		 h = 0;
		 for (f = 2;f < e;f++)
		 {
		  g = e % f;
		  if (g == 0)
		  {
		   h = 1;
		   break;
		  }
		 }
		 if (h == 0)
		 {
			 System.out.printf("%d",e);
			 i++;
			 j = 1;
		 }
		}
		if (j == 1)
		{
	   break;
		}
	  }
	  for (a = a + 1;a <= d;a++)
	  {
		  b = a;
		  e = 0;
				 while (b != 0)
				 {
		 e = e * 10 + b % 10;
		 b /= 10;
				 }
		if (e == a)
		{
		 h = 0;
		 for (f = 2;f < e;f++)
		 {
		  g = e % f;
		  if (g == 0)
		  {
		   h = 1;
		   break;
		  }
		 }
		 if (h == 0)
		 {
			 System.out.printf(",%d",e);
			 i++;
		 }
		}

	  }
		if (i == 0)
		{
			System.out.print("no");
		}
	  return 0;
	}
}

