package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[600]);
		int len;
		int i;
		int j;
		int n;
		int k;
		int max;
		int[] idx = new int[1000];
		int[] count = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		len = s.length();
		k = 0;
		for (i = 0; i <= len - n; i++)
		{
			for (j = 0; j < k; j++)
			{
				if (strncmp(s.Substring(i), s + idx[j], n) == 0)
				{
					count[j]++;
					break;
				}
			}
			if (j == k)
			{
				idx[k] = i;
				count[k] = 1;
				k++;
				count[k] = 0;
			}
		}
		max = -1;
		for (i = 0; i < k; i++)
		{
			if (count[i] > max)
			{
				max = count[i];
			}
		}
		if (max <= 1)
		{
			System.out.print("NO\n");
			return 0;
		}
		System.out.printf("%d\n", max);
		for (i = 0; i < k; i++)
		{
			if (count[i] == max)
			{
				for (j = idx[i]; j < idx[i] + n; j++)
				{
					System.out.printf("%c", s.charAt(j));
				}
				System.out.print("\n");
				//printf("%s\n", s.substr(idx[i], n));
			}
		}
		return 0;
	}

}

