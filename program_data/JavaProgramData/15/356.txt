package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] point = new int[1000];
		int i;
		int p;
		int sta;
		int end;
		int total;
		int n;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s = 0;
		for (p = 0;p < n;p++)
		{
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					point[i] = Integer.parseInt(tempVar2);
				}
			}
			i = 0;
			do
			{
				i++;
			}while ((point[i] == 255) && (i < n));
			sta = i;
			i = n;
			do
			{
				i--;
			}while ((point[i] == 255) && (i > 0));
			end = i;
			for (i = sta;i <= end;i++)
			{
				if (point[i] == 255)
				{
					s++;
				}
			}
		}
		System.out.printf("%d",s);
	}
}

