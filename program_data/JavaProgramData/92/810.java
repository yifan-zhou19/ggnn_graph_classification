package <missing>;

public class GlobalMembers
{
	public static int win;
	public static int loose;
	public static int Main()
	{
		void input(int * p1,int x);
		void f(int * p1,int * p2,int x);
		int n;
		int[] t = new int[num];
		int[] w = new int[num];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n != 0)
		{
		tangible.RefObject<Integer> tempRef_t = new tangible.RefObject<Integer>(t);
			input(tempRef_t, n);
			t = tempRef_t.argValue;
		tangible.RefObject<Integer> tempRef_w = new tangible.RefObject<Integer>(w);
			input(tempRef_w, n);
			w = tempRef_w.argValue;
			win = loose = 0;
		tangible.RefObject<Integer> tempRef_t2 = new tangible.RefObject<Integer>(t);
		tangible.RefObject<Integer> tempRef_w2 = new tangible.RefObject<Integer>(w);
			f(tempRef_t2, tempRef_w2, n);
			w = tempRef_w2.argValue;
			t = tempRef_t2.argValue;
			System.out.printf("%d\n",win * reward - loose * reward);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
		}
	}
	public static void f(tangible.RefObject<Integer> p1, tangible.RefObject<Integer> p2, int x)
	{
		int a1;
		int a2;
		int b1;
		int b2;
		a1 = p1.argValue;
		b1 = p2.argValue;
		if (x == 1)
		{
			if (a1 > b1)
			{
				win++;
			}
			else
			{
				if (a1 < b1)
				{
					loose++;
				}
			}
		}
		else
		{
			a2 = (p1.argValue + x - 1);
			b2 = (p2.argValue + x - 1);
			if (a2 < b2)
			{
				loose++;
				f(p1, p2.argValue+1, x - 1);
			}
			else
			{
				if (a2 > b2)
				{
					win++;
					f(p1, p2, x - 1);
				}
				else
				{
					if (a1 > b1)
					{
						win++;
						f(p1.argValue+1, p2.argValue+1, x - 1);
					}
					else
					{
						if (a1 < b1)
						{
							loose++;
							f(p1, p2.argValue+1, x - 1);
						}
						else
						{
							if (b1 > a2)
							{
								loose++;
							}
							f(p1, p2.argValue+1, x - 1);
						}
					}
				}
			}
		}

	}

	public static void input(tangible.RefObject<Integer> p1, int x)
	{
		int i;
		int j;
		int c;
		for (i = 0;i < x;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.argValue + i = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i < x - 1;i++)
		{
			for (j = i;j < x;j++)
			{
				if (*(p1.argValue + i) < *(p1.argValue + j))
				{
					c = (p1.argValue + i);
					*(p1.argValue + i) = *(p1.argValue + j);
					*(p1.argValue + j) = c;
				}
			}
		}
	}
}

