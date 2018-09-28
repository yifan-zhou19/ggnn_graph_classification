package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] day = {12, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		int i;
		int begin;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			begin = Integer.parseInt(tempVar);
		}

		for (i = 0;i < 12;i++)
		{
			begin += day[i];
			if (begin % 7 == 5)
			{
				System.out.printf("%d\n",i + 1);
			}
		}
	}

}

