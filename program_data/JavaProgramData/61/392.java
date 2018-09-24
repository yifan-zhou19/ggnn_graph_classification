package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int k;
		int q;
		int w;
		int e;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = 0;
		while (k < n) //????????
		{
			a[k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			k++;
		}
		i = 0;
		while (i < n) //???????????
		{
		q = w = 1;
		e = 0;
		k = 2;
		if (a[i] == 1) //?????1,2?,???1 ????????a[i]?
		{
			System.out.print(q);
			System.out.print("\n");
		}
		else if (a[i] == 2)
		{
			System.out.print(w);
			System.out.print("\n");
		}
		else
		{
			while (k < a[i])
			{
			e = q + w;
			q = w;
			w = e;
			k++;
			}
		System.out.print(e);
		System.out.print("\n");
		}
		i++;
		}

		return 0;
	}


}

