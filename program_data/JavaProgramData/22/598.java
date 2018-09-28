package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] num = new int[300];
		int i;
		int j;
		int max1;
		int max2;
		char c;
		i = 0;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				num[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			i++;
		} while (c == ',');
		max1 = num[0];
		max2 = 0;
		for (j = 0;j < i;j++)
		{
			if (num[j] > max1)
			{
				max2 = max1;
				max1 = num[j];
				continue;
			}
			if (num[j] == max1)
			{
				continue;
			}
			if (num[j] > max2)
			{
				max2 = num[j];
			}
		}
		if (max2 == 0)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d",max2);
		}
	}
}

