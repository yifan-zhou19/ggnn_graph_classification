package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] time = new int[1001];
		int[] xi = new int[1001];
		int[] yi = new int[1000];
		int i = 0;
		int n;
		int j;
		char ch = ',';


		while (ch != '\n')
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				xi[i] = Integer.parseInt(tempVar);
			}
			ch = System.in.read();
			i++;
		}
		i = 0;
		ch = ',';
		while (ch != '\n')
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				yi[i] = Integer.parseInt(tempVar2);
			}
			ch = System.in.read();
			i++;
		}
		n = i;

		for (i = 0;i < n;i++)
		{
			for (j = xi[i];j < yi[i];j++)
			{
				time[j]++;
			}
		}
		int max = 0;

		for (i = 0;i < 1001;i++)
		{
			if (time[i] >= max)
			{
				max = time[i];
			}
		}
		System.out.printf("%d %d\n",n,max);



		return 0;
	}

}

