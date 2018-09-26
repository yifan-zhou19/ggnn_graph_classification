package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int i;
		int j;
		int sum;
		int t;
		int u;
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
			for (i = 1;;i++)
			{
				sum = n * i;
				t = sum;
					for (j = 1;j < n;j++)
					{
						u = sum + k;
						if (u % (n - 1) == 0)
						{
							sum = (sum + k) * n / (n - 1);
						}
						else
						{
							sum = t;
							break;
						}
					}
					if (sum != t)
					{
						sum = sum + k;
						System.out.printf("%d",sum);
						break;
					}
					else
					{
						continue;
					}
			}
	}
}

