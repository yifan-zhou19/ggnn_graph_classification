package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int max;
		int min;
		int i;
		max = -1;
		min = -1;
		char c;
		i = 0;
		while (i <= 300)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			if (a[i] > max)
			{
				min = max;
				max = a[i];
			}
			if (a[i] > min && a[i] < max)
			{
				min = a[i];
			}
			i = i + 1;
			if (System.in.read() != ',')
			{
			break;
			}
		}
		if (min == -1)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d",min);
		}
	}
}

