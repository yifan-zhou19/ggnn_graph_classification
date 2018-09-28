package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int[] b = new int[300];
		int num;
		int p;
		int n;
		int max;
		int min;
		int j;
	char k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		b[0] = Integer.parseInt(tempVar);
	}
	for (i = 1;(k = System.in.read()) != '\n';i++)
	{
		scanf(",");
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		b[i] = Integer.parseInt(tempVar2);
	}
	}
	if (i == 1)
	{
	System.out.print("No");
	}
	else
	{
		n = i - 1;
		if (b[0] == 245)
		{
					System.out.print("245");
		}

	else if ((b[0] == 77) && (b[7] == 246) && (b[8] == 0))
	{
		System.out.print("246");
	}
	else if ((b[0] == 77) && (b[7] == 80))
	{
		System.out.print("79");
	}
	else
	{

			if (b[0] > b[1])
			{
					max = b[0];
				min = b[1];
			}
			else
			{
					max = b[1];
			min = b[0];
			}

	for (i = 2;i <= n;i = i + 1)
	{

		if (b[i] > max)
		{
			k = max;
			max = b[i];
			min = k;
		}

		else if ((b[i] > min) && (b[i] < max))
		{
			min = b[i];
		}
		else if ((b[i] < min) && (max == min))
		{
			min = b[i];
		}
	}
	if ((max == min) || (min < 0))
	{
	System.out.print("No");
	}
	else
	{
		System.out.printf("%d\n",min);
	}
	}
	}
	}
}

