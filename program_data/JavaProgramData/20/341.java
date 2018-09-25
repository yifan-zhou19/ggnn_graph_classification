package <missing>;

public class GlobalMembers
{
	public static void Main()
	{

		String ch1 = new String(new char[11]);
		String a1 = new String(new char[4]);
		char[][] A = new char[10][14];
		char max;
		int i;
		int j;
		int n;
		int k;
		for (k = 0;k < 10;k++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			ch1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a1 = tempVar2.charAt(0);
		}

		n = ch1.length();
		max = ch1.charAt(0);
		for (i = 0;i < n;i++)
		{
			if (ch1.charAt(i) > max)
			{
				j = i;
				max = ch1.charAt(i);
			}
		}
			for (i = 0;i <= j;i++)
			{
				A[k][i] = ch1.charAt(i);
			}
			for (i = j + 4;i < n + 3;i++)
			{
				A[k][i] = ch1.charAt(i - 3);
			}

			A[k][j + 1] = a1.charAt(0);
			A[k][j + 2] = a1.charAt(1);
			A[k][j + 3] = a1.charAt(2);
			A[k][n + 3] = '\0';
			if (strcmp(A[k],A[k - 1]) == 0)
			{
				break;
			}
			else
			{

			System.out.printf("%s\n",A[k]);
			}

		}

	}
}

