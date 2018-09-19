package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100]; //?????????
		int[] b = new int[100];
		int i;
		int m;
		int n;
	a[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	b[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1;;i++)
	{
		if (a[i] % 2 == 0)
		{
			a[i + 1] = a[i] / 2;
		}
	 else
	 {
		 a[i + 1] = (a[i] - 1) / 2;
	 }

	 if (a[i + 1] == 1)
	 {
		 break; //?????????
	 }

	}
	 m = i + 1;

	for (i = 1;;i++)
	{
		if (b[i] % 2 == 0)
		{
			b[i + 1] = b[i] / 2; //??????
		}
	 else
	 {
		 b[i + 1] = (b[i] - 1) / 2;
	 }

	  if (b[i + 1] == 1)
	  {
		  break;
	  }
	}
	  n = i + 1;

	for (i = 1;i <= (m> n != 0?n:m);i++)
	{
		if (a[m - i] != b[n - i])
		{
			System.out.print(a[m - i + 1]);
		}
	 if (a[m - i] != b[n - i])
	 {
		 break;
	 }

	}

	return 0;
	}
}

