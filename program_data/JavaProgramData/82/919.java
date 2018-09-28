package <missing>;

public class GlobalMembers
{
	//********************************
	//*????5.cpp                **
	//*???????               **
	//*?????? 1200012834      **
	//*???2012.10.14             **
	//********************************

	public static int Main()
	{
		int n; // ??
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		int max;
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			c[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90)
			{
				c[i] = 1;
			}
			for (j = i + 1;j < n;j++)
			{
				if (a[j] >= 90 && a[j] <= 140 && b[j] >= 60 && b[j] <= 90)
				{
					c[i]++;
				}
				else
				{
					break;
				}
			}
		}
		max = c[0];
		for (i = 1;i < n;i++)
		{
			if (c[i] > max)
			{
				max = c[i];
			}
		}
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}

}

