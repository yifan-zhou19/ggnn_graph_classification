package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	while (true)
	{
	  int[] a = new int[16];
	  int i = 0;
	  int n = 0;
	  int k;
	 while (true)
	 {
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a[i] = Integer.parseInt(tempVar);
	 }
	 if (a[i] == 0)
	 {
		 break;
	 }
	 if (a[i] == -1)
	 {
		 return 0;
	 }
	 i++;
	 }
	for (i = 0;a[i] != 0;i++)
	{
	 for (k = 0;a[k] != 0;k++)
	 {
		 if (a[k] == 2 * a[i])
		 {
			 n++;
		 }
	 }
	}

	 System.out.printf("%d\n",n);
	}
	}

}

