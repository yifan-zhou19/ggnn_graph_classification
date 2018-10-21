package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int t = 0;
		int[] a = new int[300];
		int sum = 0;
		int[] mem = new int[300];
		float[] dis = new float[300];
		float temp = 0F;
		float ave;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum += a[i];
		} // ????????????

		ave = (float)sum / n; // ?????????

		for (i = 0; i < n; i++)
		{
			dis[i] = Math.abs(a[i] - ave); // ????????????????????
		}
		for (i = 0; i < n; i++)
		{
			if (dis[i] > temp)
			{
				temp = dis[i];
			}
		}
		for (i = 0; i < n; i++)
		{
			if (dis[i] == temp)
			{
				mem[t] = i;
				t++;
			}
		}
		for (i = 0; i < t; i++)
		{
			if (i < t - 1)
			{
				System.out.print(a[mem[i]]);
				System.out.print(",");
			}
			else
			{
				System.out.print(a[mem[i]]);
			}
		}
		return 0;
	}
}

