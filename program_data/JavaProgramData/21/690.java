package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] m = new int[300];
		int i;
		int j;
		int b;
		int sum = 0;
		int temp;
		float ave;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			sum = sum + m[i];
		}
		ave = (float)sum / (float)n;
		for (i = 1;i < n - 1;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (m[j] > m[j + 1])
				{
					temp = m[j];
					m[j] = m[j + 1];
					m[j + 1] = temp;
				}
			}
		}
		if ((ave - (float)m[0]) > ((float)m[n - 1] - ave))
		{
			System.out.printf("%d",m[0]);
		}
		else if ((ave - (float)m[0]) < ((float)m[n - 1] - ave))
		{
			System.out.printf("%d",m[n - 1]);
		}
		else
		{
			System.out.printf("%d,%d",m[0],m[n - 1]);
		}
	}

}

