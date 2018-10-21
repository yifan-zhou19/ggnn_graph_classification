package <missing>;

public class GlobalMembers
{
	public static int ss(int x) //???????
	{
	  int k;
	  int y;
	  int z;
	  k = (int)Math.sqrt(x);

	  for (y = 3;y <= k;y = y + 2)
	  {
	  if (x % y == 0)
	  {
		  break;
	  }
	  }
	  if (y > k)
	  {
		  z = 1;
	  }
	  else
	  {
		  z = 0;
	  }
	  return (z);
	}

	public static void Main()
	{
	  int n; // i????????n???
	  int i;
	  int p; //p?????????m=n-p
	  int m;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 6;i <= n;i += 2)
	  {
	  p = 3;
		 while (p < i - 2)
		 {
		   if (ss(p) != 0)
		   {
		   m = i - p;
		   if (ss(m) != 0)
		   {
			   System.out.printf("%d=%d+%d\n",i,p,m);
			   break;
		   }
		   else
		   {
			   p += 2;
		   }
		   }
		   else
		   {
			   p += 2;
		   }
		 }

	  }
	}


}

