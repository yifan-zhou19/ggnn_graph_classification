package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int i;
		int n;
		int number;
		int count;
		int countl;
		count = 0;
		countl = 0;
		for (i = 0;i < 100;i++)
		{
			a[i] = 0;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] b = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				number = Integer.parseInt(tempVar2);
			}
			if (a[number] == 0)
			{
				a[number] = 1;

				b[count] = number;
					count = count + 1;
			}
		}
		for (i = 0;i < count;i++)
		{
				countl = countl + 1;
				System.out.printf("%d",b[i]);
				if (countl < count)
				{
					System.out.print(" ");
				}

		}

		return 0;
	}
}

