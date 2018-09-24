package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int a;
		int b;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 1 || n == 2 || n == 3 || n == 4)
		{
		System.out.print("empty");
		}
		else
		{
			for (i = 3;i <= (n - 2);i++)
			{
			for (j = 2;j < i;j++)
			{
			   if (i % j == 0)
			   {
			   break;
			   }
			}
			if (j == i)
			{
				   a = i;
			   b = i + 2;
			   for (m = 2;m < b;m++)
			   {
				if (b % m == 0)
				{
				break;
				}
			   }
			if (m == b)
			{
			System.out.printf("%d %d\n",a,b);
			}
			}


			}
		}
		   return 0;

	}

}

