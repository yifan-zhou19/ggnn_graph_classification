package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int c = 0;
		  int f = 1;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  char[][] p = new char[1000][41];
		  for (int i = 0;i < n;i++)
		  {
				  String tempVar2 = ConsoleInput.scanfRead();
				  if (tempVar2 != null)
				  {
					  p[i] = tempVar2.charAt(0);
				  }
		  }
		  for (int j = 0;j < n;j++)
		  {
					   c = c + String.valueOf(p[j]).length();
					   if (c <= 80)
					   {
								if (f == 1)
								{
								  System.out.printf("%s",p[j]);
								  f = 0;
								}
								  else
								  {
								  System.out.printf(" %s",p[j]);
								  }
							  c++;
					   }
					   else
					   {
						   System.out.print("\n");
						   f = 1;
						   c = 0;
						   j--;
					   }
		  }
		  System.in.read();
		  System.in.read();
	}

}

