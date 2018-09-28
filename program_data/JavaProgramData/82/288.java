package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a1 = new int[100];
		int[] a2 = new int[100];
		int i;
		int j;
		int t;
		int l;
		int temp = 0;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a1[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a2[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		t = 0;
		l = 0;
		for (j = 0; j < n; j++)
		{
			if (a1[j] <= 140 && a1[j] >= 90 && a2[j] <= 90 && a2[j] >= 60)
			{
				t++;
				temp = t;
			}
			else
			{
				if (t > l)
				{
					l = t;
				}
				t = 0;
			}
		}
		if (temp > l)
		{
			l = temp;
		}
		System.out.print(l);
		System.out.print("\n");
		return 0;
	}

}

