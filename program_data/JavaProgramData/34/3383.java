package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		while (k != 1)
		{
			System.out.printf("%d",k);
			if (k % 2 == 1)
			{
				k = k * 3 + 1;
				System.out.printf("*3+1=%d\n",k);
			}
			else
			{
				k = k / 2;
				System.out.printf("/2=%d\n",k);
			}
		}
		System.out.print("End");
	}
}

