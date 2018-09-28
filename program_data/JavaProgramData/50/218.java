package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[365];
		int n;
		int i;
		int j = 0;
		int k;
		int[] b = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 7;i++)
		{
			a[i] = n;
			n++;
			if (n == 8)
			{
				break;
			}
		}
		k = i;
		n = 1;
		for (i = k + 1;i < 365 - k;i++)
		{
			a[i] = n;
			n++;
			if (n == 8)
			{
				n = 1;
			}
		}
		for (i = 0;i < 365;i++)
		{
			if (a[i] == 5)
			{
				b[j] = i + 1;
				j++;
			}
		}
		for (i = 0;i < 100;i++)
		{
			if (b[i] == 13)
			{
				System.out.print("1\n");
			}
			else if (b[i] == 44)
			{
				System.out.print("2\n");
			}
			else if (b[i] == 72)
			{
				System.out.print("3\n");
			}
			else if (b[i] == 103)
			{
				System.out.print("4\n");
			}
			else if (b[i] == 133)
			{
				System.out.print("5\n");
			}
			else if (b[i] == 164)
			{
				System.out.print("6\n");
			}
			else if (b[i] == 194)
			{
				System.out.print("7\n");
			}
			else if (b[i] == 225)
			{
				System.out.print("8\n");
			}
			else if (b[i] == 256)
			{
				System.out.print("9\n");
			}
			else if (b[i] == 286)
			{
				System.out.print("10\n");
			}
			else if (b[i] == 317)
			{
				System.out.print("11\n");
			}
			else if (b[i] == 347)
			{
				System.out.print("12\n");
			}
		}
		return 0;
	}
}

