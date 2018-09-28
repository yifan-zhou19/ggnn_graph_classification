package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int t;
		int[] num = new int[200];
		int i = 0;
		int j;
		int n;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				num[i] = Integer.parseInt(tempVar);
			}
			i++;
		} while (System.in.read() != '\n');
		n = i;

		for (j = 0;j < n;j++)
		{
			for (i = 0;i < n - j;i++)
			{
				if (num[i] < num[i + 1])
				{
					t = num[i];
					num[i] = num[i + 1];
					num[i + 1] = t;
				}
			}
		}
		t = num[0];
		for (i = 0;i < n;i++)
		{
			if (num[i] < t)
			{
				break;
			}
		}
		if (i == n)
		{
			System.out.println("No");
		}
		if (i < n)
		{
			System.out.printf("%d",num[i]);
		}
	}
}

