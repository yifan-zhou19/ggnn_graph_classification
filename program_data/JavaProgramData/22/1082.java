package <missing>;

public class GlobalMembers
{
	public static void paixu(int[] num, int n)
	{
		int i;
		int j;
		int t;
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (num[j] > num[i])
				{
					t = num[i];
					num[i] = num[j];
					num[j] = t;
				}
			}
		}
	}
	public static int Main()
	{
		int t = 0;
		int a;
		int[] num = new int[310];
		char c;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			if (c == '\n')
			{
				num[t++] = a;
				break;
			}
			else
			{
				num[t++] = a;
			}
		}
		paixu(num, t);
		int gole = num[0];
		int i;
		a = 0;
		for (i = 1;i < t;i++)
		{
			if (num[i] < gole)
			{
				a = 1;
				gole = num[i];
				break;
			}
		}
		if (t == 1 || a == 0)
		{
			System.out.print("No\n");
		}
		else
		{
			System.out.printf("%d\n",gole);
		}
		return 0;
	}






}

