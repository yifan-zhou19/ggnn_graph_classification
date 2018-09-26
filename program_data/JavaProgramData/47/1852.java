package <missing>;

public class GlobalMembers
{
	//????
	public static int Main()
	{
		int[] a = new int[100];
		int temp;
		int n;
		int i; //????
		int j;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		for (i = 0,j = n - 1;i < j;i++,j--) //?????i>=j
		{
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}

		for (i = 0;i < n - 1;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}

		System.out.print(a[n - 1]);


		return 0;

	}
}

