package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int[] r = new int[13];
		int[] y = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r[0] = Integer.parseInt(tempVar);
		}
		r[1] = r[0] + 12;
		for (i = 2;i < 13;i++)
		{
			r[i] = r[i - 1] + y[i - 2];
		}
		for (i = 1;i < 13;i++)
		{
			if (r[i] % 7 == 5)
			{
				System.out.printf("%d\n",i);
			}
		}


	}


}

