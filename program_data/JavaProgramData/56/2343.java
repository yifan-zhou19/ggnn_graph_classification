package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j = 2;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i < j;i++)
		{
			m = (int)(n / Math.pow(10,i - 1)) % 10;
			if (m == 0)
			{
				break;
			}
			else
			{
				j++;
				System.out.printf("%d",m);
			}
		}
		return 0;
	}

}

