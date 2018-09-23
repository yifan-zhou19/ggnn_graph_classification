package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//int god(int num1, int num2);
	public static int Main()
	{
		int number;
		int ctr;
		int i;
		int[] n = new int[20000];
		int[] c = new int[20000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			number = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= 20000;i++)
		{
			c[i] = 0;
		}
		for (ctr = 0;ctr < number;ctr++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[ctr] = Integer.parseInt(tempVar2);
			}
		}
		System.out.printf("%d",n[0]);
		for (ctr = 1;ctr < number;ctr++)
		{
			for (i = 0;i < ctr;i++)
			{
				if (n[i] == n[ctr])
				{
					c[ctr]++;
				}
			}
			if (c[ctr] == 0)
			{
				System.out.printf(" %d",n[ctr]);
			}
		}

		System.in.read();
		return 0;
	}


}

