package <missing>;

public class GlobalMembers
{
	/*
		file 1134??
	    name ???
		date 11.5
		function ??2?15????????????????????????????????????????????
	*/
	public static int Main()
	{
		int[] a = new int[16];
		int sum = 0;
		int i;
		int j;
		int n = 0;
		while (true)
		{
			for (i = 0; i < 16; i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a[i] == 0)
				{
					break;
				}
				else if (a[i] == -1)
				{
					break;
				}
				else
				{
					n++;
				}
			}
			if (a[0] == -1)
			{
				break;
			}
			for (i = 0; i < n; i++)
			{
				for (j = 0; j < n; j++)
				{
					if (a[i] == a[j] * 2)
					{
						sum++;
					}
				}
			}
			System.out.print(sum);
			System.out.print("\n");
			n = 0;
			sum = 0;
		}
		return 0;
	}
}

