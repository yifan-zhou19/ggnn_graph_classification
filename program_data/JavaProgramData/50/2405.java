package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int a;
		  int b;
		  int c;
		  int d;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = Integer.parseInt(tempVar);
		  }
		  for (b = 1,c = 13;b <= 12;b++)
		  {
							d = (c - 1) % 7;
							if ((d + a) % 7 == 5)
							{
										  System.out.printf("%d\n",b);
							}
										  if (b == 1 || b == 3 || b == 5 || b == 7 || b == 8 || b == 10)
										  {
										  c = c + 31;
										  }
										  else if (b == 4 || b == 6 || b == 9 || b == 11)
										  {
										  c = c + 30;
										  }
										  else
										  {
										  c = c + 28;
										  }
		  }
	}
}

