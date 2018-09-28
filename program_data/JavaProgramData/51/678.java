package <missing>;

public class GlobalMembers
{
	//********************************
	//*???3.n-gram???? **
	//*?????? 1300017623 **
	//*???2013.12.11  **
	//********************************
	public static int Main()
	{
		char[][] a = new char[500][6]; //????n-gram??
		String p = a;
		int[] b = new int[500]; //????
		int[] q = b;
		String c = new String(new char[500]); //?????
		String r = c;
		int n;
		int m = 1;
		int i;
		int j;
		int k = 0;
		int l;
		int flag;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 0; i <= c.length() - n; i++) //????
		{
			for (j = 0; j < n; j++)
			{
				*(*(p.Substring(i)) + j) = *(r.Substring(i) + j);
			}
		}
		for (i = 1; i < c.length() - n + 1; i++) //??????
		{
			for (j = 0; j < i; j++) //???????
			{
				flag = 1;
				for (k = 0; k < n; k++) //??????
				{
					if (*(r.Substring(i) + k) != *(r.Substring(j) + k))
					{
						flag = 0;
					}
				}
				if (flag != 0) //???
				{
					(q[j])++; //??+1
					break;
				}
			}
		}
		flag = 1;
		for (i = 500; i > 1; i--) //??????????
		{
			for (j = 0; j < c.length(); j++) //????????
			{
				if (q[j] + 1 == i) //????????
				{
					if (flag != 0) //??????
					{
						System.out.print((q + j) + 1);
						System.out.print("\n");
						flag = 0;
					}
					for (l = 0; l < n; l++) //????
					{
						System.out.print((*(p.Substring(j)) + l));
					}
					System.out.print("\n");
				}
			}
			if (flag == 0) //??????
			{
				break;
			}
		}
		if (flag != 0) //???????NO
		{
			System.out.print("NO");
			System.out.print("\n");
		}

		return 0;
	}
}

