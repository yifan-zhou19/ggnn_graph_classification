package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		int s;
		int t;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		e = 0;
		for (i = 2;i < (n - 1);i++)
		{
			j = i + 2;
			s = 0;
			t = 0;
			for (k = 2;k < i;k++)
			{
				if (i % k == 0)
				{
					s++;
				}
			}
			for (l = 2;l < j;l++)
			{
				if (j % l == 0)
				{
					t++;
				}
			}
			if (s == 0 && t == 0)
			{
				System.out.printf("%d %d\n",i,j);
				e = e++;
			}
		}
		if (e == 0)
		{
			System.out.print("empty");
		}
	}

}

