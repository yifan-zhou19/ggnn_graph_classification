package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int max;
		int mac = -1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			max = Integer.parseInt(tempVar);
		}
		while (System.in.read() != '\n')
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				i = Integer.parseInt(tempVar2);
			}
			if (i > max)
			{
				mac = max;
				max = i;
			}
			else if (i < max && i> mac)
			{
				mac = i;
			}
		}
			if (mac != -1 && mac != max)
			{
				System.out.printf("%d",mac);
			}
			else
			{
				System.out.print("No");
			}
	}
}

