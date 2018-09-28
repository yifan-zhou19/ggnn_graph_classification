package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str1 = new String(new char[5000]);
		String str2 = new String(new char[5000]);
		int[] x = new int[1001];
		int[] y = new int[1001];
		int i;
		int j;
		int k = 0;
		int min = 1000;
		int max = 0;
		int high = 0;
		int count = 0;
		int num;
		for (i = 0;i <= 1000;i++)
		{
			x[i] = 0;
			y[i] = 0;
		}
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		for (i = 0;i < str1.length();)
		{
			if (str1.charAt(i) >= '0' && str1.charAt(i) <= '9')
			{
				for (j = i;str1.charAt(j) >= '0' && str1.charAt(j) <= '9';j++)
				{
					x[k] = x[k] * 10 + str1.charAt(j) - '0';
				}
				if (x[k] < min)
				{
					min = x[k];
				}
				k++;
				count++;
				i = j;
			}
			else
			{
				i++;
			}
		}
		k = 0;
		for (i = 0;i < str2.length();i++)
		{
			if (str2.charAt(i) >= '0' && str2.charAt(i) <= '9')
			{
				for (j = i;str2.charAt(j) >= '0' && str2.charAt(j) <= '9';j++)
				{
					y[k] = y[k] * 10 + str2.charAt(j) - '0';
				}
				if (y[k] > max)
				{
					max = y[k];
				}
				k++;
				i = j;
			}
			else
			{
				i++;
			}
		}
		for (i = min;i <= max;i++)
		{
			num = 0;
			for (j = 0;j < count;j++)
			{
				if (x[j] <= i != 0 && y[j]> i)
				{
					num++;
				}
			}
			if (num > high)
			{
				high = num;
			}
		}
		System.out.printf("%d %d\n",count,high);
	}



}
