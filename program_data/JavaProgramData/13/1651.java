package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		int num = 0;
		int c = 1;
		int j;
		int i;
		int[] b = new int[100];
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)


		{
			for (j = 0;j < i;j++)
			{
				 if (a[i] == a[j])
				 {
				 c = 0;
				 }
			}

			 if (c != 0)
			 {
				 num = num + 1;
				b[num] = a[i];

			 }
			 c = 1;
		}

		for (i = 1;i < num;i++)
		{
		  System.out.print(b[i]);
		  System.out.print(" ");

		}
		System.out.print(b[num]);









		return 0;
	}

}

