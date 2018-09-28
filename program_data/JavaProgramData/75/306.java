package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] in = new int[1002];
		int[] out = new int[1002];
		int[] time = new int[1002];
		int temp;
		int i;
		int j;
		int k;
		int num;
		char space;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				temp = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				space = tempVar2.charAt(0);
			}
			in[i] = temp;
			if (space != ',')
			{
				break;
			}
		}
		num = i + 1;
		for (i = 0;;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				temp = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				space = tempVar4.charAt(0);
			}
			out[i] = temp;
			if (space != ',')
			{
				break;
			}
		}
		for (i = 0;i < num;i++)
		{
			for (j = in[i];j < out[i];j++)
			{
				time[j]++;
			}
		}
		int max = 0;
		for (i = 0;i <= 1001;i++)
		{
			if (time[i] > max)
			{
				max = time[i];
			}
		}
		System.out.printf("%d %d",num,max);
	}





}

