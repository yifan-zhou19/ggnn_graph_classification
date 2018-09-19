package <missing>;

public class GlobalMembers
{
	//********************************
	//* Name:????                *
	//* Authur:sunzeyu               *
	//* Editting time:2013.10.19     *
	//* Function:????            *
	//********************************
	public static int Main()
	{
		int[] a = new int[5];
		int n;
		int i;
		int k = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < 5;i++)
		{
			a[i] = n % 10;
			n = n / 10;
		}
		for (i = 4;i >= 0;i--)
		{
			if (a[i] != 0)
			{
				k = i;
				break;
			}
		}
		for (i = 0;i <= k;i++)
		{
			System.out.print(a[i]);
		}
		System.out.print("\n");
		return 0;
	}
}

