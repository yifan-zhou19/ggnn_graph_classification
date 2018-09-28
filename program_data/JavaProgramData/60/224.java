package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a_;
		int i;
		int j = 0;
		int isbreak;
		int[] a = new int[10000];
		int count = 0;
		int count_ = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (a_ = 1; a_ <= n; a_++)
		{
			for (i = 2; i <= a_; i++)
			{
				if (a_ % i == 0 && i != a_)
				{
					break;
				}
				if (i == a_)
				{
					isbreak = 1;
					break;
				}
			}
			if (isbreak == 1)
			{
				a[j] = a_;
				j++;
			}
			isbreak = 0;
		}
		count = j;
		for (j = 0; j < count; j++)
		{
			if (a[j + 1] - a[j] == 2)
			{
				count_++;
				System.out.printf("%d %d\n", a[j], a[j + 1]);
			}
		}
		if (count_ == 0)
		{
			System.out.print("empty\n");
		}
		return 0;
	}

}

