package <missing>;

public class GlobalMembers
{
	public static int f(int a)
	{
		if (a % 400 == 0 || (a % 4) == 0 && a % 100 != 0)
		{
		return 1;
		}
		else
		{
		return 2;
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
		  int i;
		  for (i = 0;i < n;i++)
		  {
						  int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
						  int m;
						  String tempVar2 = ConsoleInput.scanfRead();
						  if (tempVar2 != null)
						  {
							  m = Integer.parseInt(tempVar2);
						  }
						  if (f(m) == 1)
						  {
						  days[1] = 29;
						  }

						  else
						  {
						  days[1] == 28;
						  }

						  int a;
						  int b;
						  String tempVar3 = ConsoleInput.scanfRead();
						  if (tempVar3 != null)
						  {
							  a = Integer.parseInt(tempVar3);
						  }
						  String tempVar4 = ConsoleInput.scanfRead(" ");
						  if (tempVar4 != null)
						  {
							  b = Integer.parseInt(tempVar4);
						  }
						  int t;
						  if (a > b)
						  {
								 t = a;
								 a = b;
								 b = t;
						  }
						  int j;
						  int s = 0;
						  for (j = a;j < b;j++)
						  {
										  s += days[j - 1];
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
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}








}

