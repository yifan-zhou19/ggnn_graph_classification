package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int[] b = new int[301];
		int i;
		int j;
		int m;
		int d;
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b[0] = Integer.parseInt(tempVar);
		}
		for (i = 1;i < 300;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			if (c == ',')
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b[i] = Integer.parseInt(tempVar3);
				}
			}
			else
			{
				break;
			}
		}
		m = b[0];
		for (j = 1;j < i;j++)
		{
			if (b[j] > m)
			{
				m = b[j];
			}
		}
		d = -1;
		for (j = 0;j < i;j++)
		{
			if (b[j] > d && b[j] < m)
			{
				d = b[j];
			}
		}
		if (d >= 0)
		{
			System.out.printf("%d",d);
		}
		else
		{
			System.out.print("No");
		}
	}
}

