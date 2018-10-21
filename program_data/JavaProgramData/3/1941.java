package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //k2???????n?????????
		int k;
		int i;
		int j;
		int k2 = 0;
		int[] a = new int[1000]; //a?1000?????n???????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		i = 0;
		j = 0;
		while (k2 != k && i < n) //????????a????????while?????????k2?=k?????
		{
			j = i + 1;
			while (k2 != k && j < n)
			{
				k2 = a[i] + a[j];
				j++;
			}
			i++;
		}
		if (k2 == k)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}
}

