package <missing>;

public class GlobalMembers
{
	//****************************************************** 
	//* ? ? ?   ?? ? ? ? ? ?                     *
	//* ? ?      ?? ? ?                              *
	//* ? ? ? ??2010 ? 12 ? 8 ?                    * 
	//* ? ?      ?1000010185                            *
	//****************************************************** 
	public static int Main()
	{
		int[] a = new int[10000]; // ??a[i]??i?????????b[i]??i??????
		int[] b = new int[10000];
		int x;
		int y;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while ((x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (x == y)
			{
				break;
			}
			a[x] = 1; // x?????
			b[y]++; // y???????1
		}
		int i;
		for (i = 0; i < n; i++)
		{
			if (a[i] == 0 && b[i] == n - 1) // ?i????????n-1???
			{
				System.out.print(i);
				break;
			}
		}
		if (i == n)
		{
			System.out.print("NOT FOUND");
		}
		return 0;
	}
}

