package <missing>;

public class GlobalMembers
{
	public static int prime(int x)
	{
		   int j = 1;
		   int i;
		   for (i = 2;i < x && j == 1;i++)
		   {
			if (x % i == 0)
			{
			j = 0;
			}
		   }
			return (j);
	}
	public static int hui(int x)
	{
		int i;
		int[] b = new int[100];
		int n;
		int a;
		a = 1;
		for (i = 1;x != 0;i++)
		{
					b[i] = x % 10;
					x = x / 10;
		}
		 n = i - 1;
		if (n % 2 == 0)
		{
				  for (i = 1;i <= n / 2;i++)
				  {
				  if (b[i] != b[n - i + 1])
				  {
				  a = 0;
				  break;
				  }
				  }
				  return a;
		}
		else
		{
				  for (i = 1;i <= (n - 1) / 2;i++)
				  {
				  if (b[i] != b[n - i + 1])
				  {
				  a = 0;
				  break;
				  }
				  }
				  return a;
		}

	}


	public static int Main()
	{
		  int m;
		  int n;
		  int i;
		  int j;
		  int count = 0;
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
						   if (prime(i) == 1)
						   {
						   if (hui(i) == 1)
						   {
							   if (count == 0)
							   {
							   System.out.printf("%d",i);
							   count++;
							   }
							   else
							   {
								   System.out.printf(",%d",i);
							   }
						   }
						   }
		  }
		  if (count == 0)
		  {
		  System.out.print("no\n");
		  }
		  System.in.read();
		  System.in.read();
	}


}

