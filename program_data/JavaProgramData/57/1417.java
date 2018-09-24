package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void abc(char a[][32],int m);
		int i;
		int n;
		char[][] stu = new char[50][32];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			stu[i] = tempVar2.charAt(0);
		}
		}
		abc(stu, n);
	}
	public static void abc(String[] a, int m)
	{
		int i;
		int sum;
		int j;
		int k;
		int t;
		for (i = 0;i < m;i++)
		{
		 sum = a[i].length();
		if ((a[i][sum - 1].equals('r')) && (a[i][sum - 2].equals('e')))
		{
			for (j = 0;j < sum - 2;j++)
			{
			System.out.printf("%c",a[i][j]);
			}

		}
		else if ((a[i][sum - 1].equals('y')) && (a[i][sum - 2].equals('l')))
		{
			for (t = 0;t < sum - 2;t++)
			{
			System.out.printf("%c",a[i][t]);
			}

		}
		else if (((a[i][sum - 1].equals('g')) && (a[i][sum - 2].equals('n'))) && (a[i][sum - 3].equals('i')))
		{
			for (k = 0;k < sum - 3;k++)
			{
			System.out.printf("%c",a[i][k]);
			}

		}
		 System.out.print("\n");
		}
	}


}

