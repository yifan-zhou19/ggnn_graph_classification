package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int buf;
		int[] appeared = new int[110];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				buf = Integer.parseInt(tempVar2);
			}
			if (appeared[buf] == 0)
			{
				if (i != 0)
				{
					System.out.print(" ");
				}
				System.out.printf("%d", buf);
				appeared[buf] = 1;
			}
		}
		return 0;
	}
}

