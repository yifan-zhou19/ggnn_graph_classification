package <missing>;

public class GlobalMembers
{
	public static void sort(tangible.RefObject<Integer> a, int n)
	{
		int i;
		int j;
		int temp;
		for (j = 1;j <= n - 1;j++)
		{
			for (i = 0;i < n - j;i++)
			{
				if (*(a.argValue + i) < *(a.argValue + i + 1))
				{
					temp = (a.argValue + i + 1);
					*(a.argValue + i + 1) = *(a.argValue + i);
					*(a.argValue + i) = temp;
				}
			}
		}
	}

	public static void Main()
	{
		int n;
		int i;
		int win = 0;
		int lose = 0;
		int btj;
		int bqw;
		int etj;
		int eqw;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * tj;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * qw;
		while (true)
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
			else
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				tj = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				qw = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
				for (i = 0;i < n;i++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						tj + i = Integer.parseInt(tempVar2);
					}
				}
				for (i = 0;i < n;i++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						qw + i = Integer.parseInt(tempVar3);
					}
				}
			tangible.RefObject<Integer> tempRef_tj = new tangible.RefObject<Integer>(tj);
				sort(tempRef_tj, n);
				tj = tempRef_tj.argValue;
			tangible.RefObject<Integer> tempRef_qw = new tangible.RefObject<Integer>(qw);
				sort(tempRef_qw, n);
				qw = tempRef_qw.argValue;
				btj = bqw = 0;
				etj = eqw = n - 1;
				while (btj <= etj)
				{
					if (*(tj + btj) > *(qw + bqw))
					{
						win = win + 1;
						btj++;
						bqw++;
						continue;
					}
					if (*(tj + etj) > *(qw + eqw))
					{
						win = win + 1;
						etj--;
						eqw--;
						continue;
					}
					if (*(tj + btj) <= *(qw + bqw))
					{
						if (*(tj + etj) < *(qw + bqw))
						{
							lose = lose+1;
						}
						bqw++;
						etj--;
						continue;
					}
				}
				System.out.printf("%d\n",win * 200 - lose * 200);
				win = lose = 0;
			}
		}
	}
}

