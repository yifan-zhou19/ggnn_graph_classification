public class monkey
{
	public int num;
	public int nextmonk;
}

package <missing>;

public class GlobalMembers
{
	public static void countoff(int n,int m)
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		monkey[] monk = (monkey) malloc(LEN * n);
		int i;
		int j;
		int sum = n;
		int last;

		for (i = 1;i <= n;i++)
		{
			monk[i].num = i;
			monk[i].nextmonk = i + 1;
		}
		monk[n].nextmonk = 1;
		last = i = n;

		while (sum > 1)
		{
			j = 0;
			while (j != m)
			{
				i = monk[i].nextmonk;
				if (monk[i].num != 0)
				{
					j++;
					if (j != m)
					{
						last = monk[i].num;
					}
				}
			}
			monk[i].num = 0;
			sum--;
		}
		System.out.printf("%d\n",last);
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
			if (m == 0 && n == 0)
			{
				break;
			}
			countoff(n, m);
		}
	}

}

