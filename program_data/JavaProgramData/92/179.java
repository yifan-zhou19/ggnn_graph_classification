package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[1010];
	public static int[] b = new int[1010];
	public static int comp(Object elem1, Object elem2)
	{
		return ((int) elem1) - ((int)elem2);
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		int heada;
		int taila;
		int headb;
		int tailb;
		int win;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n != 0)
		{
			for (i = 0 ; i < n ; i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0 ; i < n ; i++)
			{
				b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			qsort(a,n,(Integer.SIZE / Byte.SIZE),comp);
			qsort(b,n,(Integer.SIZE / Byte.SIZE),comp);
			heada = headb = 0;
			taila = tailb = n - 1;
			win = 0;
			while (tailb >= headb)
			{
				if (a[taila] > b[tailb])
				{
					taila--;
					tailb--;
					win++;
				}
				else if (a[heada] > b[headb])
				{
					heada++;
					headb++;
					win++;
				}
				else
				{
					if (a[heada] < b[tailb])
					{
						win--;
					}
					heada++;
					tailb--;
				}
			}
			System.out.print(win * 200);
			System.out.print("\n");
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
}

