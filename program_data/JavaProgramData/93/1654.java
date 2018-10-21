package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int i;
		int j = 0;
		int[] b = new int[3];
		int c = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 3;i++)
		{
			c = c + 2;
			if (a % c == 0)
			{
				b[j++] = c;
			}
		}
		if (b[0] == 0)
		{
			System.out.print("n");
		}
		else
		{
			System.out.printf("%d",b[0]);
			for (i = 1;i < 3;i++)
			{
				if (b[i] != 0)
				{
					System.out.printf(" %d",b[i]);
				}
			}
		}
	}
}

