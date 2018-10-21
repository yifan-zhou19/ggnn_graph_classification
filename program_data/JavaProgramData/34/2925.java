package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int sum;
	int i;
	int t;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}

	sum = n;

	for (i = 0;sum != 1;i++)
	{
		if (sum % 2 != 0)
		{
			t = sum;
			sum = sum * 3 + 1;
			System.out.printf("%d*3+1=%d\n",t,sum);
		}

		else if (sum % 2 == 0)
		{
			t = sum;
			sum = sum / 2;
			System.out.printf("%d/2=%d\n",t,sum);
		}
	}

	System.out.print("End");
	return 0;
	}

}

