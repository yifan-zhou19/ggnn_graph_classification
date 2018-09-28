package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int a;
		int b;
		int flag = 0;
		int[] z = new int[10000];
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if (a - b == 0)
			{
				z[a - 1] = 1;
			}
			for (j = a;j < b;j++)
			{
				z[j] = 1;
			}
		}
		for (i = 0;i < 10000;i++)
		{
			if (flag == 0)
			{
			if (z[i] == 1)
			{
				a = i;
				flag = 1;
				continue;
			}
			}
			if (flag == 1)
			{
			if (z[i] == 1)
			{
				continue;
			}
			else
			{
				b = i;
				flag = 2;
				continue;
			}
			}
			if (flag == 2)
			{
			if (z[i] == 1)
			{
				flag = 3;
				break;
			}
			}
		}
		if (flag != 2)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d %d",a,b);
		}
		return 0;
	}
}

