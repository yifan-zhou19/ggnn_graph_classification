package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int[] b = new int[3];
		int[] c = new int[3];
		int i;
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		b[0] = 3;
		b[1] = 5;
		b[2] = 7;
		for (i = 0;i < 3;i++)
		{
			if (a % b[i] == 0)
			{
				c[j] = b[i];
				j++;
			}
		}
		if (j == 1)
		{
	System.out.printf("%d",c[0]);
		}
		else if (j == 2)
		{
	System.out.printf("%d %d",c[0],c[1]);
		}
	else if (j == 3)
	{
	System.out.printf("%d %d %d",c[0],c[1],c[2]);
	}
	else if (j == 0)
	{
			System.out.print("n");
	}
		return 0;
	}
}

