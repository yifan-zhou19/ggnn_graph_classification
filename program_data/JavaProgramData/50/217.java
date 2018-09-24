package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		int i;
		int w;
		int[] day = new int[12];
		day[0] = 13;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		for (i = 1;i < 12;i++)
		{
			day[i] = day[i - 1] + month[i - 1];
		}
		for (i = 0;i < 12;i++)
		{
			if ((day[i] % 7 + w - 1) % 7 == 5)
			{
				System.out.printf("%d\n",i + 1);
			}
		}
	}

}

