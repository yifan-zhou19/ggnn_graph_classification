package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int sum = 0;
		int count = 0;
		int temp;
		int m = 0;
		int[] s = new int[301];
		int[] res = new int[301];
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
				s[i] = Integer.parseInt(tempVar2);
			}
			sum += s[i];
		}
		for (i = 0;i < n;i++)
		{
			m = Math.max(m,Math.abs(s[i] * n - sum));
		}
		for (i = 0;i < n;i++)
		{
			if (Math.abs(s[i] * n - sum) == m)
			{
				res[count++] = i;
			}
		}
		for (i = 0;i < count;i++)
		{
			for (j = 0;j < count - 1;j++)
			{
				if (s[res[j]] > s[res[j + 1]])
				{
					temp = res[j];
					res[j] = res[j + 1];
					res[j + 1] = temp;
				}
			}
		}
		for (i = 0;i < count;i++)
		{
			System.out.printf("%d",s[res[i]]);
			if (i < count - 1)
			{
				System.out.print(",");
			}
		}
		System.out.print(10);
	}
}

