package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[150];
		int i;
		int j;
		int k;
		int num;
		for (;;)
		{
			num = 0;
			for (i = 0;;i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a[i] == 0)
				{
					break;
				}
			}
			for (j = 0;j < i;j++)
			{
				for (k = 0;k < i;k++)
				{
					if (a[j] == 2 * a[k])
					{
						num++;
					}
				}
			}
			if (a[0] != -1)
			{
				  System.out.print(num);
				  System.out.print("\n");
			}
			else
			{
				break;
			}
		}
		return 0;
	}
}

