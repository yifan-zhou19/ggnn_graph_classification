package <missing>;

public class GlobalMembers
{
	/*??????
	???   1200012876
	2012?10?16?22:36:30   */
	public static int Main()
	{
	int n; //??????
	int[] a = new int[1000];
	int[] b = new int[1000];
	int[] N = new int[1000];
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int j = 1;j <= n;j++)
	{
	b[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if (b[j] < 3)
	{
		System.out.print("1");
		System.out.print("\n");
	}
	else //???3???????
	{
			for (int i = 3;i <= b[j];i++)
			{
			a[1] = 1,a[2] = 1;
			a[i] = a[i - 1] + a[i - 2];
			}
			N[j] = a[b[j]]; //?a[????]?N[j]
			System.out.print(N[j]);
			System.out.print("\n");
	}
	}
			return 0;
	}

}

