package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int sum;
		int c;
		sum = 0;

		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   n = Integer.parseInt(tempVar);
		   }
		i = 0;
		while (i < n)
		{
		i++;

		c = i / 10;
		if (i % 7 == 0 || i / 10 == 7 || i - c * 10 == 7)
		{
				continue;
		}
		sum = sum + i * i;
		}
		System.out.printf("%d\n",sum);
	}


}

