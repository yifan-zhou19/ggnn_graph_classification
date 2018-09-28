package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m = 0;
		int j = 0;
		int i = 0;
		int[] a = new int[50];
		int max;
		int min;
		int maxi;
		int mini;
		char[][] s = new char[50][20];
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				s[i] = tempVar.charAt(0);
			}
		if (System.in.read() != ' ')
		{
			break;
		}
		i = i + 1;
		}

		for (j = 0;j <= i;j++)
		{
			a[j] = String.valueOf(s[j]).length();
		}

		m = i;
		max = min = a[0];
		maxi = 0;
		mini = 0;
		for (i = 0;i <= m;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
				maxi = i;
			}
			if (a[i] < min)
			{
				min = a[i];
				mini = i;
			}
		}
		System.out.printf("%s\n",s[maxi]);
			System.out.printf("%s",s[mini]);

	}
}

