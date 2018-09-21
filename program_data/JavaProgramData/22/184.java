package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
		int[] p = a;
		int max = -1;
		int max2 = -1;
		int i;

		do
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p++ = Integer.parseInt(tempVar);
		}
		}while (System.in.read() == ',');
		for (i = 0; i < p - a; i++)
		{
			if (a[i] > max)
			{
				max2 = max;
				max = a[i];
			}
			else if (max2 < a[i] && a[i] < max)
			{
				max2 = a[i];
			}
		}
		if (max2 == -1)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d",max2);
		}
	}

}

