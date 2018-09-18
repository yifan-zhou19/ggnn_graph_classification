package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] A = new int[100];
		int[] C = new int[26];
		int n;
		int i;
		int j;
		int m;
		int a = 0;
		int b;
		char[][] B = new char[100][100];
		char c;
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
				A[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				B[i] = tempVar3.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < String.valueOf(B[i]).length();j++)
			{
				m = B[i][j];
				C[m - 65]++;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (a < C[i])
			{
				a = C[i];
				b = i;
			}
		}
		System.out.printf("%c\n",b + 65);
		System.out.printf("%d\n",a);
		c = b + 65;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < String.valueOf(B[i]).length();j++)
			{
				if (B[i][j] == c)
				{
					System.out.printf("%d\n",A[i]);
				}
			}
		}


		return 0;
	}

}

