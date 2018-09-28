package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[] a = new int[300];
	 int i;
	 int j;
	 int c;
	  for (i = 1;i < 300;i++)
	  {
		 a[i] = -10000;
	  }
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a[0] = Integer.parseInt(tempVar);
	 }
	 for (i = 1;i < 300;i++)
	 {
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
	 }
	 if (a[1] == -10000)
	 {
		 System.out.println("No");
	 }
	 else
	 {
		 for (i = 1;i < 300;i++)
		 {
		if (a[i] <= a[i - 1])
		{
			c = a[i];
			a[i] = a[i - 1];
			a[i - 1] = c;
		}
		 }
	 for (i = 0;i < 300;i++)
	 {
		if (a[i] == a[299])
		{
			a[i] = 0;
		}
	 }
	  for (i = 1;i < 300;i++)
	  {
		if (a[i] <= a[i - 1])
		{
			c = a[i];
			a[i] = a[i - 1];
			a[i - 1] = c;
		}
	  }
	 if (a[299] == 0)
	 {
		 System.out.println("No");
	 }
	 else
	 {
		 System.out.printf("%d",a[299]);
	 }
	 }
	}


}

