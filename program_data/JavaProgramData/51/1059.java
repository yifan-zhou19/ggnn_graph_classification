package <missing>;

public class GlobalMembers
{
	public static int maximum(int a,int b)
	{
		if (a > b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	public static int Main()
	{
		int i;
		int j;
		int n;
		int k;
		int len;
		int[] sta = new int[500];
		int x = 0;
		int max = 0;
		int num;
		String input = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			input = tempVar2.charAt(0);
		}
		len = input.length();
		for (i = 0;i < len;i++)
		{
			for (k = 0;k < i;k++)
			{
				x = 0;
				for (j = 0;j < n;j++)
				{
					if (input.charAt(i + j) == input.charAt(k + j))
					{
						x++;
					}
					else
					{
						break;
					}
				}
				if (x == n)
				{
					sta[k]++;
					max = maximum(max, sta[k]);
					break;
				}
			}
		}
		if (max == 0)
		{
			System.out.print("NO");
		}
		else
		{
		System.out.printf("%d\n",max + 1);
		for (i = 0;i < 500;i++)
		{
			if (sta[i] == max)
			{
				for (j = 0;j < n;j++)
				{
					System.out.printf("%c",input.charAt(i + j));
				}
				System.out.print("\n");
			}
		}
		}

	}
}

