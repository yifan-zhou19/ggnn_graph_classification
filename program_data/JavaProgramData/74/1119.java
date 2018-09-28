package <missing>;

public class GlobalMembers
{
	public static int su(int a)
	{
	  int f;
	  int flag = 1;
	  for (f = 2;f < a / 2;f++)
	  {
		  if (a % f == 0)
		  {
			  flag = 0;
			  break;
		  }
	  }
	  if (flag != 0)
	  {
		  return 1;
	  }
	  else
	  {
		  return 0;
	  }
	}
	public static int hui(int b)
	{
	  int w;
	  int g;
	  w = wei(b);
	  int[] c = new int[8];
	  for (g = w - 1;g >= 0;g--)
	  {
		 c[g] = b % 10;
		 b = b / 10;
	  }
	  int fla = 1;
	  for (g = 0;g < w;g++)
	  {
		if (c[g] != c[w - 1 - g])
		{
			fla = 0;
		}
	  }
	  if (fla == 1)
	  {
		  return 1;
	  }
	  else
	  {
		  return 0;
	  }
	}
	public static int wei(int c)
	{
	   if (c / 100000 != 0)
	   {
		   return 6;
	   }
	   else if (c / 10000)
	   {
		   return 5;
	   }
	   else if (c / 1000)
	   {
		   return 4;
	   }
	   else if (c / 100)
	   {
		   return 3;
	   }
	   else if (c / 10)
	   {
		   return 2;
	   }
	   else
	   {
		   return 1;
	   }

	}
	public static void Main()
	{
	   int m;
	   int n;
	   int i;
	   int[] a = new int[500];
	   int k = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   m = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(" ");
	   if (tempVar2 != null)
	   {
		   n = Integer.parseInt(tempVar2);
	   }
		   for (i = m;i <= n;i++)
		   {
		 if (su(i) != 0 && hui(i) != 0)
		 {
			a[k] = i;
			k = k + 1;
		 }
		   }
		   int j;
	   if (k > 0)
	   {
		   System.out.printf("%d",a[0]);
		   for (j = 1;j < k;j++)
		   {
			   System.out.printf(",%d",a[j]);
		   }
	   }
	   else
	   {
		   System.out.print("no");
	   }
	}
}

