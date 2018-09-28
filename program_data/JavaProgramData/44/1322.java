package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int reverse = int num;
		int[] a = new int[6];
		int i;
		int c;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i < 6;i++)
		{
			c = reverse(a[i]);
			System.out.printf("%d",c);
			if (i < 5)
			{
				System.out.print("\n");
			}
		}
	}
	public static int reverse(int num)
	{
		int num1;
		int i;
		int n;
		int k;
		int num2 = 0;
		if (num < 0)
		{
			num1 = (-num);
		}
		else
		{
			num1 = num;
		}
		n = Math.log10(num1);
		for (i = n + 1;i > 0;i--)
		{
			k = num1 / Math.pow(10,i - 1);
			num2 = k * Math.pow(10,n - i + 1) + num2;
			num1 = num1 - k * Math.pow(10,i - 1);
		}
		if (num < 0)
		{
			return (-num2);
		}
		else
		{
			return (num2);
		}
	}
}

