package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int a = 0;
		int b = 0;
		int[] l = new int[1001];
		int[] m = new int[1000000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(l[i]) = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = 1;j <= n - 1 - i;j++)
			{
				a = l[i] + l[i + j];
				b++;
				m[b] = a;
			}
		}
		for (i = 1;i <= b;i++)
		{
			if (m[i] == k)
			{
				System.out.print("yes");
				break;
			}
			else if (i == b)
			{
				System.out.print("no");
			}
		}
		return 0;
	}



}

