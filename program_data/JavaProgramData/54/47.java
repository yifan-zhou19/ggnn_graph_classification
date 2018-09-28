package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int i;
		int[] apple = new int[N];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		apple[n] = k + n;
		for (i = n;i >= 1;)
		{
			apple[n] += n;
			for (i = n - 1;i >= 1;i--)
			{
				if (apple[i + 1] % (n - 1) != 0)
				{
					break;
				}
				else
				{
					apple[i] = apple[i + 1] * n / (n - 1) + k; //di tui
				}
			}
		}
		System.out.printf("%d\n",apple[1]);



	}
}

