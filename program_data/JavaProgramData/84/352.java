package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] sz = new int[100];
		int n;
		int max1;
		int max2;
		int i;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			max1 = sz[0];
			max2 = sz[1];
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sz[i] = Integer.parseInt(tempVar2);
				}
				if (max1 < sz[i])
				{
					max2 = max1;
					max1 = sz[i];
				}
				else if (max1 > sz[i] && max2 < sz[i])
				{
					max2 = sz[i];
				}
			}
			System.out.printf("%d\n%d",max1,max2);
	}
}

