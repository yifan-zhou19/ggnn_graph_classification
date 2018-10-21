package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int w;
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		if (w == 7)
		{
			System.out.printf("%d\n%d\n",1,10);
		}
		else
		{
			for (i = 0;i < 11;i++)
			{
				t += a[i];
				if ((t % 7 + w) % 7 == 0)
				{
					System.out.printf("%d\n",i + 2);
				}
			}
		}
		return 0;
	}

}

