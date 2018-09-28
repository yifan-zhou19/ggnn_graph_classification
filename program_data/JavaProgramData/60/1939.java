package <missing>;

public class GlobalMembers
{
	public static int sushu(int x)
	{
			int i;
			int jsq;
			int m;
			m = (int)Math.sqrt(x);
			//jsq=0;

			for (i = 2;i <= m;i++)
			{
			   if (x % i == 0)
			   {
			   return 0;
			   }
			}
			return 1;
	}
	public static int Main()
	{
	int n;
	int p;
	int q = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (p = 4;p <= n;p++)
	{
		 if (sushu(p) == 1 && sushu(p - 2) == 1) //??????????
		 {
			   System.out.printf("%d %d\n",p - 2,p);
			   q++;
		 }
	}
	if (q == 0)
	{
	System.out.print("empty");
	}
	return 0;
	}
}

