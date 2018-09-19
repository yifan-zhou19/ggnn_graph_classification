package <missing>;

public class GlobalMembers
{
	/* Author: Yahoo */
	/* Date: 2011-10-12 */
	/* Function: random access to files */
	/*#include<stdio.h>
	int main()
	{
		if(4==5,5)
			printf("good\n");
		return 0;
	}*/
	public static int Main()
	{
		int n;
		int sum = 0;
		int[] mat = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(mat, 0, (Integer.SIZE / Byte.SIZE));
		while (scanf("%d", n), n != -1)
		{
			if (n == 0)
			{
				System.out.printf("%d\n", sum);
				sum = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				memset(mat, 0, (Integer.SIZE / Byte.SIZE));
			}
			else if (n > 49)
			{
				mat[n] = 1;
//C++ TO JAVA CONVERTER WARNING: The right shift operator was not replaced by Java's logical right shift operator since the left operand was not confirmed to be of an unsigned type, but you should review whether the logical right shift operator (>>>) is more appropriate:
				if (mat[n >> 1] != 0)
				{
					sum++;
				}
			}
			else
			{
				mat[n] = 1;
				if (mat[n << 1] != 0)
				{
					sum++;
				}
//C++ TO JAVA CONVERTER WARNING: The right shift operator was not replaced by Java's logical right shift operator since the left operand was not confirmed to be of an unsigned type, but you should review whether the logical right shift operator (>>>) is more appropriate:
				if (!(n & 1) && mat[n >> 1] != 0)
				{
					sum++;
				}
			}
		}
		return 0;
	}
}
