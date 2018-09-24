package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[20001]; //????a[20001],??a[n]????0
		int n = 0; //?????n
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int[] b = new int[20001]; //????b[20001],??b[n]????0
		int[] c = new int[20001]; //????c[20001],??c[n]????0
		int l = 1; //??l
		for (int j = 1;j <= n;j++)
		{
			for (int k = 0;k < j;k++)
			{
				if (a[j] == a[k])
				{
					b[j] = 1;
					//????????,b[j]??
				}
			}
		}
		for (int p = 1;p <= n;p++)
		{
			if (b[p] == 0)
			{
				c[l] = a[p];
				l = l + 1; //?????????????????c[l]

			}
		}
		for (int m = 1;c[m] > 0;m++)
		{
			if (c[m + 1] > 0) //?c[m]??????
			{
				System.out.print(c[m]);
				System.out.print(" ");
			}
			if (c[m + 1] == 0) //?c[m]?????
			{
				System.out.print(c[m]);
				System.out.print("\n");
			}
		}
		return 0;
	}


}

