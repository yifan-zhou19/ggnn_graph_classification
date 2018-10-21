package <missing>;

public class GlobalMembers
{
	public static int f(int x,int y) //???????????????y?????????x????????
	{
		int i;
		int num = 0;
	int[] a = new int[100];
	int sum = 0;
		for (i = x;i <= Math.sqrt(y);i++)
		{
			if (y % i == 0)
			{
				num++;
				a[num] = 1 + f(i, y / i);
			}
		} //??????
	  for (i = 1;i <= num;i++)
	  {
		  sum = sum + a[i];
	  }
			  return sum;
	}

	public static int Main()
	{
	int n;
	int x;
	int i;
	int[] b = new int[100];
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1;i <= n;i++)
	{
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b[i] = x;
	}
	for (i = 1;i <= n;i++)
	{
		System.out.print(f(2, b[i]) + 1);
		System.out.print("\n");
	} //???????

	return 0;

	}
}

