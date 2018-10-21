package <missing>;

public class GlobalMembers
{
	public static int yinshu(int num, int min)
	{
		int r;
		int x = 0;
		if (num < min)
		{
					return 0;
		}
		else
		{
			 for (r = min;r * r <= num;r++)
			 {
							 if (num % r == 0)
							 {
										  x = x + 1 + yinshu(num / r, r);
							 }
			 }
		return x;
		}
	}
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
						 int a;
						 int result;
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 a = Integer.parseInt(tempVar2);
						 }
						 result = yinshu(a, 2) + 1;
						 System.out.printf("%d\n",result);
		}
		return 0;
	}
}

