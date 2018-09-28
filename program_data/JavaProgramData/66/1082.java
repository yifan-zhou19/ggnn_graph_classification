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
		int j;
		int k;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		a = a - 1;
		d = a / 400;
		e = a % 400;
		f = e / 100;
		h = e / 4;
		g = d * ((303 * 365 + 97 * 366) % 7) % 7 + (h - f) * 366 + (e - h + f) * 365;
		b = b - 1;
		for (i = 0;i < 12;i++)
		{
		switch (i)
		{
		  case 0:
		  {
			 j = 0;
			 break;
		  }
		  case 1:
		  case 3:
		  case 5:
		  case 7:
		  case 8:
		  case 10:
		  {
			 j = 31;
			 break;
		  }
		  case 4:
		  case 6:
		  case 9:
		  case 11:
		  {
			 j = 30;
			 break;
		  }
		  default :
			 a = a + 1;
			 if (((a % 4 == 0) && (a % 100 != 0)) || (a % 400 == 0))
			 {
			 j = 29;
			 }
			 else
			 {
			 j = 28;
			 }
		}
		 sum += j;
		 if (i == b)
		 {
		  break;
		 }
		}
	   k = g + sum + c;
	   if (k % 7 == 0)
	   {
	   System.out.print("Sun.");
	   }
	   else if (k % 7 == 1)
	   {
	   System.out.print("Mon.");
	   }
	   else if (k % 7 == 2)
	   {
	   System.out.print("Tue.");
	   }
	   else if (k % 7 == 3)
	   {
	   System.out.print("Wed.");
	   }
	   else if (k % 7 == 4)
	   {
	   System.out.print("Thu.");
	   }
	   else if (k % 7 == 5)
	   {
	   System.out.print("Fri.");
	   }
	   else
	   {
	   System.out.print("Sat.");
	   }
	   return 0;
	}


}

