package <missing>;

public class GlobalMembers
{
	public static int max(int[] num, int n)
	{
		int result;
		int i;
		result = num[0];
		for (i = 1;i < n;i++)
		{
			if (num[i] > result)
			{
				result = num[i];
			}
		}
		return (result);
	}
	public static void Main()
	{
		int n;
		int[] num = new int[300];
		int i;
		int m1;
		int m2;
		char c;
		for (i = 0;i < 300;i++)
		{
			num[i] = -1;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num[0] = Integer.parseInt(tempVar);
		}
		n = 1;
		for (i = 1;i < 300 && (c = System.in.read()) != '\n';i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num[i] = Integer.parseInt(tempVar2);
			}
			n++;
		}
		m1 = max(num, n);
		for (i = 0;i < n;i++)
		{
			if (num[i] == m1)
			{
				num[i] = -1;
			}
		}
		m2 = max(num, n);
		if (m2 != -1)
		{
			System.out.printf("%d\n",m2);
		}
		else
		{
			System.out.print("No\n");
		}
	}

}

