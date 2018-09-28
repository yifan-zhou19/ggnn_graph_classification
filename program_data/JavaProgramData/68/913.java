package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sushu = int i;
	 int n;
	 int e;
	 int i;
	 int j;
	 int k;
	 int p;
	 int q;
	 int d;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (p = 6;p <= n;p = p + 2)
	 {
		 for (e = 2;e < p;e++)
		 {
			if ((sushu(e) == 1) && (sushu(p - e) == 1))
			{
			 System.out.printf("%d=%d+%d",p,e,p - e);
			 break;
			}
		 }
	  System.out.print("\n");
	 }




	}


	public static int sushu(int i)
	{
		int j;
		int p;
		int s;
	 s = Math.sqrt(i);
	 for (j = 2,p = 1;j <= s;j++)
	 {
		if (i % j == 0)
		{
		p = 0;
		break;
		}
	 }
	 return (p);
	}

}

