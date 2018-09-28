package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int a;
		k = 1;
		char[][] X = new char[50][100];
		for (i = 0;i < 50;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				X[i] = tempVar.charAt(0);
			}
		a = System.in.read();
		if (a == '\n')
		{
			break;
		}
		if (a == ' ')
		{
			k++;
		}
		}

		int[] Y = new int[50];
		for (i = 0;i < k;i++)
		{
			Y[i] = String.valueOf(X[i]).length();
		}
		int e;
		String ee = new String(new char[50]);

	for (i = 0;i < k;i++)
	{
			for (j = 0;j < k - 1 - i;j++)
			{
				if (Y[j] < Y[j + 1])
				{
					e = Y[j];
					ee = X[j];
					Y[j] = Y[j + 1];
					X[j] = X[j + 1];
					Y[j + 1] = e;
					X[j + 1] = ee;
				}
			}
	}
	System.out.printf("%s\n",X[0]);
	for (i = 0;i < k;i++)
	{
			for (j = 0;j < k - 1 - i;j++)
			{
				if (Y[j] > Y[j + 1])
				{
					e = Y[j];
					ee = X[j];
					Y[j] = Y[j + 1];
					X[j] = X[j + 1];
					Y[j + 1] = e;
					X[j + 1] = ee;
				}
			}
	}
		System.out.printf("%s\n",X[0]);
		return 0;
	}
}

