package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] shuzu = new int[1001];
		int[] jilu = new int[1001];
		int a = 0;
		int b = 0;
		int c;
		int n;
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (k = 0;k < n;k++)
			{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				shuzu[k] = Integer.parseInt(tempVar2);
			}
			if (shuzu[k] == 0)
			{
				jilu[a] = k;
				a++;
			}
			}
			if (a == 2)
			{
				c = jilu[1] - jilu[0] - 1;
				b += c;
			}
			a = 0;
		}
		System.out.printf("%d",b);
		return 0;
	}

}

