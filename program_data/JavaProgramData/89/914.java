package <missing>;

public class GlobalMembers
{
	//******************
	//?????????
	//?????
	//???2011-12-10
	//******************
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p1 = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p2 = 0;
		int[] a = new int[10000];
		int i;
		int j;
		int n;
		int[] b = new int[100000];
		int[] c = new int[100000];
		p1 = b; //?b?c??????????p1?p2
		p2 = c;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;;i++)
		{
			*p1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			*p2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (*p1 == 0 && *p2 == 0) //????0 0?????
			{
				break;
			}
			for (j = 0;;j++)
			{
				if (j == *p2) //????????????????a????
				{
					a[j]++;
					break;
				}
			}
			p1++; //???????
			p2++;
		}
		int k = 0; //k?????????
		for (j = 0;;j++)
		{
			if (a[j] == n - 1) //??????????
			{
				for (;i > 1;i--) //??????????????????
				{
					if (*--p1 == j)
					{
						break;
					}
				}
				if (i == 1) //i=1??????????
				{
					System.out.print(j);
					k = 1;
					break;
				}
			}
		}
		if (k == 0) //??????????????
		{
			System.out.print("NOT FOUND");
		}
		return 0;
	}
}

