package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		String a = new String(new char[500]);
		char[][] b = new char[500][6];
		a = new Scanner(System.in).nextLine();
		int c = 0;
		int d = 0;
		int e = 0;
		int f;
		f = a.length();
		while (e < (f - n + 1))
		{
			while (c < n)
			{
				b[d][c] = a.charAt(e);
				e++;
				c++;
			}
			b[d][c] = 0;
			e = e - (n - 1);
			c = 0;
			d = d + 1;
		}



		int[] maxi = new int[500];
		int g;
		int h;
		int max;
		int[] count = new int[500];
		for (g = 0;g < d;g++) //???????
		{
			for (h = g + 1;h < d;h++)
			{
				if (strcmp(b[g],b[h]) == 0)
				{
					count[g] = count[g] + 1;
				}
			}
		}

		max = count[0];
		int i = 0;
		for (i = 0;i < d;i++) //???????
		{
			if (max < count[i])
			{
				max = count[i];
			}
		}
		if (max == 0)
		{
			System.out.print("NO");
		}
		else
		{
		System.out.printf("%d\n",max + 1);
		int j;
		for (j = 0;j < d;j++)
		{
			if (count[j] == max)
			{
				System.out.println(b[j]);
			}
		}
		}


		return 0;
	}
}

