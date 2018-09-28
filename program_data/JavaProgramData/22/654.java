package <missing>;

public class GlobalMembers
{
	/*************************************************************************
	* Project: ???
	* Function:
	*************************************************************************
	* Author: S.H
	* Date: 2011-12-31
	*************************************************************************
	*
	* Copyright 2011
	*
	************************************************************************/
	public static int comp(Object a, Object b)
	{
		return (int)a - (int)b;
	}
	public static int Main()
	{
		int[] result = new int[301];
		int i = 1;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			result[0] = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Variables cannot be declared in if/while/switch conditions in Java:
		while (scanf(",%d", result[i++]) == 1)
		{
			;
		}
		//for(j=0;j<i;j++)printf("[%d]",result[j]);
		qsort(result,i,(Integer.SIZE / Byte.SIZE),comp);
		if (find2nd(i - 1, result) == -1)
		{
		System.out.print("No");
		}
		else
		{
		System.out.printf("%d",find2nd(i - 1, result));
		}

		return 0;
	}
	public static int find2nd(int num, int[] result)
	{
		int k;
		int second = -1;
		int max = result[0];
		if (num == 1)
		{
			return -1;
		}
		for (k = 0; k < num; k++)
		{
			if (result[k] > max)
			{
				second = max;
				max = result[k];
			}
			else if ((result[k] > second) && (result[k] < max))
			{
				second = result[k];
			}
		}
		//printf("second=%d,max=%d",second,max);
		if (second == max)
		{
			return -1;
		}
		else
		{
			return second;
		}
	}

}

