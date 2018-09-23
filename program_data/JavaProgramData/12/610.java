package <missing>;

public class GlobalMembers
{
	//****************************************
	//*?????                          **
	//*?????? 1100012920              **
	//*???2011.10.119                     **
	//****************************************
	public static int Main()
	{
		int i;
		int k;
		int j;
		int count = 0;
		int[] a = new int[16];
		 while (a[0] != -1)
		 {
			count = 0;
			for (i = 0; i <= 15; i++)
			{
					a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					if (a[i] == 0 || a[0] == -1)
					{
					   break;
					}
			}
			if (a[0] == -1)
			{
				break;
			}
			for (k = 0; k <= 15; k++)
			{
			   for (j = k + 1; j <= 16; j++)
			   {
				   if (a[j] == 0)
				   {
					   break;
				   }
				   if (a[k] == 2 * a[j] || a[j] == 2 * a[k])
				   {
					   count++;
				   }
			   }
			}
			System.out.print(count);
			System.out.print("\n");

		 }
		return 0;
	}
}

