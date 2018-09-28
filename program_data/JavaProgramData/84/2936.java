package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int k = 0;
		int j;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 int[] c = new int[100];
	 for (i = 0;i < n;i++)
	 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 c[i] = Integer.parseInt(tempVar2);
		 }
	  if (c[i] > c[k])
	  {
	  k = i;
	  }
	 }
	 System.out.printf("%d\n",c[k]);
	if (k == 0)
	{
		j = 1;
	 for (i = 2;i < n;i++)
	 {
	   if (c[i] > c[j])
	   {
		j = i;
	   }
	 }
	}
	else
	{
		j = 0;
	   for (i = 1;i < n;i++)
	   {
	   if (c[i] > c[j] && c[i] < c[k])
	   {
		j = i;
	   }
	   }
	}
	 System.out.printf("%d",c[j]);
	}
}

