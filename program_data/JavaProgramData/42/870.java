package <missing>;

public class GlobalMembers
{
	//????????   ???  12858
	public static int Main()
	{
		int[] a = new int[100001]; //?????????
		int n = 0; //k???????n?????
		int i = 0;
		int j = 0;
		int k = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			if (a[i] == k) //????????????
			{
				for (j = i; j <= n - 1; j++)
				{
					a[j] = a[j + 1];
				}
				n = n - 1; //???-1
				i = i - 1; //??????????i?????????
			}
		}
		for (i = 1; i <= n; i++) //????
		{
			if (i == n)
			{
				System.out.print(a[i]);
			}
			else
			{
				System.out.print(a[i]);
				System.out.print(' ');
			}
		}
		return 0;
	}


}

