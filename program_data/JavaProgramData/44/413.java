package <missing>;

public class GlobalMembers
{
	public static int reverse(int n)
	{
		int i;
		int[] num = new int[1000];
		int k = 0;
		int a = 0;
		int sign = 0;
		if (n < 0)
		{
				n = n * (-1);
				sign = 1;
		}
		for (;n > 0;)
		{
		  num[k++] = n % 10;
		  n = n / 10;
		}
		//for(i=0;i<k;i++) printf("%d ",num[i]); 

		for (i = 0;i < k;i++)
		{
			a += num[i] * Math.pow(10,k - i - 1);
		}
		if (sign == 1)
		{
			a = a * (-1);
		}
		return a;
	}

	public static int Main()
	{
		int i;
		int n;
		int result;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			result = reverse(n);
			System.out.printf("%d\n",result);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			i = Integer.parseInt(tempVar2);
		}
		return 0;
	}

}

