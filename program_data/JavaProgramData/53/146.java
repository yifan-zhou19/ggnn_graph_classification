package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int j;
	  int[] a = new int[95];
	  int l = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i <= n - 2;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[i] = Integer.parseInt(tempVar2);
		  }
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  a[i] = Integer.parseInt(tempVar3);
	  }
	  System.out.printf("%d",a[0]);
	  for (i = 1;i <= n - 1;i++)
	  {
		  for (j = 0;j <= i - 1;j++)
		  {
			  if (a[j] != a[i])
			  {
				  l++;
			  }
		  }
		   if (l == i)
		   {
			   System.out.printf(",%d",a[i]);
		   }
		   l = 0;
	  }
	   return 0;
	}
}

