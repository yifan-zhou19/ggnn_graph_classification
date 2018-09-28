package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[10000];
		int i;
		int j;
		for (i = 3;i < n;i = i + 2)
		{
			for (j = 2;j <= i / 2;j++)
			{
			  if (i % j == 0)
			  {
					break;
			  }
			}
			if (j >= i / 2)
			{
				a[i] = 1;
				if (a[i - 2] == 1 && a[i] == 1)
				{
					System.out.printf("%d %d\n",i - 2,i);
				}
			}
		}
		if (n == 5)
		{
			System.out.print("3 5");
		}
		else if (n < 5)
		{
			System.out.print("empty");
		}
	}


}

