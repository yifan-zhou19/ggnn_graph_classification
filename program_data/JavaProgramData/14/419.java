public class student
{
	  public int num;
	  public int x;
	  public int y;
}

package <missing>;

public class GlobalMembers
{
	public static int pfCompare(Object elem1, Object elem2)
	{
		int c;
		c = (int)elem1 - (int)elem2;
		return c;
	}
	public static student[] a = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
	public static int Main()
	{
		int n;
		int i;
		int j;
		int d = 0;
		int[] b = new int[100000];
		int[] c = new int[100000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
						String tempVar2 = ConsoleInput.scanfRead();
						if (tempVar2 != null)
						{
							a[i].num = Integer.parseInt(tempVar2);
						}
						String tempVar3 = ConsoleInput.scanfRead();
						if (tempVar3 != null)
						{
							a[i].x = Integer.parseInt(tempVar3);
						}
						String tempVar4 = ConsoleInput.scanfRead();
						if (tempVar4 != null)
						{
							a[i].y = Integer.parseInt(tempVar4);
						}
		}
		for (i = 0;i < n;i++)
		{
						b[i] = a[i].x + a[i].y;
		}
		qsort(b,n,(Integer.SIZE / Byte.SIZE),pfCompare);
		for (j = 0;j < n;j++)
		{
				 if (b[n - 1] == a[j].x + a[j].y)
				 {
						 System.out.printf("%d"" ""%d",a[j].num,b[n - 1]);
						 System.out.print("\n");
						 d++;
				 }
				 if (d == 3)
				 {
				 break;
				 }
		}
		for (i = n - 2;i > n - 4;i--)
		{
					  if (b[i] == b[i + 1])
					  {
					  continue;
					  }
					  else
					  {
									  for (j = 0;j < n;j++)
									  {
												  if (b[i] == a[j].x + a[j].y)
												  {
														  System.out.printf("%d"" ""%d",a[j].num,b[i]);
														  System.out.print("\n");
														  d++;
												  }
												  if (d == 3)
												  {
												  break;
												  }
									  }
									  if (d == 3)
									  {
									  break;
									  }
					  }
		}
	}


}

