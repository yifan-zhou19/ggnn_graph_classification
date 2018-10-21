package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int[] h1 = new int[100];
		int[] h2 = new int[100];
		int c1 = 0;
		int c2 = 0;
		int t;
		char[][] d1 = new char[100][10];
		char[][] d2 = new char[100][10];
		String d = new String(new char[10]);
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
				d = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				t = Integer.parseInt(tempVar3);
			}
			if (t >= 60)
			{
				h1[c1] = t;
				d1[c1] = d;
				c1++;
			}
			else
			{
				h2[c2] = t;
				d2[c2] = d;
				c2++;
			}
		}
		for (i = 1;i <= c1;i++)
		{
			for (j = 0;j < c1 - i;j++)
			{
				if (h1[j] < h1[j + 1])
				{
					t = h1[j];
					h1[j] = h1[j + 1];
					h1[j + 1] = t;
					d = d1[j];
					d1[j] = d1[j + 1];
					d1[j + 1] = d;
				}
			}
		}
		for (i = 0;i < c1;i++)
		{
			System.out.println(d1[i]);
		}
		for (i = 0;i < c2;i++)
		{
			System.out.println(d2[i]);
		}
		return 0;
	}

}

