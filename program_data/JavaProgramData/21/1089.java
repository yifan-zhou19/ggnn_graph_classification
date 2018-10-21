package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[400];
		int[] result = new int[400];
		double average = 0;
		double maximum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			average += a[i];
		}
		average = average / n; //????????
		for (i = 1;i <= n;i++)
		{
			if (Math.abs(a[i] - average) > maximum)
			{
				maximum = Math.abs(a[i] - average);
				result[0] = 1; //result[0]??result?????????
				result[1] = a[i];
			} //?????????????result
			else
			{
				if (Math.abs(a[i] - average) == maximum) //???????????
				{
					result[0]++; //result[0]??
					result[result[0]] = a[i]; //a[i]??result??
				}
			}
		}
		int temp;
		for (i = 1;i < result[0];i++)
		{
			for (j = 1;j <= result[0] - i;j++)
			{
				if (result[j] > result[j + 1])
				{
					temp = result[j];
					result[j] = result[j + 1];
					result[j + 1] = temp;
				} //?result??????
			}
		}
		System.out.print(result[1]);
		for (i = 2;i <= result[0];i++)
		{
			System.out.print(',');
			System.out.print(result[i]);
		}
		return 0;
	}
}

