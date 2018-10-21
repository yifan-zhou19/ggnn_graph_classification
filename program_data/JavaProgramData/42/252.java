package <missing>;

public class GlobalMembers
{
	//********************************
	//* file homework                *
	//* author ??                  *
	//* data 10/10/29                *
	//* ??  ???????         *
	//********************************

	public static int Main()
	{
		int n; //?????
		int i;
		int j;
		int l;
		int w;
		int k;
		int[] a = new int[200000]; //?????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1 ; i <= n; i++) //?????????
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 1,l = 1; j <= n ;j++) //???????????
		{
			if (a[j] != k)
			{
				a[l++] = a[j];
			}
		}
		for (w = 1; w < l;w++) //???????
		{
			if (w == 1)
			{
				System.out.print(a[1]);
			}
			else
			{
				System.out.print(" ");
				System.out.print(a[w]);
			}
		}

		return 0;
	}


}

