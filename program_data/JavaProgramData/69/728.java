package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[252]);
		String b = new String(new char[252]);
		int[] l = new int[4];
		int[] max = new int[252];
		int[] min = new int[252];
		int i;
		int j;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		l[0] = a.length();
		l[1] = b.length();
		if (l[0] > l[1])
		{
			l[2] = l[0];
			l[3] = l[1];
			j = 0;
			for (i = l[0] - 1;i >= 0;i--)
			{
				max[j++] = a.charAt(i) - '0';
			}
			j = 0;
			for (i = l[1] - 1;i >= 0;i--)
			{
				min[j++] = b.charAt(i) - '0';
			}
		}
		else
		{
			l[3] = l[0];
			l[2] = l[1];
			j = 0;
			for (i = l[0] - 1;i >= 0;i--)
			{
				min[j++] = a.charAt(i) - '0';
			}
			j = 0;
			for (i = l[1] - 1;i >= 0;i--)
			{
				max[j++] = b.charAt(i) - '0';
			}
		}
		for (i = 0;i < l[3];i++)
		{
			if ((max[i] + min[i]) > 9)
			{
				max[i + 1]++;
				max[i] = max[i] + min[i] - 10;
			}
			else
			{
				max[i] = max[i] + min[i];
			}
		}
		for (i = l[3];i < l[2];i++)
		{
			if (max[i] > 9)
			{
				max[i] -= 10;
				max[i + 1]++;
			}
		}
		j = l[2];
		while (max[j] == 0)
		{
			j--;
		}
		if (j < 0)
		{
			System.out.print(0);
		}
		for (;j >= 0;j--)
		{
			System.out.print(max[j]);
		}
		return 0;
	}
}

