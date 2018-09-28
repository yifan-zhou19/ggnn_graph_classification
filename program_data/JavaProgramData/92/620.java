package <missing>;

public class GlobalMembers
{
	public static void order(int[] s, tangible.RefObject<Integer> p)
	{
	 int j = 0;
	 int r = 0;
	 for (j = p.argValue-1;j >= 1;j--)
	 {
		 for (r = 0;r <= j - 1;r++)
		 {
						 if (s[r] < s[r + 1])
						 {
										int temp = 0;
										temp = s[r + 1];
										s[r + 1] = s[r];
										s[r] = temp;
						 }
		 }
	 }
	}
	public static int Main()
	{
		int[] a = new int[1000];
	   int[] b = new int[1000];
	   int n = 1;
	   int i = 0;
	   int win = 0;
	   int lose = 0;
	   int tie = 0;
	   int money = 0;
	   int t1 = 0;
	   int t2 = 0;
	   int q1 = 0;
	   int q2 = 0;

	   for (;;)
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
	   for (i = 0;i <= n - 1;i++)
	   {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   a[i] = Integer.parseInt(tempVar2);
	   }
	   }
	   }
	   for (i = 0;i <= n - 1;i++)
	   {
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   b[i] = Integer.parseInt(tempVar3);
	   }
	   }
   tangible.RefObject<Integer> tempRef_n = new tangible.RefObject<Integer>(n);
	   order(a, tempRef_n);
	   n = tempRef_n.argValue;
   tangible.RefObject<Integer> tempRef_n2 = new tangible.RefObject<Integer>(n);
	   order(b, tempRef_n2);
	   n = tempRef_n2.argValue;


	   t1 = 0;
	   t2 = n - 1;
	   q1 = 0;
	   q2 = n - 1;
		win = 0;
		lose = 0;
		money = 0;
		tie = 0;


		for (;(t1 != t2) && (q1 != q2);)
		{
			if (a[t1] > b[q1])
			{
				win++;
				t1++;
				q1++;
				continue;
			}
			else if (a[t2] > b[q2])
			{
					win++;
					t2--;
					q2--;
					continue;
			}
			else if (a[t2] == b[q1])
			{
				tie++;
				t2--;
				q1++;
			}
			else if (a[t2] < b[q1])
			{
				lose++;
				t2--;
				q1++;
			}
		}
		if (a[t1] == b[q1])
		{
			tie++;
		}
		else if (a[t1] > b[q1])
		{
			win++;
		}
		else
		{
			lose++;
		}


		money = 200 * win - 200 * lose;

			System.out.printf("%d\n",money);

	   }


	}

}

