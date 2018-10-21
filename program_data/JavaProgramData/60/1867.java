package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int p;
		int q;
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= (n - 2);i++)
		{
			 for (p = 0,j = 2;j <= (i / 2);j++)
			 {
			 if (i % j == 0)
			 {
			 p++;
			 }
			 }
			 for (q = 0,j = 2;j <= (i + 2) / 2;j++)
			 {
			 if ((i + 2) % j == 0)
			 {
			 q++;
			 }
			 }
		if ((p == 0) && (q == 0))
		{
		System.out.printf("%d %d\n",i,i + 2);
		}
		m++;
		}
	   if (m == 0)
	   {
		System.out.print("empty");
	   }
	 return 0;
	}

}

