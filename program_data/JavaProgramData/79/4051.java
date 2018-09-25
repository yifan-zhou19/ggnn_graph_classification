package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int m;
		int n;
		int k;
		int i;
		int turn;
		int baoshu;
		int ing;
		int p;
		int begin;
		int end;

		int[] monkey = new int[300];
		int[] king = new int[2];
		while (true)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		if (n != 0)
		{
			for (i = 0;i < n;i++)
			{
		monkey[i] = i + 1;
			} //????????monkey[300]???
			if (m == 1)
			{
			System.out.printf("%d\n",n);
			}
			else
			{
			for (i = 0,k = 0;i < n;i++)
			{
				if ((i + 1) % m != 0)
				{
			monkey[k] = i + 1;
			k++;
				}
			}
			king[0] = 0;
			king[1] = k; //?????????k?

			for (turn = 2,begin = n + 1,ing = 0;ing != 1;turn++)
			{ //??????
				if (turn == 2)
				{
					end = begin + king[1];
				} //????????n+1??????n+k?
				else
				{
				begin = end;
				end = begin + ing;
				}
			for (baoshu = begin,ing = 0;baoshu < end;baoshu++)
			{
				if (baoshu % m != 0)
				{
					p = baoshu - begin;
			monkey[ing] = monkey[p];
			ing++;
				}
			}
			} //ing?????????????
			System.out.printf("%d\n",monkey[0]);
			}
		}

		else
		{
			break;
		}
		}
	}

}

