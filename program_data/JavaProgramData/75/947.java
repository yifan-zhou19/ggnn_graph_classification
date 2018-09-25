package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] come = new int[10000];
		int[] go = new int[10000];
		int i = 0;
		int j = 0;
		int[] num = new int[1100];
		char s;
		while (true)
		{
			s = System.in.read();
			if (s == ',')
			{
				come[i] = j;
				i++;
				j = 0;
			}
			else if (s == '\n')
			{
				come[i] = j;
				i++;
				j = 0;
				break;
			}
			else
			{
				j = j * 10 + s - '0';
			}
		}
		i = 0,j = 0;
		while (true)
		{
			s = System.in.read();
			if (s == ',')
			{
				go[i] = j;
				i++;
				j = 0;
			}
			else if (s == '\n')
			{
				go[i] = j;
				i++;
				j = 0;
				break;
			}
			else
			{
				j = j * 10 + s - '0';
			}
		}
		int n = i;
		System.out.printf("%d ",n);
		for (i = 0;i <= 1000;i++)
		{
			for (j = 0;j < n;j++)
			{
			if (i >= come[j] != 0 && i < go[j])
			{
			num[i]++;
			}
			}
		}
		int max = 0;
		for (i = 0;i <= 1000;i++)
		{
			if (num[i] > max)
			{
				max = num[i];
			}
		}
		System.out.printf("%d\n",max);
		System.in.read();
		System.in.read();
	}

}
