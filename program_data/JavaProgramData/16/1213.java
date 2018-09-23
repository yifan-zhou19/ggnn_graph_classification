package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int num;
		int k;
		int[] a = new int[6];

		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (num == 0)
		{
			System.out.print(num);
		}
		for (i = 5;i >= 0;i--)
		{
			a[5 - i] = num / (Math.pow((float)10,i));
			num = num - a[5 - i] * Math.pow((float)10,i);

		}

		for (i = 0;i < 6;i++)
		{

		if (a[i] != 0)
		{
			break;
		}


		}

		for (k = 5;k >= i;k--)
		{

		System.out.print(a[k]);

		}

		return 0;
	}


}

