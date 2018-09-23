/*
 * =====================================================================================
 *
 *       Filename:  missle.c
 *
 *    Description:  missle
 *
 *        Version:  1.0
 *        Created:  2007-12-2 11:15:15 ??????
 *       Revision:  none
 *       Compiler:  gcc
 *
 *         Author:  Meng Xinfan (fl), mxf@pku.edu.cn
 *        Company:  PKU
 *
 * =====================================================================================
 */

//C++ TO JAVA CONVERTER NOTE: Enums must be named in Java, so the following enum has been named AnonymousEnum:
public enum AnonymousEnum
{
	MAX_NUM(25);

	public static final int SIZE = java.lang.Integer.SIZE;

	private int intValue;
	private static java.util.HashMap<Integer, AnonymousEnum> mappings;
	private static java.util.HashMap<Integer, AnonymousEnum> getMappings()
	{
		if (mappings == null)
		{
			synchronized (AnonymousEnum.class)
			{
				if (mappings == null)
				{
					mappings = new java.util.HashMap<Integer, AnonymousEnum>();
				}
			}
		}
		return mappings;
	}

	private AnonymousEnum(int value)
	{
		intValue = value;
		getMappings().put(value, this);
	}

	public int getValue()
	{
		return intValue;
	}

	public static AnonymousEnum forValue(int value)
	{
		return getMappings().get(value);
	}
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			int missle_num = 0;
			// height: [[height_of_missle, max_num_of_descending_missle_since_then] ...]
			int[][] height = new int[AnonymousEnum.MAX_NUM.getValue()][2];
			int i;
			int j;
			int max = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				missle_num = Integer.parseInt(tempVar);
			}

			for (i = 0; i < missle_num; i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					height[i][0] = Integer.parseInt(tempVar2);
				}
				height[i][1] = 1;
			}

			for (i = 0; i < missle_num; i++)
			{
				/*printf("%d ", height[i][0]);*/
			}

			for (i = 0 ; i < missle_num; i++)
			{
				for (j = i - 1; j >= 0; j--)
				{
					if (height[i][0] <= height[j][0])
					{
						if (height[i][1] < height[j][1] + 1)
						{
							height[i][1] = height[j][1] + 1;
						}
					}
				}
			}

		max = 0;
		for (i = 0; i < missle_num; i++)
		{
			/*printf("%d ", height[i][1]);*/
			if (max < height[i][1])
			{
				max = height[i][1];
			}
		}
		System.out.printf("\n%d\n", max);
		return 0;
	}

}

