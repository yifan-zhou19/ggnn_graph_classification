package <missing>;

public class GlobalMembers
{
	public static int Main()

	{
		int n;
		int i;
		int[] a = new int[20000];
		int k;
		int j = 0;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		System.out.print(a[0]);

		for (i = 1;i < n;i++)

		{
			for (k = 0;k < i;k++)
			{

			if (a[i] == a[k])
			{
				j = j + 1;
				break;
			}
			}
			if (j == 0)
			{
				System.out.print(" ");
				System.out.print(a[i]);
			}
			j = 0;



		}





		return 0;
	}


}

