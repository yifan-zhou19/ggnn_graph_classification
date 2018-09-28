package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] year = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int w;
		int i;
		int j = 0;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 365;i++)
		{
			j++;
			if (j > year[k])
			{
				j -= year[k];
				k++;
			}
			if ((i + w) % 7 == 5 && j == 13)
			{
				System.out.printf("%d\n",k + 1);
			}
		}


	}
}

