package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int p;
		int q;
		int i;
		int j;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m = Integer.parseInt(tempVar);
	 }
	 for (i = 3;i <= (m / 2);i = i + 2)
	 {
		 {
		 for (j = 2;j <= Math.sqrt(i);j++)
		 {
		 if (i % j == 0)
		 {
			 break;
		 }
		 }
		 if (j > Math.sqrt(i))
		 {
			 p = 1;
		 }
		 else
		 {
			 p = 0;
		 }
		 for (j = 2;j <= Math.sqrt(m - i);j++)
		 {
		 if ((m - i) % j == 0)
		 {
			 break;
		 }
		 }
		 if (j > Math.sqrt(m - i))
		 {
			 q = 1;
		 }
		 else
		 {
			 q = 0;
		 }
	 }
	  if (p == 1 && q == 1)
	  {
		  System.out.printf("%d %d\n",i,m - i);
	  }
	 }
	return 0;
	}

}

