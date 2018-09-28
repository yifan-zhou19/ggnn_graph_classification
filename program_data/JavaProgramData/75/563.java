package <missing>;

public class GlobalMembers
{
	/*****************
	*file:5.cpp
	*author:?? 
	*time:2013-10-30
	*description:?????????? 
	*******************/
	public static int Main()
	{
		int n = 0;
		int i = 1;
		int j = 1;
		int max = -1000;
		int x;
		int[] a = new int[1000]; //?? c????????????
		int[] b = new int[1000];
		int[] c = new int[1000];
		a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (scanf(",%d", x) > 0)
		{
			a[i] = x;
			n++;
			i++;
		} //????a
		b[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (scanf(",%d", x) > 0)
		{
			b[j] = x;
			j++;
		} //????b
		for (int k = 0; k < i; k++)
		{
			for (int p = a[k]; p < b[k]; p++)
			{
				c[p]++;
			}
		} //???????????????
		for (int k = 1; k < 1000; k++)
		{
			if (max < c[k])
			{
				max = c[k];
			}
		} //???????????
		if (n == 0) //??????????????????1
		{
			System.out.print("1 1");
		}
		else //????1???
		{
			System.out.print(n + 1);
			System.out.print(' ');
			System.out.print(max);
		}
		return 0;
	}
}

