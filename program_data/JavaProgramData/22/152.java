package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int n = 0;
		int i = 0;
		int max;
		int m = 0;
		int k = 0;
		String b = new String(new char[300]);
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, tempVar2);
			}
			n++;
			if (b.charAt(i) != ',')
			{
				break;
			}
		}
		max = a[0];
		for (i = 1;i < n;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		if (n == 1)
		{
			System.out.print("No\n");
		}
		else
		{
			for (i = 1;i < n;i++)
			{
				if (a[i] != a[0])
				{
					k = 1;
					break;
				}
			}
		if (k == 0)
		{
			System.out.print("No\n");
		}
		else
		{
		for (i = 0;i < n;i++)
		{
			if (a[i] > m && a[i] < max)
			{
				m = a[i];
			}
		}
		System.out.printf("%d\n",m);
		}

		}
	}
}

