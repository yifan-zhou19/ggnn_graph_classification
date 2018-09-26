package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int a;
		int b;
		int[] c = new int[1001];
		int i;
		int j;
		int m = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
	for (i = 0;i < a;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		c[i] = Integer.parseInt(tempVar3);
	}
	}
		for (i = 0;i < a;i++)
		{
			if (m == 0)
			{
				break;
			}
	for (j = 0;j < a && j != i;j++)
	{
		if (c[i] + c[j] == b)
		{
			System.out.print("yes");
		m = 0;
		break;
		}
	}
		}
		if (m == 1)
		{
			System.out.print("no");
		}
	}



}

