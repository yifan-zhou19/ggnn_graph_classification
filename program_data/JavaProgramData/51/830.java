package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int l;
		int i;
		int j;
		int n;
		int max = 0;
		String s = new String(new char[501]);
		char[][] x = new char[501][5];
		int[] num = new int[501];

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

		l = s.length();
		for (i = 0;i <= l - n;i++)
		{
			for (j = 0;j < n;j++)
			{
				*(*(x + i) + j) = *(s.Substring(i) + j);

			}
			*(*(x + i) + j) = '\0';
		}

		for (i = 0;i <= l - n;i++)
		{
			for (j = 0;j <= l - n;j++)
			{
				if (strcmp(*(x + i),*(x + j)) == 0)
				{
					(num[i])++;
				}
			}
		}

		for (i = 0;i <= l - n;i++)
		{
			if (max < num[i])
			{
				max = (num + i);
			}
		}


		if (max <= 1)
		{
			System.out.print("NO\n");
		}
		else
		{
		for (i = 0;i <= l - n;i++)
		{

				for (j = 0;j < i;j++)
				{
					 if (strcmp(*(x + i),*(x + j)) == 0)
					 {
						 num[i] = 0;
					 }
				}
		}
		System.out.printf("%d\n",max);
		for (i = 0;i <= l - n;i++)
		{
			  if (num[i] == max)
			  {
				 System.out.printf("%s\n",*(x + i));
			  }

		}
		}
		return 0;
	}
}

