package <missing>;

public class GlobalMembers
{
	/*
	 * temp2.cpp
	 *
	 *  Created on: 2011-12-22
	 *      Author: apple
	 */
	public static int Main()
	{
		int n;
		int[] num = new int[100];
			 float[] len = new float[100];
			 float max = 0F;
			 float ave;
			 float sum = 0F;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
				num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum += num[i];
		}
		ave = sum / n;
		for (int i = 0;i < n;i++)
		{
			len[i] = num[i] - ave;
			if (len[i] < 0F)
			{
				len[i] = 0 - len[i];
			}
			if (len[i] > max)
			{
				max = len[i];
			}
		}
		int j = 0;
		int[] store = new int[100];
		for (int i = 0;i < n;i++)
		{
			if (len[i] == max)
			{
				store[j] = num[i];
				j++;
			}
		}
		int l = j;
		int temp;
			if (l == 1)
			{
				System.out.print(store[0]);
				System.out.print("\n");
			}
			else
			{
				for (int j = 0;j < l - 1;j++)
				{
					for (int i = j;i < l;i++)
					{
						if (store[i] > store[i + 1])
						{
							temp = store[i];
							store[i] = store[i + 1];
							store[i + 1] = temp;
						}
					}
				}
				System.out.print(store[0]);
				for (int i = 1;i < l;i++)
				{
					System.out.print(",");
					System.out.print(store[i]);
				}
				System.out.print("\n");
			}

	}

}

