package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N; //??????N?i,j,p,sum
		int i;
		int j;
		int p;
		int sum = 0;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[N + 1]; //??????a[N+1]
		for (i = 1;i <= N;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[i] % 2 == 0) //?a[i]???
			{
				a[i] = 0; //?a[i]=0
				sum = sum + 1; //sum??1
			}
		}
		for (i = 1;i <= N;i++) //??????????????????
		{
			for (j = 1;j <= N - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					p = a[j];
					a[j] = a[j + 1];
					a[j + 1] = p;
				}
			}
		}
		for (j = sum + 1;j <= N;j++) //????sum+1????N??
		{
			if (j == sum + 1)
			{
				System.out.print(a[j]);
			}
			else
			{
				System.out.print(',');
				System.out.print(a[j]);
			}
		}
		return 0;
	}

}

