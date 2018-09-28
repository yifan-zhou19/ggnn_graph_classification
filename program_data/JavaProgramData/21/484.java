package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int k = 0;
		float[] num = new float[300];
		int n;
		float ave = 0F;
		float sum = 0F;
		float temp = 0F;
		int temp_num;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		i = 1;
		while (i <= n)
		{
			num[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			sum = sum + num[i];
			i++;
		}
		ave = sum / n;
		i = 1;
		float distance = 0F;
		while (i <= n)
		{
			if ((num[i] - ave) >= 0)
			{
				distance = num[i] - ave;
			}
			else
			{
				distance = ave - num[i];
			}
			if (temp < (distance))
			{
				temp = distance;
			}
			i++;
		}
		//cout<<temp;
		for (i = 1;i <= n - 1;i++)
		{
			for (j = 1;j <= n - i;j++)
			{
				if (num[j] > num[j + 1])
				{
					temp_num = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp_num;
				}
			}
		}
		i = 1;
		int record = 0;
		while (i <= n)
		{
			//cout<<num[i];
			//cout<<temp-(num[i]-ave)<<endl;
			if ((num[i] - ave) >= 0)
			{
				distance = num[i] - ave;
			}
			else
			{
				distance = ave - num[i];
			}
			if (temp - (distance) <= 0.000001F)
			{
				if (record == 0)
				{
					System.out.print(num[i]);
					record = record + 1;
				}
				else
				{
					System.out.print(",");
					System.out.print(num[i]);

				}
			}
			i = i + 1;
		}

	}
}

