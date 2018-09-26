package <missing>;

public class GlobalMembers
{
	//********************************
	//*?????? 1300012809      **
	//*???2013.10.30             **
	//*???????????       **
	//********************************
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int l;
		int m;
		int jishu;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[1000001]; //????
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		jishu = 0;
		for (j = 0;j < n;j++)
		{
			do
			{
			if (a[j] == k) //?????????
			{
				jishu = jishu + 1; //??????????????????
				a[j] = a[j + 1];
				for (l = j + 1;l < n;l++)
				{
					a[l] = a[l + 1]; //??????
				}
			}
			}while (a[j] == k); //????????????????

		}
		for (i = 0;i < (n - jishu);i++)
		{
			if (i == 0)
			{
				System.out.print(a[0]);
			}
			if (i != 0)
			{
				System.out.print(" ");
				System.out.print(a[i]);
			}
		}

		return 0;
	}

}

