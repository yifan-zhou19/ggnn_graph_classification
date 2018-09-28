package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int[] a = new int[300];
	  int j;
	  int m;
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
	  System.out.printf("%d",a[0]);
	  for (i = 1;i < n;i++)
	  {
		 m = 0;
		 for (j = 0;j < i;j++)
		 {
			if (a[i] == a[j])
			{
			   m = 1;
			}
		 }
		 if (m == 0)
		 {
			System.out.printf(",%d",a[i]);
		 }
	  }
	  return 0;
	}

}

