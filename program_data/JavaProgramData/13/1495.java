package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[100001];
		int h;
		int i;
		int j;
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			h = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(null, 1);
			if (tempVar3 != null)
			{
				c = tempVar3.charAt(0);
			}
			if (i == 1)
			{
				System.out.printf("%d",a[i]);
			}
			else
			{
			for (j = 1;j < i;j++)
			{
				if (a[j] == a[i])
				{
					h = 1;
					break;
				}
			}
				if (h == 0)
				{
					System.out.printf(" %d",a[i]);
				}
			}
		}
	}
}

