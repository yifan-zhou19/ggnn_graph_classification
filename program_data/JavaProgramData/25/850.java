package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int n;
		int b;
		int i;
		int j;
		int k;
		a[99] = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
						for (j = 0;j < 100;j++)
						{
										  if (a[j] * 2 >= 10)
										  {
													   a[j - 1]++;
													   b = a[j] * 2 - 10;
										  }
										  if (a[j] * 2 < 10)
										  {
													   b = a[j] * 2;
										  }
										  a[j] = b;
						}
		}
		for (j = 0;j < 100;j++)
		{
						  if (a[j] != 0)
						  {
									 for (k = j;k < 100;k++)
									 {
									 System.out.print(a[k]);
									 }
									 break;
						  }
		}
		return 0;
	}
}

