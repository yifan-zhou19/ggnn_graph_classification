package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[4];
		int[] b = {10, 20, 30, 40, 50};
		int i;
		int j;
		int k;
		int l;
		int m;
		for (i = 0;i < 5;i++)
		{
			a[0] = b[i];
			for (j = 0;j < 5;j++)
			{
				a[1] = b[j];
				for (k = 0;k < 5;k++)
				{
					a[2] = b[k];
					for (l = 0;l < 5;l++)
					{
						a[3] = b[l];
						if (i != j && i != k && i != l && j != k && j != l && a[0] + a[1] == a[2] + a[3] && a[0] + a[3] > a[1] + a[2] && a[0] + a[2] < a[1])
						{
							break;
						}
					}
					if (i != j && i != k && i != l && j != k && j != l && a[0] + a[1] == a[2] + a[3] && a[0] + a[3] > a[1] + a[2] && a[0] + a[2] < a[1])
					{
							break;
					}
				}
				if (i != j && i != k && i != l && j != k && j != l && a[0] + a[1] == a[2] + a[3] && a[0] + a[3] > a[1] + a[2] && a[0] + a[2] < a[1])
				{
							break;
				}
			}
			if (i != j && i != k && i != l && j != k && j != l && a[0] + a[1] == a[2] + a[3] && a[0] + a[3] > a[1] + a[2] && a[0] + a[2] < a[1])
			{
							break;
			}
		}
			System.out.print("l ");
			System.out.print(a[3]);
			System.out.print("\n");
			System.out.print("q ");
			System.out.print(a[1]);
			System.out.print("\n");
			System.out.print("z ");
			System.out.print(a[0]);
			System.out.print("\n");
			System.out.print("s ");
			System.out.print(a[2]);
			System.out.print("\n");
		return 0;
	}
}
