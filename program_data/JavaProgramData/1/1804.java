package <missing>;

public class GlobalMembers
{
	public static int dividemin(int a,int minyinzi)
	{
		int num = 0;
		if (a == 1)
		{
			num++;
		}
		else
		{
			for (int i = minyinzi;i <= a;i++)
			{
			if (a % i == 0)
			{
				num = num + dividemin(a / i, i);
			}
			}
		}
		return num;
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (int i = 0;i <= n - 1;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i <= n - 1;i++)
		{
			//cout<<divide(a[i],a[i])<<endl;
			System.out.print(dividemin(a[i], 2));
			System.out.print("\n");
		}




	}
}

