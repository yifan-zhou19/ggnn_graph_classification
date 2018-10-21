package <missing>;

public class GlobalMembers
{
	//****************************************
	//*???????                       **
	//*?????? 1100012763              **
	//*???2011.11.14                     **
	//****************************************
	public static int Main()
	{
		int count;
		int i;
		int j;
		int ans;
		int[] a = new int[L];
		int[] b = new int[L];
		int[] num = new int[L];
		char zifu;

		count = 0;
		while (true)
		{
			count++;
			a[count] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			zifu = System.in.read();
			if (zifu == 10)
			{
				break;
			}
		}
		for (i = 1; i <= count; i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			zifu = System.in.read();
		}
		ans = 0;
		for (i = 1; i <= L; i++)
		{
			num[i] = 0;
		}
		for (i = 1; i <= count; i++)
		{
			for (j = a[i]; j < b[i]; j++)
			{
				num[j]++;
				if (num[j] > ans)
				{
					ans = num[j];
				}
			}
		}
		System.out.print(count);
		System.out.print(' ');
		System.out.print(ans);
		return 0;
	}
}

