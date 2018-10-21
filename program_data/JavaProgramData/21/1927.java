package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int all = 0;
		float ave;
		float cha = 0F;
		float[] a = new float[300];
		float sum = 0F;
		float[] chan = new float[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Float.parseFloat(tempVar2);
			}
			sum += a[i];
		}
		ave = sum / n;
		//printf("%f",ave);
		for (i = 0;i <= n - 1;i++)
		{
			chan[i] = Math.abs(ave - a[i]);
			//printf("%f",chan[i]);
			if (chan[i] > cha)
			{
				cha = chan[i];
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
		if (chan[i] == cha)
		{
			all++;
		}
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (chan[i] == cha && all != 1)
			{
			System.out.printf("%.0f,",a[i]);
			all--;
			}
		else if (chan[i] == cha && all == 1)
		{
			System.out.printf("%.0f",a[i]);
		}
		}
		System.in.read();
		System.in.read();
	}

}

