package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] l = new int[10001];
		int n;
		int i;
		int j;
		int a;
		int b;
		int ch = 0;
		int te = 0;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			for (j = a;j < b;j++)
			{
				l[j] = 1;
			}
		}
		a = 0;
		b = 0;
		for (j = 0;j < 10000;j++)
		{
			if (t == 0)
			{
				if (l[j] == 1)
				{
					if (l[j - 1] == 0)
					{
						a = j;
					}
					b = j;
				}
			}
				if ((l[j] == 0) && (l[j - 1] == 1))
				{
					t = 1;
				}
			if ((t == 1) && (l[j] == 1))
			{
				System.out.print("no");
				break;
			}
			ch = ch + 1;
		}
		if (ch == 10000)
		{
			System.out.printf("%d %d",a,b + 1);
		}
	}
}

