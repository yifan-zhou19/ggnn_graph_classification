package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int i;
		int j;
		int m;
		j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 for (i = 1;i <= j;i++)
		 {
		   a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
		for (i = 1;i <= j;i++)
		{
		m = j + 1 - i;
		b[m] = a[i];
		}
		for (m = 1;m <= j - 1;m++)
		{
		  System.out.print(b[m]);
		  System.out.print(" ");
		}
		System.out.print(b[j]);
		return 0;
	}

}

