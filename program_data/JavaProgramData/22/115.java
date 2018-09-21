package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 0;
		int max;
		int max2 = 0;
		int n;
		int[] d = new int[300];
		char c;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				d[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			i++;
		}while (c == ',');
		n = i;
		max = d[0];
		for (i = 1;i < n;i++)
		{
			if (d[i] > max)
			{
				max2 = max;
				max = d[i];
			}
			else
			{
				if (d[i] > max2 && d[i] < max)
				{
					max2 = d[i];
				}
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

