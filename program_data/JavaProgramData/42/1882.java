package <missing>;

public class GlobalMembers
{
	/**  
	* @file   ???????? .cpp  
	* @author ???  
	* @date   2013-10-31
	* @description 
	*          ??????: ????????   */ 
	public static int Main()
	{
		int[] a = new int[100001];
		int num;
		int c;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = 0;i < num;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int q = 0 ;q < num;q++)
		{
			if (a[q] == c)
			{
				for (int p = q;p < num;p++)
				{
					a[p] = a[p + 1];
				}
				num = num - 1;
				q = q - 1;
			}
		}
		for (int j = 0;j < (num - 1);j++)
		{
			System.out.print(a[j]);
			System.out.print(" ");
		}
		System.out.print(a[num - 1]);
		return 0;
	}

}

