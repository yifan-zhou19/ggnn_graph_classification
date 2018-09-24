package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int len;
		int i;
		int t;
		int r;
		int[] cout = new int[500];
		int max;
		int j;
		String a = new String(new char[500]);
		char[][] b = new char[300][5];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		a = new Scanner(System.in).nextLine();
		len = a.length();
		t = 0;
		for (i = 0;i < len;i++)
		{
			for (j = 0;j < n;j++)
			{
				b[t][j] = a.charAt(i);
				i++;
			}
			b[t][j] = 0;
			i = i - n;
			t++;
		}
		r = 0;
		for (i = 0;i < len;i++)
		{
			for (j = i;j < t;j++)
			{
				if (strcmp(b[i],b[j]) == 0)
				{
					cout[r]++;
				}
			}
			r++;
		}
		max = cout[0];
		for (i = 0;i < len;i++)
		{
			if (max < cout[i])
			{
				max = cout[i];
			}
		}
		if (max == 1)
		{
			System.out.print("NO");
			return 0;
		}
		System.out.printf("%d\n",max);
		for (i = 0;i < len;i++)
		{
			if (max == cout[i])
			{
				System.out.printf("%s\n",b[i]);
			}
		}
		return 0;
	}



}

