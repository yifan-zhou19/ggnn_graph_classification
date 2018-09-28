package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int time;
		int i;
		int n;
		int broken;
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
				broken = Integer.parseInt(tempVar2);
			}
			if (broken == 0)
			{
				System.out.print("60\n");
			}
			else
			{
			int[] num = new int[broken];
			for (j = 0;j < broken;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					num[j] = Integer.parseInt(tempVar3);
				}
			}
			for (j = broken - 1;j >= 0;j--)
			{
				time = num[j] + (j + 1) * 3;
				if (time < 60)
				{
					System.out.printf("%d\n",60 - (j + 1) * 3);
					break;
				}
				else if (time < 63)
				{
					System.out.printf("%d\n",num[j]);
					break;
				}
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(num);
			}
		}
		return 0;
	}

}

