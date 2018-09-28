package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[301]);
		int i;
		int j;
		int n = 0;
		int z = 0;
		int num;
		int temp;
		int[] sum = new int[100];
		int[] sum1 = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
			{
				num = 0;
				while (s.charAt(i) >= '0' && s.charAt(i) <= '9')
				{
				num = num * 10 + s.charAt(i) - 48;
				i++;
				}
				sum[n] = num;
				n++;
			}
		}
		if (n == 0 || n == 1)
		{
			System.out.print("No");
		}
		else
		{
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (sum[j] > sum[j + 1])
				{
					temp = sum[j];
					sum[j] = sum[j + 1];
					sum[j + 1] = temp;
				}
			}
		}
				for (i = n - 2;i >= 0;i--)
				{
					if (sum[i] != sum[n - 1])
					{
					sum1[z++] = sum[i];
					}
				}
				if (z > 0)
				{
				System.out.printf("%d\n",sum1[0]);
				}
				else
				{
					System.out.print("No");
				}
		}
	}
}

