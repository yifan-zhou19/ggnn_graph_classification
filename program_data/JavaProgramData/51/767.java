package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[500];
		int n;
		int l;
		int i;
		int j;
		int max = 0;
		String s = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s = new Scanner(System.in).nextLine();
		char[][] b =
		{
			{0, '\0', '\0', '\0', '\0'}
		};
		l = s.length();
		for (i = 0;i <= l - n;i++)
		{
			for (j = 0;j < n;j++)
			{
			b[i][j] = s.charAt(i + j);
			}
		}
		for (i = 0;i <= l - n;i++)
		{
			for (j = i + 1;j <= l - n;j++)
			{
				if (strcmp(b[i],b[j]) == 0)
				{
					a[i]++;
				}
			}
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		if (max == 0)
		{
			System.out.print("NO");
		}
		else
		{
			 System.out.printf("%d\n",max + 1);
			 for (i = 0;i <= l - n;i++)
			 {
			 if (a[i] == max)
			 {
				 System.out.printf("%s\n",b[i]);
			 }
			 }
		}
	}
}

