package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //??????
		int i;
		int j;
		int l;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[20001]; //????
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i < n; i++) //??????i
		{
			for (j = i + 1; j < n; j++) //??????j
			{
				if (a[i] == a[j]) //??????
				{
						for (k = j; k < n - 1; k++)
						{
							a[k] = a[k + 1]; //????
						}
						n = n - 1;
						j = j - 1;
				}

			}
		}
			for (l = 0; l < n; l++)
			{
	System.out.print(a[l]);
			}
	return 0; //??????????????????
	} //????

}

