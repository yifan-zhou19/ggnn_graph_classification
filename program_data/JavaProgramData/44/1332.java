package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int s;
		int j;
		int k;
		k = num;
		int newnum = 0;
		int[] a = new int[100];
		for (s = 1;s < 100;s++)
		{
			a[s] = k - k / 10 * 10;
			k = k / 10;
			if (k == 0)
			{
				break;
			}
		}
		for (j = 0;j < s;j++)
		{
			newnum = newnum * 10;
			newnum = newnum + a[j + 1];
		}
			return newnum;
	}
	public static int Main()
	{

		int[] n = new int[6];
		int[] newn = new int[6];
		for (int i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n[i] = Integer.parseInt(tempVar);
			}
		}
		for (int i = 0;i < 6;i++)
		{
			newn[i] = reverse(n[i]);
			System.out.printf("%d\n",newn[i]);
		}
		return 0;
	}


}

