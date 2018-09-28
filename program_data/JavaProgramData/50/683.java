package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] days = {13, 44, 72, 103, 133, 164, 194, 225, 256, 286, 317, 347};
		int i;
		int w;
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 w = Integer.parseInt(tempVar);
			 }
		for (i = 0;i < 12;i++)
		{
			if (days[i] % 7 + w == 6 || days[i] % 7 + w == 13)
			{
				System.out.printf("%d\n",i + 1);
			}
		}
			return 0;
	}

}

