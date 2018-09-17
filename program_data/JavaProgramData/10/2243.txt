package <missing>;

public class GlobalMembers
{
	// itc online practice nov 13 prob 6
	public static int k;
	public static int[] height = new int[26];
	public static int len(int num)
	{
		int temp;
		int max;
		int i;
		if (num == k)
		{
					return (1);
		}
		else
		{
				max = 0;
				for (i = num + 1;i <= k;i++)
				{
					if (height[num] >= height[i])
					{
												temp = len(i);
												if (max < temp)
												{
															  max = temp;
												}
					}
				}
		}
		return (max + 1);
	}
	public static int Main()
	{
		   height[0] = 30001;
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   k = Integer.parseInt(tempVar);
		   }
		   int i;
		   for (i = 1;i <= k;i++)
		   {
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   height[i] = Integer.parseInt(tempVar2);
			   }
		   }
		   System.out.printf("%d",len(0) - 1);
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   k = Integer.parseInt(tempVar3);
		   }
	}

}

