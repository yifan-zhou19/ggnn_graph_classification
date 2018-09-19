package <missing>;

public class GlobalMembers
{
	/*
	  Name: ??(13-9) ????????
	  Author: 1200012757(chenminhuan)
	  Date: 30/10/12 09:21
	*/


	public static int n;
	public static int[] a = new int[maxn];
	public static int[] times = new int[200];
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; ++i)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int tot = 0; //tot??????????
		for (int i = 0; i < n; ++i)
		{
			if (times[a[i]] == 0) //times[a[i]]??a[i]??????????
			{ //??a[i]?????????????
				tot++;
				times[a[i]]++; //??a[i]?????
				if (tot > 1)
				{
					System.out.print(" ");
				}
				System.out.print(a[i]);
			}
		}
		return 0;
	}

}

