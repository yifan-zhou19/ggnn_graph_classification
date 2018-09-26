package <missing>;

public class GlobalMembers
{
	//*********************************
	//****?????? 1200012772     *
	//****???2012?11?2 ?        *
	//****???????????      *
	//*********************************

	public static int Main()
	{
		int n = 0; //n?????????(1<=n<=100000)
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[100001]; //????
		int i = 0; //??i?????
		for (i = 0; i < n; i++) //????????
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int k; //k?????????
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		i = 0;
		int count = 0; //count??????k???,j?????
		int j = 0;
		while (i < n)
		{
			if (a[i] == k) //????????k????
			{
				for (j = i; j < n; j++)
				{
					a[j] = a[j + 1];
				}
				count = count + 1; //??k???????
			}
			else
			{
				i++;
			}
		}

		for (i = 0; i < (n - count - 1); i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print(a[n - count - 1]);
		System.out.print("\n");

		return 0;
	}









}

