package <missing>;

public class GlobalMembers
{
	public static int[] t = new int[1000];
	public static int[] q = new int[1000];
	public static int MyCompare(Object e1, Object e2)
	{
		return *(int)e2 - (int)e1;
	}
	public static int Main()
	{
		int n;
		int i;
		int tFirst;
		int tLast;
		int qFirst;
		int qLast;
		int ans;
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (n == 0)
			{
				break;
			}
			for (i = 0;i < n;i++)
			{
				t[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0;i < n;i++)
			{
				q[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			qsort(t,n,(Integer.SIZE / Byte.SIZE),MyCompare);
			qsort(q,n,(Integer.SIZE / Byte.SIZE),MyCompare);
			tFirst = qFirst = 0;
			tLast = qLast = n - 1;
			ans = 0;
			while (tFirst <= tLast)
			{
				if (t[tLast] > q[qLast])
				{
					tLast--;
					qLast--;
					ans += 200;
				}
				else if (t[tLast] < q[qLast])
				{
					tLast--;
					qFirst++;
					ans -= 200;
				}
				else
				{
					if (t[tFirst] > q[qFirst])
					{
						tFirst++;
						qFirst++;
						ans += 200;
					}
					else if (t[tFirst] < q[qFirst])
					{
						tLast--;
						qFirst++;
						ans -= 200;
					}
					else
					{
						if (t[tLast] > q[qFirst])
						{
							tLast--;
							qFirst++;
							ans += 200;
						}
						else if (t[tLast] < q[qFirst])
						{
							tLast--;
							qFirst++;
							ans -= 200;
						}
						else
						{
							tLast--;
							qFirst++;
						}
					}
				}
			}
			System.out.print(ans);
			System.out.print("\n");
		}
		return 0;
	}
}

