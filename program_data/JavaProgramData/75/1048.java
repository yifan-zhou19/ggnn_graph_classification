package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] A = new int[2000];
		int[] B = new int[2000];
		int[] C = new int[2000];
		int i;
		int j;
		int k;
		int number;
		int max = 0;
		char c = 'e';
		for (i = 0;i < 2000;i++)
		{
			C[i] = 0;
		}
		for (i = 0;c != '\n';i++) //??????????????
		{
			A[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			cin.get(c); //????
		}
		c = 'e';
		for (i = 0;c != '\n';i++)
		{
			B[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			cin.get(c);
		}
		for (j = 0;j <= i;j++)
		{
		   for (k = A[j];k < B[j];k++)
		   {
			   C[k]++;
		   }
		}
		for (j = 0;j < 2000;j++)
		{
			if (C[j] > max)
			{
				max = C[j];
			}
		}
		System.out.print(i);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}


}

