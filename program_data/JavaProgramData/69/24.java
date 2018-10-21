package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[250];
		int[] b = new int[250];
		int ia = 0;
		int ib = 0;
		while (true)
		{
			char c = System.in.read();
		if (c == '\n')
		{
			break;
		}
			a[ia++] = c - '0';
		}
		while (true)
		{
			char c = System.in.read();
			if (c == '\n')
			{
				break;
			}
			b[ib++] = c - '0';
		}

		int ir;
		int addin = 0;
		int[] result = new int[255];
		for (ir = 0; ir < ia || ir < ib; ir++)
		{
			int ta;
			int tb;
			if (ir >= ia)
			{
				ta = 0;
			}
			else
			{
				ta = a[ia - 1 - ir];
			}
			if (ir >= ib)
			{
				tb = 0;
			}
			else
			{
				tb = b[ib - 1 - ir];
			}

			int tr = ta + tb + addin;
			addin = tr / 10;
			tr %= 10;
			result[ir] = tr;
		}
		result[ir] = addin;

		while (ir >= 0 && result[ir] == 0)
		{
			ir--;
		}

		if (ir < 0)
		{
			System.out.print(0);
			System.out.print("\n");
		}
		else
		{
			for (int i = ir; i >= 0; i--)
			{
				System.out.print(result[i]);
			}
			System.out.print("\n");
		}

		return 0;
	}
}
