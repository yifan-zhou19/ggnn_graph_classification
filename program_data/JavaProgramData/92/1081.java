package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int ma = int n;
		int n;
		for (;1;)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n == 0)
			{
				break;
			}
			ma(n);
		}
		return 0;
	}
	public static int ma(int n)
	{
		int paixu = new int(int tian[],int wang[],int n);
		int sum = 0;
		int i;
		int a = 1;
		int[] wang = new int[1001];
		int[] tian = new int[1001];
		int endw;
		int endt;
		int staw = 0;
		int stat = 0;
		endw = n - 1;
		endt = n - 1;
		for (i = 0;i < n;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				tian[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				wang[i] = Integer.parseInt(tempVar2);
			}
		}
		paixu(tian, wang, n);
		for (;stat <= endt;)
		{
			if (tian[stat] > wang[staw])
			{
				sum += 200;
				staw++;
				stat++;
			}
			else if (tian[stat] < wang[staw])
			{
				sum -= 200;
				endt--;
				staw++;
			}
			else if (tian[stat] == wang[staw])
			{
				for (;(a == 1);)
				{
					if (tian[endt] > wang[endw])
					{
						sum += 200;
						endt--;
						endw--;
					}
					else if (tian[endt] <= wang[endw])
					{
						if (tian[endt] < wang[staw])
						{
							sum -= 200;
						}
						staw++;
						endt--;
						a = 0;
					}
				}
				a = 1;
			}
		}
		System.out.printf("%d\n",sum);
		return 0;
	}
	public static int paixu(int[] tian, int[] wang, int n)
	{
		int i;
		int j;
		int b;
		for (i = 0;i < n;i++)
		{
			for (j = n - 1;j > i;j--)
			{
				if (tian[j] > tian[j - 1])
				{
					b = tian[j];
					tian[j] = tian[j - 1];
					tian[j - 1] = b;
				}
				if (wang[j] > wang[j - 1])
				{
					b = wang[j];
					wang[j] = wang[j - 1];
					wang[j - 1] = b;
				}
			}
		}
		return 0;
	}
}

