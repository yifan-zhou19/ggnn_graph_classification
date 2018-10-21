package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[1000];
		int j = 0;
		int i1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
		a[0] = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			for (int l = 0;l < j + 1; l++)
			{
				a[l] = 2 * a[l];
			}
			for (int k = j; k >= 0; k--)
			{
				if (a[k] > 9)
				{
					a[k + 1]++;
					a[k] = a[k] - 10;
					j++;
				}
				else
				{
					continue;
				}
			}
		}
		for (i1 = j; i1 > 0; i1--)
		{
			if (a[i1] != 0)
			{
				break;
			}
		}
		for (;i1 >= 0; i1--)
		{
			System.out.print(a[i1]);
		}
		System.out.print("\n");
	return 0;
	}
}

