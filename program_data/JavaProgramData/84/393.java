package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  int b;
	  int i;
	  int k;
	  i = 0;
	  k = 1;
	  int[] a = new int[100];
	  int maxindex;
	  int c;
	  c = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  b = Integer.parseInt(tempVar);
	  }
	  for (i = 0; i < 100; i++)
	  {
			   a[i] = 0;
	  }
	  if (b > 1 && b < 100)
	  {
		 for (i = 0;i < b;i++)
		 {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 (a[i]) = Integer.parseInt(tempVar2);
			 }
		 }
		 for (k = 1;k <= 2;k++)
		 {
			for (i = 0;i <= 100 - k - 1;i++)
			{
			   if (a[i] > a[i + 1])
			   {
	 c = a[i];
			   a[i] = a[i + 1];
			   a[i + 1] = c;

			   }
			}
		System.out.printf("%d\n",a[100 - k]);
		 }
	  }
	  else
	  {
	  System.out.print("error");
	  }
	}
}

