package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int b;
		int j;
		int i;
		int[] a = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = Integer.parseInt(tempVar);
		}

		i = 1;
		while (i <= 9999)
		{
			j = 2;
			while (j <= (int)(i / 2) + 1)
			{
			   if ((i % j) == 0)
			   {
			a[i] = 0;
			break;
			   }
			else
			{
			a[i] = i;
			}
			j = j + 1;
			}
			i = i + 1;
		}
		i = 1;
		while (i <= 4999)
		{
		j = i;
		while (j <= 9999)
		{
			if (b == (a[i] + a[j]))
			{
			System.out.printf("%d %d\n",a[i],a[j]);
			}
			j = j + 1;
		}
		i = i + 1;
		}

	}
}

