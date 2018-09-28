package <missing>;

public class GlobalMembers
{
	public static int Main()

	{
		int w;
		int[] a = new int[60];
		int[] md = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int i;
		int j = 0;
		int k;
		int l;
		int t;
		w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		t = 5 - w;
		if (t < 0)
		{
			t = t + 7;
		}
		for (i = 1 + t; i < 366; i += 7)
		{
			a[j] = i;
			j++;
		}
		for (k = 0; k < j; k++)
		{
			for (l = 0; l < 12; l++)
			{
				if (a[k] > md[l])
				{
					a[k] = a[k] - md[l];
				}
				else
				{
					break;
				}
			}
			if (a[k] == 13)
			{
				System.out.print(l + 1);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

