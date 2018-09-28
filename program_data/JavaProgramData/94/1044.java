package <missing>;

public class GlobalMembers
{
	/*
		name : ??(14-3) ?????? 
		author : 1200012757(chenminhuan)
		Data : 11/04/2012 0:26
	*/


	public static int Main()
	{
		int N;
		int cnt = 0;
		int[] a = new int[500 + 10];
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = 0 ; i < N ;++i) //??n??
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[i] % 2 != 0) //mod 2?1?????
			{
				a[cnt++] = a[i];
			}
		}

		sort(a, a + cnt);

		for (int i = 0 ; i < cnt ; ++i)
		{
			if (i != 0)
			{
				System.out.print(",");
			}
			System.out.print(a[i]);
		}
		return 0;
	}
}

