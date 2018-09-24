package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[] a = new int[20000];
	 int i;
	 int j;
	 int k;
	 int x;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 x = Integer.parseInt(tempVar);
	 }
	 for (i = 0;i < x;i++)
	 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a[i] = Integer.parseInt(tempVar2);
		 }
	 }
	 for (i = 0;i < x;i++)
	 {
	  for (j = i + 1;j < x;j++)
	  {
	   if (a[i] == a[j])
	   {
		   x--;
		for (k = j;k < x;k++)
		{
		 a[k] = a[k + 1];
		}
		j--;
	   }
	  }
	 }
	 for (i = 0;i < x - 1;i++)
	 {
		 System.out.printf("%d ",a[i]);
	 }
	 if (i < x)
	 {
		 System.out.printf("%d",a[i]);
	 }
	 return 0;
	}
}

