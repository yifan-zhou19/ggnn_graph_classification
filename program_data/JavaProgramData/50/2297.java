package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int w;
		int i;
		int j;
		int sum = 0;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		a = w;
		for (i = 1;i < 13;i++)
		{
			sum = 0;
			for (j = 1;j < i;j++)
			{
				switch (j)
				{
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				sum += 31;
				break;
				case 4:
				case 6:
				case 9:
				case 11:
				sum += 30;
				break;
				case 2:
				sum += 28;
				break;
				}
			}
			sum += 12;
			w = w + sum % 7;
			if (w == 5 || w == 12)
			{
				System.out.printf("%d\n",i);
			}
			w = a;
		}
	}
}

