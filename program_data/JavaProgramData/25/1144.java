package <missing>;

public class GlobalMembers
{
	public static int[] a = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	public static void multiplus(int[] a)
	{
		 int[] b = new int[100];
		 for (int i = 0;i < 100;i++)
		 {
				if (a[i] * 2 + b[i] >= 10)
				{
					b[i + 1] = 1;
				}
				a[i] = (a[i] * 2 + b[i]) % 10;
		 }
	}
	public static int Main()
	{
		int n;
		int i;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			   multiplus(a);
		}
		for (i = 99;i >= 0;i--)
		{
			  if (a[i] != 0)
			  {
				 k = i;
				 break;
			  }
		}
		for (i = k;i >= 0;i--)
		{
			System.out.print(a[i]);
		}
		return 0;
	}

}

