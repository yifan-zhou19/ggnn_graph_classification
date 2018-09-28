package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i = 2;
		  int l = 2;
		  int n;
		  int m1 = 0;
		  int m2 = 0;
		  int k = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 2;i <= n - 2;i++)
		  {
			  for (l = 2;l <= i / 2;l++)
			  {
				  if (i % l == 0)
				  {
				  m1++;
				  }
			  }
			  l = 2;
			  if (m1 == 0)
			  {
						for (l = 2;l <= (i + 2) / 2;l++)
						{
							if ((i + 2) % l == 0)
							{
							m2++;
							}
						}
						l = 2;
						if (m2 == 0)
						{
								  System.out.printf("%d %d\n",i,i + 2);
								  k++;
						}
			  }
			  m1 = 0;
			  m2 = 0;
		  }
		  if (k == 0)
		  {
		  System.out.print("empty\n");
		  }
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}
}

