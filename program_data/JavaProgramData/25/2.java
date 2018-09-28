package <missing>;

public class GlobalMembers
{
	/*-----------------------------------------*
	|? ? ?   ???2?N??           	    |
	|? ?      ????	                    |
	|? ? ? ??2010 ? 12 ? 15 ?		    |
	|? ?      ?1000012758		            |
	\*-----------------------------------------*/
	public static int Main()
	{
		int n;
		int[] a = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int Len = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			for (int j = Len; j >= 0; j--)
			{
				a[j] *= 2;
				if (a[j] >= 10)
				{
					a[j + 1] += a[j] / 10;
					a[j] %= 10;
					if (j + 1 > Len)
					{
						Len = j + 1;
					}
				}
			}
		}
		for (int i = Len; i >= 0; i--)
		{
			System.out.print(a[i]);
		}
		return 0;
	}
}

