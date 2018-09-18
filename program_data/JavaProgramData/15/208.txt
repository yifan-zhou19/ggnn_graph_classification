package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int num;
		int a;
		int b;
		num = 0;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				int[] s = new int[1000];
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					s[j] = Integer.parseInt(tempVar2);
				}
			if (s[j] == 0)
			{
				num = num + 1;
			}
			}
		}
		a = (int)Math.sqrt(num) - 1;
		b = a * a;
		System.out.printf("%d\n",b);
	}
}

