package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] N = new int[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
	int k = 0;
	for (;scanf(",%d",N + k + 1);)
	{
		k++;
	}
	if (k == 0)
	{
		System.out.print("No");
	}
	else
	{
	int Fir = 0;
	for (int i = 0;i <= k;i++)
	{
	if (Fir < N[i])
	{
		Fir = N[i];
	}
	}
	int Sec = 0;
	for (int i = 0;i <= k;i++)
	{
	if (Sec <= N[i] != 0 && N[i] != Fir)
	{
		Sec = N[i];
	}
	}
	if (Sec == 0)
	{
		System.out.print("No");
	}
	else
	{
		System.out.printf("%d",Sec);
	}
	}
	}
}

