package <missing>;

public class GlobalMembers
{
	public static int judge(int x)
	{
		if (x % 7 == 0)
		{
			return 1;
		}
		int temp = 10;
		while (x > 0)
		{
		 if (x % temp == 7)
		 {
			 return 1;
		 }
		  x = x / temp;
		}
		 return 0;
	}

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[100];
		int len;
		len = 0;
		for (int i = 0;i <= n;i++)
		{
		 if (judge(i) == 0)
		 {
		  a[len++] = i;
		 }
		}
		int sum = 0;
		for (int j = 0;j < len;j++)
		{
		 sum = sum + a[j] * a[j];
		}
		System.out.print(sum);
		return 0;
	}
}

