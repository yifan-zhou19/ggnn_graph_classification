package <missing>;

public class GlobalMembers
{
	public static int reverse(int num) //????????????????
	{
		int[] a = new int[10];
		int k = 0;
		int i;
		int j;
		int result = 0;
		while (num != 0)
		{
			a[k] = num % 10; //????????
			num = num / 10;
			k++;
		}
		for (i = 0;i < k;i++)
		{
			for (j = 1;j <= k - i - 1;j++)
			{
				a[i] = 10 * a[i]; //10??
			}
		}
		for (i = 0;i < k;i++)
		{
			result = result + a[i]; //??10??????
		}
		return result;
	}
	public static int Main()
	{
		int i;
		int[] a = new int[6];
		for (i = 0;i < 6;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < 5;i++)
		{
		System.out.print(reverse(a[i]));
		System.out.print("\n");
		}
		System.out.print(reverse(a[5]));
		return 0;
	}
}

