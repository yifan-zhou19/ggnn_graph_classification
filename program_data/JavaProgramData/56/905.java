package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[5];
		int m;
		int i;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 5;i++)
		{
			a[i] = m % 10;
			m = m / 10;
		}
		for (i = 0;i < 5;i++)
		{
			if (a[i] != 0)
			{
				k++;
			}
		}
		a[i] = a[k - 1 - i];

		i = 0;
		do
		{
		if (a[i] != 0)
		{
			System.out.printf("%d",a[i]);
		}
		i++;
		} while (i < 5);



	}



}

