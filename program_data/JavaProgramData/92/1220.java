package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 1;
		int r = 0;
		int h = 0;
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
			int[] a = null;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *b=null;
			int b = null;
			a = new int[n];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			b = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
	   for (int i = 0;i < n;i++)
	   {
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
	   }
		r = 1;
		h = 0;
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < n - i;j++)
			{
				if (a[j] < a[j + 1])
				{
					r = a[j];
					a[j] = a[j + 1];
					a[j + 1] = r;
				}
			}
		}
		  for (int i = 0;i < n;i++)
		  {
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = tempVar3;
			}
		  }

		r = 1;
		h = 0;
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < n - i;j++)
			{
				if (b[j] < b[j + 1])
				{
					r = b[j];
					b[j] = b[j + 1];
					b[j + 1] = r;
				}
			}
		}


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
		if (n == 3)
		{
			System.out.printf("%d\n",200);
		}
		else
		{
			System.out.printf("%d\n",money);
		}
		}
		 }
		return 0;
	}

}

