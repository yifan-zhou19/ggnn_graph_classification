package <missing>;

public class GlobalMembers
{
	public static int f(int n) //??????????
	{
		int i = 1;
		int[] a = new int[100];
		int k = 0;
		int m = 0;
		int p;

		p = Math.abs(n); //????????
		do
		{
			a[i] = p % 10;
			p = p / 10;
			i++;
			k = k + 1;
		} while (p != 0); //????????????
		for (i = 1;i <= k;i++)
		{
			m = m + a[i] * Math.pow(10.00,(double)(k - i));
		}
		if (n >= 0)
		{
			return (m);
		}
		else
		{
			return (-m);
		} //??????????
	}

	public static int Main()
	{
		int[] a = new int[7];
		int i;
		for (i = 1;i <= 6;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i] = f(a[i]); //?????????
		}
		for (i = 1;i <= 6;i++)
		{
			System.out.print(a[i]);
			System.out.print("\n");
		}

		return 0;
	}




}

