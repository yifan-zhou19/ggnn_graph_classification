package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a = -1;
		int b = -1;
		int i;
		int n;
		int[] c = new int[300];
		char x;
		for (i = 0;i < 300;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				c[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				x = tempVar2.charAt(0);
			}
			if (x != ',')
			{
				n = i;
				break;
			}
		}
		for (i = 0;i <= n;i++)
		{
			if (c[i] > a)
			{
				a = c[i];
			}
		}
		for (i = 0;i <= n;i++)
		{
			if (c[i] < a && c[i]> b)
			{
				b = c[i];
			}
		}
		if (b == -1)
		{
			System.out.print("No\n");
		}
		else
		{
			System.out.printf("%d\n",b);
		}


	}
}

