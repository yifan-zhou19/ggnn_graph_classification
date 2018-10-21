package <missing>;

public class GlobalMembers
{
	/**  
	* @file   ????? .cpp  
	* @author ???  
	* @date   2013-10-31
	* @description 
	*          ??????: ?????   */ 
	public static int Main()
	{
		int[] a = new int[1001];
		int[] b = new int[1001];
		int i = 1;
		do
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			i++;
		}while (System.in.read() == ',');
		int j = 1;
		do
		{
			b[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			j++;
		}while (System.in.read() == ',');
		System.out.print((i - 1));
		System.out.print(" ");
		int num = 0;
		int num1 = INT_MIN;
		for (int h = 1;h <= 1000;h++)
		{
			num = 0;
			for (int p = 1;p <= i;p++)
			{
				if ((h >= a[p]) && (h < b[p]))
				{
					num++;
				}
			}
			if (num > num1)
			{
				num1 = num;
			}
		}
		System.out.print(num1);
		return 0;
	}
}

