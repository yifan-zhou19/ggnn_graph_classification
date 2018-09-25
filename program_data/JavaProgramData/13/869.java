package <missing>;

public class GlobalMembers
{
	/*
	 * ????cout.cpp
	 * ?????
	 * ????: 2011-10-21
	 * ???????????
	 */
	public static int Main()
	{
		int n; //??????????????????
		int i;
		int j;
		int k;
		int l = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[20000]; //????
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			int flag = 0;
			for (j = 0;j < i;j++)
			{
					  if (a[i] == a[j]) //?????????
					  {
						  flag = 1;
						  break;
					  }
			}
			if (flag == 0)
			{
				System.out.print(a[i]);
				break;
			}
		}
		i++;
		for (;i < n;i++)
		{
			int flag = 0;
			for (j = 0;j < i;j++)
			{
				   if (a[i] == a[j]) //?????????
				   {
						  flag = 1;
						  break;
				   }
			}
			if (flag == 0)
			{
				System.out.print(' ');
				System.out.print(a[i]);
			}
		}
		return 0; //????
	}


}

