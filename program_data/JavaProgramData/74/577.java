package <missing>;

public class GlobalMembers
{
	public static int hui(int n)
	{
		int temp;
		int s = 0;
		temp = n;
		while (n != 0)
		{
				   s *= 10;
				   s += n % 10;
				   n /= 10;
		}
		if (s == temp)
		{
		return 1;
		}
		else
		{
		return 0;
		}
	}
	public static int sushu(int n)
	{
		int i;
		for (i = 2;i < n;i++)
		{

			   if (n % i == 0)
			   {
			   return 0;
			   }
		}
			 return 1;

	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		int first = 1;
		int flag = 1;
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
			 if (hui(i) != 0 && sushu(i) != 0)
			 {
				  if (first != 0)
				  {
					  System.out.printf("%d",i);
					  first = 0;
				  }
				   else
				   {
				   System.out.printf(",%d",i);
				   }
				   flag = 0;
			 }
		}
		if (flag != 0)
		{
		System.out.print("no");
		}
		return 0;
	}



}

