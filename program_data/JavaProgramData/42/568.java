package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		  int[] a = new int[1000000];
		  int i;
		  int n;
		  int del;
		  int j;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 1;i <= n;i++)
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
			   del = Integer.parseInt(tempVar3);
		   }
		   for (i = 1;i <= n;i++)
		   {
							   if (a[i] == del)
							   {
								 for (j = i;j <= n;j++)
								 {
								 a[j] = a[j + 1];
								 }
								 i--;
								 n--;
							   }
		   }
		  for (i = 1;i < n;i++)
		  {
		  System.out.printf("%d ",a[i]);
		  }
		  System.out.printf("%d",a[n]);
	}

}

