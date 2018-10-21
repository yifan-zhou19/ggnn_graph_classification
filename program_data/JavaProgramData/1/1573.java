package <missing>;

public class GlobalMembers
{
	public static int factor(int a,int min)
	{
		int i;
		int result = 1;
		if (a < min)
		{
			return 0;
		}
		for (i = min;i < a;i++)
		{
						   if (a % i == 0)
						   {
						   result += factor(a / i, i);
						   }
		}
		return result;
	}

	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 a[i] = Integer.parseInt(tempVar2);
						 }
						 a[i] = factor(a[i], 2);
		}
		for (i = 0;i < n;i++)
		{
						 if (i == n - 1)
						 {
							 System.out.printf("%d",a[i]);
						 }
						 else
						 {
							 System.out.printf("%d\n",a[i]);
						 }
		}
		return 0;
	}
}

