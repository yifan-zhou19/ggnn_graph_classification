package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int[] a = new int[10];
		int i;
		int j;
		int output = 0;
		for (i = 0;i < 10;i++)
		{
			a[i] = (int)(num / Math.pow(10,i)) % 10;
		}
		for (i = 9,j = 0;i >= 0;i--)
		{
			if (a[i] == 0)
			{
				j++;
			}
			else
			{
				break;
			}
		}

		for (i = 0;i < 10;i++)
		{
			output += a[i] * Math.pow(10,(9 - j - i));
		}
		return output;
	}

	public static void Main()
	{
		int n;
		int t;
		for (t = 0;t < 6;t++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			System.out.printf("%d\n",reverse(n));
		}
	}

}

