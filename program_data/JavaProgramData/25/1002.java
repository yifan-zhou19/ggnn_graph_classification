package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0; //????,???????1,??????
		int i = 0;
		int x = 0;
		int y = 0;
		int[] a = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int j = 0;
		int jin = 0;
		int s = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (x = 0;x < 100;x++)
			{
				if (j == 1) //????????????
				{
					jin = 1;
				}
				else
				{
					jin = 0;
				}
				if (a[x] < 5) //???,????
				{
					a[x] = a[x] * 2;
					j = 0;
				}
				else //??,????,j=1
				{
					a[x] = a[x] * 2 - 10;
					j = 1;
				}
				if (jin == 1)
				{
					a[x] = a[x] + 1;
				}
			}
		}
		for (i = 99;i >= 0;i--) //???????????????,?????
		{
			if (a[i] != 0)
			{
				s = i;
				break;
			}
		}
		for (;s >= 0;s--) //????
		{
			System.out.print(a[s]);
		}
		return 0;
	}
}

