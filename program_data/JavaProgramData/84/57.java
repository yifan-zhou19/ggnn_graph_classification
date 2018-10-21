package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] num = new int[1000];
		int i;
		int[] out = new int[2];
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
				num[i] = Integer.parseInt(tempVar2);
			}
		}
		if (num[0] > num[1])
		{
			out[0] = num[0];
			out[1] = num[1];
		}
		else
		{
			out[0] = num[1];
			out[1] = num[0];
		}
		for (i = 2;i < n;i++)
		{
			if (num[i] > out[0])
			{
				out[1] = out[0];
				out[0] = num[i];
			}
			else if (num[i] < out[0] && num[i]> out[1])
			{
				out[1] = num[i];
			}
			else
			{
				continue;
			}
		}
		System.out.printf("%d\n%d\n",out[0],out[1]);
		   return 0;
	}

}

