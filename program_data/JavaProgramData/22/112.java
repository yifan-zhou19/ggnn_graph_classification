package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] n = new int[300];
		char c;
		int i;
		int j;
		int max = 0;
		int sec_max = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n[0] = Integer.parseInt(tempVar);
		}

		for (i = 1;;i++)
		{
			if ((c = System.in.read()) != ',')
			{
				break;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[i] = Integer.parseInt(tempVar2);
			}
		}

		for (j = 0;j < i;j++)
		{
			if (n[j] > max)
			{
				max = n[j];
			}
		}

		for (j = 0;j < i;j++)
		{
			if (n[j] == max)
			{
				n[j] = 0;
			}
		}

		for (j = 0;j < i;j++)
		{
			if (n[j] > sec_max)
			{
				sec_max = n[j];
			}
		}

		if (sec_max == 0)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d",sec_max);
		}
	}
}

