package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int k;
		int l = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		n = n - 2;
		for (i = 2;i <= n;i++)
		{
			j = 0;
			for (m = 2;m < i;m++) //panduan i shifou sushu
			{
				if (i % m == 0)
				{
					j++;
				}
			}
			if (j == 0) //i shisushu
			{
				k = i + 2;
				for (m = 2;m < k;m++) //panduan k shifou sushu
				{
				if (k % m == 0)
				{
					j++;
				}
				}
				if (j == 0) //k shisushu
				{
					   System.out.printf("%d %d\n",i,k);
					   l++; //l zhaodao de sushudui shu
				}
			}

		}
		if (l == 0)
		{
		   System.out.print("empty");
		}
	}
}

