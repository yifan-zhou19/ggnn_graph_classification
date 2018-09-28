package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int pos = 0;
		int i;
		char poss;
		int max = -1;
		int nextmax = -1111;
		while (scanf("%d", a[pos]) != EOF)
		{
			if (a[pos] > max)
			{
				nextmax = max;
				max = a[pos];
			}
			else
			{
				if (a[pos] > nextmax && a[pos] != max)
				{
					nextmax = a[pos];
				}
			}
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				poss = tempVar.charAt(0);
			}
			pos++;
		}
		if (pos == 0 || pos == 1 || nextmax == -1)
		{
			System.out.print("No");
		}
		else
		{
			if (a[pos] > max)
			{
				nextmax = max;
				max = a[pos];
			}
			else
			{
				if (a[pos] > nextmax && a[pos] != max)
				{
					nextmax = a[pos];
				}
			}
			if (nextmax != -1111)
			{
			System.out.printf("%d",nextmax);
			}
		}
	}


}

