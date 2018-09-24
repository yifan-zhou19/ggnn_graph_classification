package <missing>;

public class GlobalMembers
{
	/**
	* @desc ??????: ??2?1000???????
	* @author ??? 1100012829 
	* @date 2011-10-12
	*/
	public static int Main()
	{
	int[] a = new int[16];
	int n;
	int i = 1;
	for (;a[i] != -1;) //a[i]???????
	{
		n = 0;
		for (i = 0;;i++) //???
		{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				for (int j = 0;j < i;j++)
				{
						if (a[j] * 2 == a[i] || a[j] == a[i] * 2)
						{
							n++;
						}
				}
				if (a[i] == 0 || a[i] == -1)
				{
					break;
				} //?????? -1?????????
		}
		if (a[i] != -1)
		{
			System.out.print(n);
			System.out.print("\n");
		}
	}
	}

}

