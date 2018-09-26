package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int t;
		int n;
		int num;
		int max = 0;
		int[] in = new int[1000];
		int[] out = new int[1000];
		char a;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				in[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			if (a == '\n')
			{
				break;
			}
		}
		for (i = 0;;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				out[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				a = tempVar4.charAt(0);
			}
			if (a == '\n')
			{
				break;
			}
		}
		n = i + 1;
		System.out.printf("%d ",n);
		for (t = 0;t < 1000;t++)
		{
			num = 0;
			for (i = 0;i < n;i++)
			{
				if (t >= in[i] != 0 && t < out[i])
				{
					num++;
				}
			}
			if (num > max)
			{
				max = num;
			}
		}
		System.out.printf("%d\n",max);
	}
}

