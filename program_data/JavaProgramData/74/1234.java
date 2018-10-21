package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int m;
		 int n;
		 int i;
		 int t = 0;
		 int de;
		 int p;
		 int res;
		  int f = int x;
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

				res = 0;
				p = i;
				while (p != 0)
				{
						de = p % 10;
						res = res * 10 + de;
						p /= 10;
				}
				if (res == i)
				{
			   if (f(i) != 0)
			   {
				   if (t == 0)
				   {
					System.out.printf("%d",i);
					t++;
				   }
				else
				{
					System.out.printf(",%d",i);
					t++;
				}
			   }
				}


		  }
		  if (t == 0)
		  {
			  System.out.print("no\n");
		  }
		  System.in.read();
		  System.in.read();
	}

	public static int f(int x)
	{
	int i;
	if (x == 1 || x == 2 || x == 3 || x == 5)
	{
	return 1;
	}
	else if (x % 2)
	{
	for (i = 3; i <= x / 2 + 1; i += 2)
	{
	if (x % i == 0)
	{
		return 0;
	}
	}
	return 1;
	}
	else
	{
	return 0;
	}
	}

}

