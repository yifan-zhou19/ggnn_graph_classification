package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i;
	 int n;
	 int[] v = {100, 50, 20, 10, 5, 1};
	 int[] r = new int[6];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 double sum = 1;
	 double deal = 1;
	 for (i = 0; i < 6; i++)
	 {
	   while (n >= v[i])
	   {
	   r[i]++;
	   n -= v[i];
	   }
	 }
	 for (i = 0; i < 6; i++)
	 {
	  System.out.printf("%d\n", r[i]);
	 }
	 return 0;
	}

}

