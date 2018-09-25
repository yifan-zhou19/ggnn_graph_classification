package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i = 1;
		int x;
		int t;
		int y;
		int sum;
		int num;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x = Integer.parseInt(tempVar2);
		}
		sum = x;
		num = -1000000;
		while (i < n)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				t = Integer.parseInt(tempVar3);
			}
		if (sum < t)
		{
			y = sum;
			sum = t;
		  if (t > num)
		  {
			  num = y;
		  }
		}
		else
		{
			if (num < t)
			{
			  num = t;
			}
		}
			i++;
		}
		System.out.printf("%d\n",sum);
		System.out.printf("%d\n",num);
	}

}

