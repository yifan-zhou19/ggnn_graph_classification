package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int shu;
		int i;
		int[] wei = new int[5];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			shu = Integer.parseInt(tempVar);
		}
		wei[0] = shu / 10000;
		wei[1] = (shu - shu / 10000 * 10000) / 1000;
		wei[2] = (shu - shu / 1000 * 1000) / 100;
		wei[3] = (shu - shu / 100 * 100) / 10;
		wei[4] = (shu - shu / 10 * 10);
		for (i = 4;i >= 0;i--)
		{
			if (wei[i] != 0)
			{
			System.out.printf("%d",wei[i]);
			}
		}
	}
}

