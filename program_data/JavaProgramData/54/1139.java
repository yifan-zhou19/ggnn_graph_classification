package <missing>;

public class GlobalMembers
{
	public static int fun(int temp, int n, int k)
	{
		int output = temp * n / (n - 1) + k;
		return output;
	}

	public static int Main()
	{
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}


		int last;
		int temp;
		int i;
		int count = 0;
		for (last = k;; last++)
		{
				 count = 1;
				 temp = last * n + k;


				 for (i = 2; i <= n; i++)
				 {
					   temp = fun(temp, n, k);
					   if (temp % n == k)
					   {
							   count++;
					   }
				 }

				 if (count == n)
				 {
						  System.out.printf("%d", temp);
						  break;
				 }
		}


		return 0;
	}


}

