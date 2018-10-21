package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int n;
		int m;
		int[] first = new int[12];
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			first[0] = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 12;i++)
		{
			switch (month[i])
			{
			case 31:
				if (first[i] + 3 <= 7)
				{
					first[i + 1] = first[i] + 3;
				}
				else
				{
					first[i + 1] = first[i] + 3 - 7;
				}
				break;
			case 30:
				if (first[i] + 2 <= 7)
				{
					first[i + 1] = first[i] + 2;
				}
				else
				{
					first[i + 1] = first[i] + 2 - 7;
				}
				break;
			case 28:
				first[i + 1] = first[i];
				break;
			}
		}
		for (i = 0;i < 12;i++)
		{
			if (first[i] <= 2)
			{
				first[i] = first[i] + 12 - 7;
			}
			else
			{
				first[i] = first[i] + 12 - 14;
			}
			if (first[i] == 5)
			{
				System.out.printf("%d\n",i + 1);
			}
		}
		return 0;
	}
}

