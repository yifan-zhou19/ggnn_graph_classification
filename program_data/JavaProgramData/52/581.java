package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int m;
		int i;
		int j;
		int t;
		int r;
		int l;
		int[] num = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead("""");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				num[i] = Integer.parseInt(tempVar3);
			}
		}
		for (j = 0;j < m;j++)
		{
			t = num[n - 1];
			for (r = n - 2;r >= 0;r--)
			{
				num[r + 1] = num[r];
			}
			num[0] = t;
		}
		for (l = 0;l < n;l++)
		{
				  if (l > 0)
				  {
			 System.out.printf(" %d",num[l]);
				  }
	else
	{
		System.out.printf("%d",num[l]);
	}
		}

	}
}

