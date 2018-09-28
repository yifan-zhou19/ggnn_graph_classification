package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int[] a = new int[60];
		int sum = 0;
		int p;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,(Integer.SIZE / Byte.SIZE));
			k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (k == 0)
			{
				System.out.print("60");
				System.out.print("\n");
			}
			else
			{
			for (int j = 0;j < k;j++)
			{
				a[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (int j = k - 1;j > 0;j--)
			{
				a[j] = a[j] - a[j - 1];

			}
			for (p = 0;p < k;p++)
			{
				if (sum + a[p] + 3 <= 60)
				{
				sum += a[p] + 3;
				}
			else if (sum + a[p] <= 60)
			{
				System.out.print(sum + a[p] - 3 * p);
				System.out.print("\n");
				break;
			}
			else
			{
				System.out.print(60 - 3 * p);
				System.out.print("\n");
			break;
			}
			}
			if (p == k)
			{
				System.out.print(60 - 3 * p);
				System.out.print("\n");
			}
			sum = 0;


			}

		}
		return 0;
	}

}

