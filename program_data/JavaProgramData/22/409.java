package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] b = new int[300];
		int j;
		int max;
		int i;
		int x;
		char c;
		for (i = 0,c = ' ';c != '\n';i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				b[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
		}
		for (j = 0,max = 0;j < i;j++)
		{
			if (b[j] >= max)
			{
				max = b[j];
			}
		}
		for (j = 0,x = 0;j < i;j++)
		{
			if (b[j] != max && b[j] >= x)
			{
			x = b[j];
			}
		}
		if (i == 1 || x == 0)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d",x);
		}
		return 0;
	}

}

