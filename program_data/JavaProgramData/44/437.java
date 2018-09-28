package <missing>;

public class GlobalMembers
{
	public static int dao(int x)
	{
	   int s;
	   int i;
	   int r = 1;
	   int[] a = new int[100];
	   int y = 0;
	   if (x < 0)
	   {
		   x = -x;
	   }
	   int p = x;
	   for (i = 0;;i++)
	   {
		 if (p / 10 > 0)
		 {
		 a[i] = p % 10;

		 p = p / 10;
		 }
		else
		{
			a[i] = p % 10;
			i++;
			s = i;
			break;
		}
	   }
	   for (int j = 0;j <= s - 1;j++)
	   {
		 for (int k = 0;k <= j - 1;k++)
		 {
			  r = r * 10;
		 }

		y = y + a[s - j - 1] * r;
		r = 1;
	   }
	   if (x > 0)
	   {
	   return y;
	   }
	   else
	   {
		   return -y;
	   }
	}
	public static int Main()
	{
	  int[] a = new int[100];
	  for (int i = 0;i <= 5;i++)
	  {
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a[i] = Integer.parseInt(tempVar);
	  }
	  if (a[i] > 0)
	  {
		  System.out.printf("%d\n",dao(a[i]));
	  }
	  else
	  {
		  System.out.printf("%d\n",-dao(a[i]));
	  }

	  }
	  int y;
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  y = Integer.parseInt(tempVar2);
	  }
	  return 0;

	}


}

