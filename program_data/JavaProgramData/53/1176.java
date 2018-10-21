package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[] array = new int[300];
	 int n;
	 int i;
	 int j;
	 int p;
	 int q;
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
		  array[i] = Integer.parseInt(tempVar2);
	  }
	 }

	 for (p = 0;p < n - 1;p++)
	 {
	  for (q = p + 1;q < n;q++)
	  {
	   if (array[p] == array[q])
	   {
		for (j = q;j < n - 1;j++)
		{
		 array[j] = array[j + 1];
		}
		n--;
		q--;
	   }
	  }
	 }
	 System.out.printf("%d",array[0]);
	 for (i = 1;i < n;i++)
	 {
	  System.out.printf(",%d",array[i]);
	 }
	 return 0;
	}


}

