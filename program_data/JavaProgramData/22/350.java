package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[301];
		char ch;
		int tempnum = 0;
		int i;
		int p = 0;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				ch = tempVar.charAt(0);
			}
			if (ch == '\n')
			{
				num[p] = tempnum;
				p++;
				break;
			}
			else if (ch == ',')
			{
				num[p] = tempnum;
				tempnum = 0;
				p++;
			}
			else
			{
			tempnum = tempnum * 10 + ch - '0';
			}
		}
		int max = 0;
		for (i = 0; i < p; i++)
		{
			if (num[i] > max)
			{
				max = num[i];
			}
		}
		for (i = 0; i < p; i++)
		{
			if (num[i] == max)
			{
				num[i] = 0;
			}
		}
		max = 0;
		for (i = 0; i < p; i++)
		{
			if (num[i] > max)
			{
				max = num[i];
			}
		}
		if (max == 0)
		{
			System.out.print("No\n");
		}
		else
		{
			System.out.printf("%d",max);
		}
		System.in.read();
		System.in.read();
		return 0;
	}

}

