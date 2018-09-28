package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int h;
		int l;
		int a = 0;
		int b;
		int x = 0;
		int e;
		int k;
		int[] s = new int[100];
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
					h = Integer.parseInt(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					l = Integer.parseInt(tempVar3);
				}
				if (h >= 90 && h <= 140 && l >= 60 && l <= 90)
				{
					a++;
				}
				else
				{
					a = 0;
				}
				s[x] = a;
				x++;
		}
		for (k = 1;k < 100;k++)
		{
			for (x = 0;x < 100 - k;x++)
			{
				if (s[x] > s[x + 1])
				{
					e = s[x];
					s[x] = s[x + 1];
					s[x + 1] = e;
				}
			}
		}

		System.out.printf("%d",s[99]);
		return (0);
	}
}

