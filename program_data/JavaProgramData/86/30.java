public class jumps
{
	public int error;
	public int[] c = new int[100];
	public int sum;
	public int xia;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		jumps[] jump = tangible.Arrays.initializeWithDefaultjumpsInstances(100);
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				jump[i].error = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < jump[i].error;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					jump[i].c[j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (jump[i].c[jump[i].error - 1] + jump[i].error * 3 < 60)
			{
				jump[i].xia = 60 - jump[i].error * 3;
			}
			else
			{
				for (j = 0;j < jump[i].error;j++)
				{
					if (jump[i].c[j] >= 47 && jump[i].c[j] <= 49)
					{
						jump[i].xia = jump[i].c[j];
						break;
					}
					else if (jump[i].c[j] + (j + 1) * 3 > 60 && jump[i].c[j - 1] + (j) * 3 < 60)
					{
						jump[i].xia = 60 - (j) * 3;
						break;
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",jump[i].xia);
		}
		return 0;
	}

}

