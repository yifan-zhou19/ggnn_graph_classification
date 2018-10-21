package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int sum = 0;
		int i = 0;
		int flag = 0;
		int k = 0;
		int j = 0;
		float[] a = new float[301];
		float[] dis = new float[301];
		float max = 0F;
		float[] pai = new float[301];
		float temp = 0F;
		float ave = 0F;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			sum = sum + a[i];
		}
		ave = (float) sum / n;
		for (i = 0; i < n ;i++)
		{
			dis[i] = Math.abs(a[i] - ave);
			if (dis[i] > max)
			{
				max = dis[i];
			}
		}
		for (i = 0; i < n; i++)
		{
			if (Math.abs(dis[i] - max) < 1e-5)
			{
				pai[k++] = a[i];
			}
		}
		for (i = 0; i < k - 1 ; i++)
		{
			for (j = 0; j < k - i - 1; j++)
			{
				if (pai[j] > pai[j + 1])
				{
					temp = pai[j];
					pai[j] = pai[j + 1];
					pai[j + 1] = temp;
				}
			}
		}
		for (i = 0 ; i < k; i++)
		{
				if (flag == 0)
				{
				System.out.print(pai[i]);
				flag = 1;
				}
				else
				{
					System.out.print(",");
					System.out.print(pai[i]);
				}
		}
		return 0;
	}




}

