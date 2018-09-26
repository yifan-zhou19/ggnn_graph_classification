package <missing>;

public class GlobalMembers
{
	public static int f(int a)
	{
		if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0))
		{
		return 0;
		}
		else
		{
		return 1;
		}
	}
	public static int Main()
	{
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int a;
		  int b;
		  int c;
		  int d = 0;
		  int k;
		  for (int i = 1;i <= n;i++)
		  {
				  d = 0;
				  String tempVar2 = ConsoleInput.scanfRead();
				  if (tempVar2 != null)
				  {
					  a = Integer.parseInt(tempVar2);
				  }
				  String tempVar3 = ConsoleInput.scanfRead(" ");
				  if (tempVar3 != null)
				  {
					  b = Integer.parseInt(tempVar3);
				  }
				  String tempVar4 = ConsoleInput.scanfRead(" ");
				  if (tempVar4 != null)
				  {
					  c = Integer.parseInt(tempVar4);
				  }
				  if (f(a) == 0)
				  {
				  if (c > b)
				  {
					  k = c;
					  c = b;
					  b = k;
				  }
						  while (b > c)
						  {
									if (c == 11)
									{
										d = d + 2;
									}
									if (c == 10)
									{
										d = d + 3;
									}
									if (c == 9)
									{
										d = d + 2;
									}
									if (c == 8)
									{
										d = d + 3;
									}
									if (c == 7)
									{
										d = d + 3;
									}
									if (c == 6)
									{
										d = d + 2;
									}
									if (c == 5)
									{
										d = d + 3;
									}
									if (c == 4)
									{
										d = d + 2;
									}
									if (c == 3)
									{
										d = d + 3;
									}
									if (c == 2)
									{
										d = d + 1;
									}
									if (c == 1)
									{
										d = d + 3;
									}
									c++;
						  }
						  if (d % 7 == 0)
						  {
						  System.out.print("YES\n");
						  }
						  else
						  {
						  System.out.print("NO\n");
						  }
				  }
					   if (f(a) == 1)
					   {
				  if (c > b)
				  {
					  a = c;
					  c = b;
					  b = a;
				  }
						  while (b > c)
						  {
									if (c == 11)
									{
										d = d + 2;
									}
									if (c == 10)
									{
										d = d + 3;
									}
									if (c == 9)
									{
										d = d + 2;
									}
									if (c == 8)
									{
										d = d + 3;
									}
									if (c == 7)
									{
										d = d + 3;
									}
									if (c == 6)
									{
										d = d + 2;
									}
									if (c == 5)
									{
										d = d + 3;
									}
									if (c == 4)
									{
										d = d + 2;
									}
									if (c == 3)
									{
										d = d + 3;
									}
									if (c == 1)
									{
									d = d + 3;
									}
									c++;
						  }
						  if (d % 7 == 0)
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

