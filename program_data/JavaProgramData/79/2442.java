package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[] a = new int[301];
		int k;
		int i;
		int j;
		int num;
	for (int p = 0;p < 100;p++)

	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if (n != 0)
	{
		for (i = 1;i <= n;i++)
		{
		a[i] = 1;
		}
	j = 0;
	k = 0;
	for (i = 1;i <= n;i++)
	{
	  if (a[i] == 1)
	  {
		j = j + a[i];
		if (j == m)
		{
			 j = 0;
			 a[i] = 0;
			 k++;
		}
		if (k == n)
		{
			 num = i;
			 break;
		}
	  }
	  if (i == n)
	  {
	  i = 0;
	  }
	}
	System.out.print(num);
	System.out.print("\n");
	}
	}
	return 0;
	}

}

