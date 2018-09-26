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
			maxindex = 0;
			for (i = 0;i <= 100 - k;i++)
			{
			   if (a[i] > a[maxindex])
			   {
				  maxindex = i;
			   }
			}
			if (maxindex != 100 - k)
			{
			   c = a[maxindex];
			   a[maxindex] = a[100 - k];
			   a[100 - k] = c;
			   System.out.printf("%d\n",a[100 - k]);
			}
		 }
	  }
	  else
	  {
	  System.out.print("error");
	  }
	}
}

