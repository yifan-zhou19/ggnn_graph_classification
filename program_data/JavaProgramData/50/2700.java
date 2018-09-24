package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] dayofthirteenth = {13, 44, 72, 103, 133, 164, 194, 225, 256, 286, 317, 347};
		int w;
		int month;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		for (month = 0;month <= 12;month++)
		{
		   for (k = 0;k < 60;k++)
		   {
			   if (dayofthirteenth[month - 1] == (-1 - w + k * 7))
			   {
				   System.out.printf("%d\n",month);
			   }
		   }
		}

	}
}

