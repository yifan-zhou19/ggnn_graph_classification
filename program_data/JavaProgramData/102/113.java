package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int boys;
		int girls;
		String tmp = new String(new char[10]);
		float[] boy = new float[45];
		float[] girl = new float[45];
		float shengao;
		float temp;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 1,j = 1,k = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				tmp = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				shengao = Float.parseFloat(tempVar3);
			}
			if (tmp.charAt(0) == 'f')
			{
				girl[j] = shengao;
				j++;
			}
			else if (tmp.charAt(0) == 'm')
			{
				boy[k] = shengao;
				k++;
			}
		}
		boys = k - 1;
		girls = j - 1;
		for (j = 1;j <= boys - 1;j++)
		{
			for (i = 1;i <= boys - j;i++)
			{
				if (boy[i] > boy[i + 1])
				{
					temp = boy[i];
					boy[i] = boy[i + 1];
					boy[i + 1] = temp;
				}
			}
		}
		for (j = 1;j <= girls - 1;j++)
		{
			for (i = 1;i <= girls - j;i++)
			{
				if (girl[i] < girl[i + 1])
				{
					temp = girl[i];
					girl[i] = girl[i + 1];
					girl[i + 1] = temp;
				}
			}
		}
		for (i = 1;i <= boys;i++)
		{
			System.out.printf("%.2f ",boy[i]);
		}
		for (i = 1;i <= girls;i++)
		{
			if (i == girls)
			{
				System.out.printf("%.2f\n",girl[i]);
			}
			else
			{
				System.out.printf("%.2f ",girl[i]);
			}
		}
		return 0;
	}
}

