package <missing>;

public class GlobalMembers
{
	public static int pd(int a)
	{
		if (a == 1 || a == 3 || a == 5 || a == 7 || a == 8 || a == 10 || a == 12)
		{
		   return 31;
		}
		else if (a == 2)
		{
		   return 28;
		}
		else
		{
		   return 30;
		}
	}
	public static int Main()
	{
		   int i;
		   int y;
		   int a;
		   int b;
		   int n;
		   int l;
		   int m;
		   int s;
		   int t;
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   n = Integer.parseInt(tempVar);
		   }
		   for (i = 1;i <= n;i++)
		   {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  y = Integer.parseInt(tempVar2);
			  }
			  String tempVar3 = ConsoleInput.scanfRead(" ");
			  if (tempVar3 != null)
			  {
				  a = Integer.parseInt(tempVar3);
			  }
			  String tempVar4 = ConsoleInput.scanfRead(" ");
			  if (tempVar4 != null)
			  {
				  b = Integer.parseInt(tempVar4);
			  }
			  if (a < b)
			  {
				 t = a;
				 a = b;
				 b = t;
			  }
			  if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
			  {
				 s = 0;
				 if (b >= 3)
				 {
					for (b;b < a;b++)
					{
					   s = s + pd(b);
					}
					if (s % 7 == 0)
					{
					   System.out.print("YES\n");
					}
					else
					{
					   System.out.print("NO\n");
					}
				 }
				 else if (b <= 2 && a>2)
				 {
					for (;b < a;b++)
					{
					   s = s + pd(b);
					}
					s++;
					if (s % 7 == 0)
					{
					   System.out.print("YES\n");
					}
					else
					{
					   System.out.print("NO\n");
					}
				 }
				 else
				 {
					System.out.print("NO\n");
				 }
			  }
			  else
			  {
				 s = 0;
				 for (;b < a;b++)
				 {
					   s = s + pd(b);
				 }
					if (s % 7 == 0)
					{
					   System.out.print("YES\n");
					}
					else
					{
					   System.out.print("NO\n");
					}
			  }
		   }
	}

}

