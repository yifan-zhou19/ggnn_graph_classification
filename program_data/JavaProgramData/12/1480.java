package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[2000];
	int i;
	int m;
	int n;
	int k;
	int lt;
	k = 0;
	lt = 0;
	for (i = 0;i < 2000;i++)
	{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if (a[i] == -1)
	{
		break;
	}
	if (a[i] == 0)
	{
			for (m = lt;m < i;m++)
			{
			   for (n = lt;n < i;n++)
			   {
				 if (a[m] == 2 * a[n])
				 {
		k++;
				 }
			   }
			}
				System.out.print(k);
				System.out.print("\n");
		   k = 0;
				lt = i + 1;
	}
	}
	return 0;
	}
}

