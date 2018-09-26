package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void f(int s[],int n);
		int[] a = new int[100];
		int[][] b = new int[100][100];
		int n;
		int i = 1;
		int j;
		char c;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			i++;
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
		}while (c != '\n');
		n = i - 1;
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= a[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		f(b[1], a[1]);
		for (i = 2;i <= n;i++)
		{
			System.out.print(" ");
			f(b[i], a[i]);
		}
		return 0;
	}
	public static void f(int[] s, int n)
	{
		int i;
		int j;
		int t;
		for (i = 2;i <= n;i++)
		{
			for (j = i - 1;j >= 1;j--)
			{
				if (s[j + 1] < s[j])
				{
					t = s[j];
					s[j] = s[j + 1];
					s[j + 1] = t;
				}
			}
		}
		System.out.printf("%d",s[1]);
		for (i = 2;i <= n;i++)
		{
			System.out.printf(" %d",s[i]);
		}
	}

}

