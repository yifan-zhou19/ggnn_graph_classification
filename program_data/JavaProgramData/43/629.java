package <missing>;

public class GlobalMembers
{
	public static int zhishu(int x)
	{
		int i;
		int z = 1;
		for (i = 2;i <= x / 2;i++)
		{
			if (x % i == 0)
			{
				z = 0;
				break;
			}
		}
		return (z);
	}
	public static void Main()
	{
			 int m;
			 int i;
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 m = Integer.parseInt(tempVar);
			 }
			 for (i = 2;i <= m / 2;i++)
			 {
			 if (zhishu(i) != 0 && zhishu(m - i) != 0)
			 {
			 System.out.printf("%d %d\n",i,m - i);
			 }
			 }
	}

}

