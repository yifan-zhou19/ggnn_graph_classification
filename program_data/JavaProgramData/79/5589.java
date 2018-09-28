package <missing>;

public class GlobalMembers
{
	public static void shu(int a,int b)
	{
		int[] monkey = new int[300];
		int i;
		int j;
		int count;
		for (i = 0;i < a;i++)
		{
			monkey[i] = 1;
		}
		i = -1;
		for (j = 1;j < a;j++)
		{
			count = 0;
			do
			{
				i = (i + 1) % a;
				count = count + monkey[i];
			}while (count < b);
			monkey[i] = 0;
		}
		for (j = 0;j < a;j++)
		{
			if (monkey[j] != 0)
			{
				System.out.printf("%d\n",j + 1);
				break;
			}
		}
	}
	public static void Main()
	{
		int n;
		int m;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (n > 0)
			{
				shu(n, m);
			}
			else
			{
				break;
			}
		}
	}



}

