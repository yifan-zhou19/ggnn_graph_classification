package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[101]; //???????i????
		int i = 0;
		int n = 0;
		int k = 0;
		int[] res = new int[101]; //???
		int s = 0; //????
		int t = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a[i] = i; //????n??
			if (a[i] % 7 != 0 && a[i] % 10 != 7 && a[i] / 10 != 7)
			{
				k++; //??????
			 res[t] = i;
			 t++;
			}
		}
		for (i = 0;i < k;i++)
		{
		   s = s + a[res[i]] * a[res[i]];
		}
		System.out.print(s);
		System.out.print("\n");
		System.in.read();
		return 0;
	}

}

