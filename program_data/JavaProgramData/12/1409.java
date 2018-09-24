package <missing>;

public class GlobalMembers
{
	//********************************
	//*??                         **
	//*????? 1300012848        **
	//*???2013.10.30             **
	//********************************
	public static int Main()
	{
		int i; //0????????????????????16??????????15+1??
		int j;
		int k;
		int[] a = new int[16];
		int count;
		do
		{
			count = 0;
			a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[0] == -1) //???-1?????? ????
			{
				break;
			}
			for (i = 1;; i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a[i] == 0) //??????0????????
				{
					break;
				}
			}
			for (j = 0; j < i; j++)
			{
				for (k = 0; k < j; k++)
				{
					if (a[k] == 2 * a[j] || 2 * a[k] == a[j]) //?????????????
					{
						count++;
					}
				}
			}
			System.out.print(count);
			System.out.print("\n");
		}while (1 != 0);
		return 0;
	}
}

