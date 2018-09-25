package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int flag = 0;
		int sushu = int;
		int huiwen = int;
		int m;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			if (sushu(i) != 0 && huiwen(i) != 0)
			{
			if (flag != 0)
			{
				System.out.printf(",%d",i);
			}
			else
			{
				System.out.printf("%d",i);
				flag = 1;
			}
			}

		}
		if (flag == 0)
		{
			System.out.print("no");
		}
		return 0;
	}
	public static int sushu(int n)
	{
		if (n == 2)
		{
			return 1;
		}
		int j;
		int k = Math.sqrt(n);
		for (j = 2;j < k + 1;j++)
		{
			if (n % j == 0)
			{
				break;
			}
		}
		if (j == k + 1)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int huiwen(int n)
	{
		 int j;
		 if (n < 10)
		 {
		   return 1;
		 }
		   int i = 0;
		   int[] a = new int[15];
			  while (n != 0)
			  {
				a[i] = n % 10;
		 i++;
			n /= 10;
			  }
			 i--;
		   for (j = 0;j < i;j++,i--)
		   {
		   if (a[j] != a[i])
		   {
		  return 0;
		   }
		   }
			 return 1;
	}


}

