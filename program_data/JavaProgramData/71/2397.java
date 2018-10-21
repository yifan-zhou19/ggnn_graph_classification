package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int y;
		  int x;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[] s = new int[12];
		  for (int i = 0;i < n;i++)
		  {
				  int a;
				  int b;
				  int c;
				  int z = 0;
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
				  if ((a % 400 == 0) || (a % 100 != 0 && a % 4 == 0))
				  {
						 s[0] = 31;
						  s[1] = 29;
						  s[2] = 31;
						   s[3] = 30;
						   s[4] = 31;
						   s[5] = 30;
							s[6] = 31;
							 s[7] = 31;
							  s[8] = 30;
							   s[9] = 31;
								s[10] = 30;
								 s[11] = 31;
				  }
				  else
				  {
						 s[0] = 31;
						  s[1] = 28;
						  s[2] = 31;
						   s[3] = 30;
						   s[4] = 31;
						   s[5] = 30;
							s[6] = 31;
							 s[7] = 31;
							  s[8] = 30;
							   s[9] = 31;
								s[10] = 30;
								 s[11] = 31;
				  }
				  y = (b > c)?b:c;
				  x = (b < c)?b:c;
				  for (int j = x;j < y;j++)
				  {
						  z += s[j - 1];
				  }
				  if (z % 7 == 0)
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
	}

}

