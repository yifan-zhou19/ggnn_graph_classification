package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String s = "";
		String[] s1 = {""};
		int n;
		int[] x = new int[500];
		int i;
		int j;
		int length;
		int max;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		s = new Scanner(System.in).nextLine();
		length = s.length();
		for (i = 0;i <= length - n;i++)
		{
			for (j = 0;j < n;j++)
			{
				s1[i][j] = s.charAt(i + j);
			}
		}
		for (i = 0;i <= length - n;i++)
		{
			for (j = i + 1;j <= length - n;j++)
			{
				if (strcmp(s1[i],s1[j]) == 0)
				{
					x[i] = x[i] + 1;
				}
			}
		}
		max = x[0];
		for (i = 0;i <= length - n;i++)
		{
			if (x[i] > max)
			{
				max = x[i];
			}
		}
		if (max == 0)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",max + 1);
		for (i = 0;i <= length - n;i++)
		{
			if (x[i] == max)
			{
				System.out.printf("%s\n",s1[i]);
			}
		}
		}
		return 0;
	}
}

