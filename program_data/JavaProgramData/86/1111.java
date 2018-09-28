package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int[] a = new int[60];
		int sum;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[j] = Integer.parseInt(tempVar3);
				}
			}
			sum = 0;
			if (m == 0) //???????60
			{
				sum = 60;
			}
			for (j = 0;j < m;j++)
			{
				if (a[j] + 3 * j >= 60)
				{ //?????????????60s???60?????????????ok����?1????
					sum = 60 - 3 * j;
					break;
				}
				else if (a[j] + 3 * (j + 1) >= 60)
				{ //??????(??a[j])???????60s??????????3s????????a[j]����?2????
					sum = a[j];
					break;
				}
			}
			if (j == m)
			{
				sum = 60 - 3 * m;
			}
			System.out.printf("%d\n", sum);
		}
	}
	//????????1???????60s??2???3s???60s?


}

