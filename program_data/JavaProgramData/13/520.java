package <missing>;

public class GlobalMembers
{
	/*
	 * 1000012712_26.cpp
	 * Author: ???
	 * Created on: 2010-11-4
	 * ?????????????
	 */
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[20001]; //????
		int i;
		for (i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int j = 1; //??????
		for (i = 2;i <= n;i++)
		{ //??????????
			for (j = 1;j < i;j++)
			{
				if (a[i] == a[j])
				{
					int u = i;
					if (a[i] == a[i + 1])
					{
						j--;
					}
					while (i < n)
					{
						a[i] = a[i + 1]; //???????????
						i++;
					}
					i = u;
					n--;
					i--;
				}
			}
		}
		for (i = 1;i < n;i++) //????????
		{
				System.out.print(a[i]);
				System.out.print(" ");
		}
			System.out.print(a[n]);
			System.out.print("\n");
		return 0;
	}

}

