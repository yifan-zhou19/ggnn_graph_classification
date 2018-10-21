package <missing>;

public class GlobalMembers
{
	public static int[] tian = new int[1000];
	public static int[] wang = new int[1000];
	public static int[] temp = new int[1000];

	public static int cmp(Object a, Object b)
	{
		return *(int)a - (int)b;
	}

	public static int Main()
	{
		int n;
		while (true)
		{
			int i;
			int num = 0;
			int t_first;
			int q_first;
			int t_last;
			int q_last;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n == 0)
			{
				break;
			}

			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					tian[i] = Integer.parseInt(tempVar2);
				}
			}
			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					wang[i] = Integer.parseInt(tempVar3);
				}
			}

			qsort(tian,n,(Integer.SIZE / Byte.SIZE),cmp);
			qsort(wang,n,(Integer.SIZE / Byte.SIZE),cmp);

			t_first = q_first = 0;
			t_last = q_last = n - 1;
			while (t_last >= t_first)
			{
				if (tian[t_first] > wang[q_first])
				{
					num++;
					t_first++;
					q_first++;
				}
				else if (tian[t_first] < wang[q_first])
				{
					num--;
					t_first++;
					q_last--;
				}
				else
				{
					if (tian[t_last] > wang[q_last])
					{
						num++;
						t_last--;
						q_last--;
					}
					else if (tian[t_last] < wang[q_last])
					{
						num--;
						t_first++;
						q_last--;
					}
					else
					{
						if (tian[t_first] < wang[q_last])
						{
							num--;
						}
						t_first++;
						q_last--;
					}
				}
			}

			System.out.printf("%d\n",num * 200);
		}
		return 0;
	}
}

