package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		char c;
		int i;
		int n;
		int max;
		int ma;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		i = 1;
		while (c == ',')
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				c = tempVar4.charAt(0);
			}
			i++;
		}
		n = i;
		i = 1;
		max = a[0];
		if (n == 1)
		{
			System.out.print("No");
		}
		else
		{

			while (i < n)
			{

				if (max < a[i])
				{
					max = a[i];
				}
				i++;
			}
			if (max == a[0])
			{
				ma = 0;
			}
			else
			{
				ma = a[0];
			}
			i = 0;
			while (i < n)
			{

				if ((ma < a[i]) && (a[i] != max))
				{
					ma = a[i];
				}
				i++;
			}
			if ((max == ma) || (ma == 0))
			{
				System.out.print("No");
			}
			else
			{
				System.out.printf("%d",ma);
			}
		}

		return 0;
	}
}

