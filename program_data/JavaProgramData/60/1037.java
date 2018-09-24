package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int jd;
		int j;
		int t;
		int temp;
		int x;
		int t2;
		int[] pt = new int[2000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		t = 0;
		x = 0;
		i = 0;
		j = 0;
		temp = 2;
		for (i = 2;i <= n;i++)
		{
			jd = 0;
			for (j = 2;j < i;j++)
			{
				if ((i % j) == 0)
				{
					jd = 1;
				}
			}
			if (jd == 0)
			{
			t2 = i - temp;
			   if (t2 == 2)
			   {
				   System.out.printf("%d %d\n",temp,i);
				   x++;
			   }
				temp = i;
				t = t + 1;
			}

		}
		if (x == 0)
		{
			System.out.print("empty");
		}
		return 0;
	}
}

