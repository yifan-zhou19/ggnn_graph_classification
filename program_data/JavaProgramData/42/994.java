package <missing>;

public class GlobalMembers
{
	/************************************
	2.cpp
	???Oct 19, 2011
	??(11-4) ????????
	?? 1100012886
	************************************/

	public static int Main()
	{
		int n; //i?????
		int[] a = new int[100001];
		int i;
		int pointer;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		pointer = 1;
		while (pointer <= n)
		{
			while (a[pointer] == k)
			{
				for (j = pointer; j <= n; j++)
				{
					a[j] = a[j + 1];
				}
				n--; //n????????????
			}
			pointer++;
		}
		for (i = 1; i < n; i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print(a[n]);
		System.out.print("\n");
		return 0;
	}
}

