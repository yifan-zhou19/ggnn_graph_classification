package <missing>;

public class GlobalMembers
{
	/*
	 * ???????.cpp
	 *
	 *  ??: 2012-11-3
	 *  ????????
	 */
	public static int Main()
	{
		int n; //????
		int i;
		int j;
		int m = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n]; //????
		for (i = 0;i < n;i++) //??????
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{ //????
			int t = 0; //???t
			 for (j = 0;j < i;j++) //??????????
			 {
				if (a[i] == a[j])
				{
					   t++; //?????t?????????
					break;
				}
			 }
		if (t == 0)
		{ //?t??0
			if (m > 0)
			{
				System.out.print(" ");
			}
			System.out.print(a[i]);
			m++;
		}
		}
		return 0;

	}

}

