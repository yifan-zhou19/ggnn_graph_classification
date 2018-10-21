package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		double[] nan = new double[40];
		double[] nv = new double[40];
		int i;
		int j = 0;
		int k = 0;
		int p;
		int l;
		int x;
		int y;
		int z;
		int q;
		String a = new String(new char[10]);
		double b;
		double c;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (strcmp(a,"male") == 0)
			{
				nan[j++] = b;
			}
			else
			{
				nv[k++] = b;
			}
		}
		for (p = 0;p < j - 1;p++)
		{
			for (l = 0;l < j - 1 - p;l++)
			{
				if (nan[l] > nan[l + 1])
				{
					b = nan[l];
					nan[l] = nan[l + 1];
					nan[l + 1] = b;
				}
			}
		}
		for (x = 0;x < k - 1;x++)
		{
			for (y = 0;y < k - 1 - x;y++)
			{
				if (nv[y] < nv[y + 1])
				{
					c = nv[y];
					nv[y] = nv[y + 1];
					nv[y + 1] = c;
				}
			}
		}
		for (z = 0;z < j;z++)
		{
			System.out.printf("%.2f", nan[z]);
			System.out.printf("%.2f", " ");
		}
		for (q = 0;q < k - 1;q++)
		{
			System.out.printf("%.2f", nv[q]);
			System.out.printf("%.2f", " ");
		}
		System.out.printf("%.2f", nv[k - 1]);
		return 0;
	}





}

