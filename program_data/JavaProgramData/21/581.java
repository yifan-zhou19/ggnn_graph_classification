package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int temp;
		int countmax = 0;
		int count = 0;
		int[] a = new int[305];
		float average = 0F;
		float sum = 0F;
		float max = 0F;
		float[] dis = new float[305];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum += a[i];
		}
		average = sum / n; //???????sum????average

		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (a[i] > a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		} //?????

		for (i = 0;i < n;i++)
		{
			dis[i] = Math.abs(a[i] - average);
			if (dis[i] > max)
			{
				max = dis[i];
			}
		} //???????????? ?????distance???

		for (i = 0;i < n;i++)
		{
			if (dis[i] == max)
			{
				countmax++;
			}
		} //?????????

		for (i = 0;i < n;i++)
		{
			if (dis[i] == max && count < countmax - 1)
			{
				System.out.print(a[i]);
				System.out.print(",");
				count++;
			} //??????????? ??????
			else if (dis[i] == max && count + 1 == countmax)
			{
				System.out.print(a[i]);
			}
		} //???????


	return 0;
	}
}

