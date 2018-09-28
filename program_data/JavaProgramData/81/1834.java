package <missing>;

public class GlobalMembers
{
	public static int su(int n, int m, tangible.RefObject<Integer> a)
	{
		int e = 0;
		int i;
		if (n >= 0 && n <= 4 && m >= 0 && m <= 4)
		{
								  for (i = 0;i < 5;i++)
								  {
								  e = (a.argValue + m * 5 + i);
								  *(a.argValue + m * 5 + i) = *(a.argValue + n * 5 + i);
								  *(a.argValue + n * 5 + i) = e;
								  }
		return 1;
		}
		else
		{
			return 0;
		}
	}
	public static void Main(String[] args)
	{
	  int[][] a = new int[5][5];
	  int i;
	  int j;
	  int m;
	  int n;

	  for (i = 0;i < 5;i++)
	  {
					  for (j = 0;j < 5;j++)
					  {
									  String tempVar = ConsoleInput.scanfRead();
									  if (tempVar != null)
									  {
										  a[i][j] = Integer.parseInt(tempVar);
									  }
					  }
	  }

	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  n = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  m = Integer.parseInt(tempVar3);
	  }
				  tangible.RefObject<Integer> tempRef_a = new tangible.RefObject<Integer>(a);
					  if (su(n, m, tempRef_a) != 0)
					  {
						  a = tempRef_a.argValue;
								 for (i = 0;i < 5;i++)
								 {
												for (j = 0;j < 4;j++)
												{
																System.out.printf("%d ",a[i][j]);
												}
												System.out.printf("%d\n",a[i][4]);
								 }
					  }
					  else
					  {
						  a = tempRef_a.argValue;
					  }
				  tangible.RefObject<Integer> tempRef_a2 = new tangible.RefObject<Integer>(a);
					  if (su(n, m, tempRef_a2) == 0)
					  {
						  a = tempRef_a2.argValue;
					  System.out.print("error");
					  }
					  else
					  {
						  a = tempRef_a2.argValue;
					  }




	}

}

