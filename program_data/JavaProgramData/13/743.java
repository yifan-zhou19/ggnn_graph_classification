package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int count;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[] a = new int[100000];
		  for (i = 0;i < n;i++)
		  {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 a[i] = Integer.parseInt(tempVar2);
			 }
		  }
		  for (i = 0;i < n;i++)
		  {
			 for (j = i + 1;j < n;j++)
			 {
				if (a[j] == a[i])
				{
				a[j] = 0;
				}
			 }
		  }
				count = 0;
		  for (i = 0;i < n;i++)
		  {
						  if (a[i] != 0)
						  {
						  if (count == 0)
						  {
						  System.out.printf("%d",a[i]);
						  count = 1;
						  }
						  else
						  {
						  System.out.printf(" %d",a[i]);
						  }
						  }
		  }
		  System.in.read();
		  System.in.read();
	}


}

