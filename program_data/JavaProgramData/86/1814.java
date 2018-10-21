package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int m;
		int[] a = new int[21];
		a[0] = 0; //????????0?
		int i;
		int times;
		while (n-- != 0)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 1;i <= m;i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			a[m + 1] = 70; //?????????????????
			for (i = 0;i <= m + 1;i++)
			{
				if (a[i] + i * 3 >= 60) //??????i???
				{
					break; //??a[m+1]=70???????break
				}
			} //?i-1?????????
			i--;
			times = 60 - i * 3;
			if (times <= a[i + 1])
			{
				;
			}
			else
			{
				times = a[i + 1];
			}
			System.out.print(times);
			System.out.print("\n");
		}
		return 0;
	}
}

