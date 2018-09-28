package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int zhishu(int a)
	{
		for (int i = 2;i <= Math.sqrt(a);i++)
		{
			if (a % i == 0)
			{
			return 0;
			}
		}
	return 1;
	}
	public static int Main()
	{
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 int i;
	 int j;
	 for (i = 6;i <= n;i = i + 2)
	 {
		for (j = 3;j <= (i / 2);j = j + 2)
		{
		  if (zhishu(j) != 0 && zhishu(i - j) != 0)
		  {
		  System.out.printf("%d=%d+%d\n",i,j,i - j);
		  break;
		  }
		}
	 }
	return 0;
	}
}

