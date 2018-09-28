package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int n;
		int i;
		int j;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 12;i++)
		{
			x = n;
			j = 0;
			while (j < i + 1)
			{
				x += day[j];
				j++;
			}
			x += 12;
			if (x % 7 == 5)
			{
				System.out.printf("%d\n",i + 1);
			}
		}





		 return 0;
	}



}

