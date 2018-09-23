package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
	  int n;
	  int i;
	  int j;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  int[] a = new int[n];
	  for (i = 0;i < n;i++)
	  {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a[i] = Integer.parseInt(tempVar2);
	  }
	  }
	  i = 0;
	  while (i < n)
	  {
		  for (j = i + 1;j < n;j++)
		  {
	   if (a[i] == a[j])
	   {
		   a[j] = 0;
	   }
		  }
	   i++;
	  }
	  System.out.printf("%d",a[0]);
	  i = 1;
	  for (i = 1;i < n;i++)
	  {
	  if (a[i] != 0)
	  {
		  System.out.printf(" %d",a[i]);
	  }
	  }
	 }
}

