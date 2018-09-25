package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int[] a = new int[20000];
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
				a[i] = Integer.parseInt(tempVar2);
			}
		  }
		  for (i = 1;i < n;i++)
		  {
			for (j = 0;j < i;j++)
			{
				if (a[i] == a[j] && a[i] != 0)
				{
					a[i] = 0;
				}
			}
		  }
			for (i = 0;i < n;i++)
			{
				  if (i == 0)
				  {
					 System.out.printf("%d",a[i]);
				  }
					 else
					 {
						   if (a[i] != 0)
						   {
						   System.out.printf(" %d",a[i]);
						   }
					 }
			}

	}
}

