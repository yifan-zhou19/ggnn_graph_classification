package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		if (num == 0)
		{
				   System.out.print("0");
		} //??0???????????0
		else
		{
		int r;
		int x = 0;
		int[] a = new int[1000];
		int weishu;
		for (r = 10;1;r = r * 10)
		{
						   if (num / r != 0)
						   {
										   x++;
						   }
						   if (num / r == 0)
						   {
										   x++;
										   break;
						   }
		}
		weishu = x; //????
		for (r = 0;r < weishu;r++)
		{
							  a[r] = num % 10;
							  num = num / 10;
		} //????????????????????????
		x = 1;
		for (r = 0;r < weishu;r++)
		{
								 if (a[r] != 0)
								 {
											  x = 0;
								 }
								 if (x == 0)
								 {
										   x = r;
										   break;
								 }
		}
		for (r = x;r < weishu;r++)
		{
						  System.out.printf("%d",a[r]);
		}
		System.out.print("\n");
		} //??
		return 0;
	}
	public static int Main()
	{
		int i;
		for (i = 0;i < 6;i++)
		{
						 int n;
						 int result;
						 String tempVar = ConsoleInput.scanfRead();
						 if (tempVar != null)
						 {
							 n = Integer.parseInt(tempVar);
						 }
						 if (n < 0)
						 {
								  System.out.print("-"); //?????????
								  n = -n;
						 }
					  reverse(n);
		}
		return 0;
	}
}

