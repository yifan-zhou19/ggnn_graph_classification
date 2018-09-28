package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; // ??
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] pan = new int[300000];
		int[] num = new int[300000];
		int s = n * (n - 1) / 2;
		int a;
		int b;
		int i;
		for (i = 1;;i++)
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
			if (a == 0 && b == 0)
			{
				break;
			}
			else
			{
				if (pan[a] == 0) //??1:????
				{
					pan[a] = 1;
					s = s - a;
				}
				if (pan[b] == 0)
				{
					num[b]++;
				}
			}
		}
		if (num[s] == n - 1 && pan[s] == 0)
		{
			System.out.printf("%d",s);
		}
		else
		{
			System.out.print("NOT FOUND");
		}
		return 0;
	}
}

