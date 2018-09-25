package <missing>;

public class GlobalMembers
{
	//????

	//?????
	public static int ana(int n,int p)
	{
		int i;
		int t;
		int s = 1;
		t = Math.pow(n,0.5);
		for (i = p;i <= t;i++)
		{
			if (n % i == 0)
			{
				s = s + ana(n / i, i); //??
			}
		}
		return s;
	}
	//???
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			System.out.print(ana(a[i], 2));
			System.out.print("\n");
		}
		return 0;
	}

}

