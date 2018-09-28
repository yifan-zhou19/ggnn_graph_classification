package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < n;i++)
	  {
		int m;
		int j;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		 int[] a = new int[m];
		for (j = 0;j < m;j++)
		{
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  a[j] = Integer.parseInt(tempVar3);
		  }
		}
		if (m == 0)
		{
		  System.out.print("60\n");
		}
		else if (m == 1)
		{
		  if (a[0] <= 57)
		  {
			System.out.print("57\n");
		  }
		  else
		  {
			  System.out.printf("%d\n",a[0]);
		  }
		}
		else if (m > 1)
		{
		  for (j = 0;j < m - 1;j++)
		  {
			if ((a[m - 1] + 3 * m) <= 60)
			{
			  int e = 60 - 3 * m;
			  System.out.printf("%d\n",e);
			  break;
			}
			if ((a[m - 1] + 3 * m) > 60)
			{
			  if ((a[j] + 3 * (j + 1)) <= 60 && (a[j + 1] + 3 * (j + 2))>60)
			  {
				if ((a[j + 1] + 3 * (j + 1)) > 60)
				{
				  int e = 60 - 3 * (j + 1);
				  System.out.printf("%d\n",e);
				}
				else
				{
				  System.out.printf("%d\n",a[j + 1]);
				}
			  }
			}
		  }
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(a);
	  }
	  return 0;
	}
}

