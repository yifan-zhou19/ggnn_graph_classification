package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int t;
		int k;
		int[] r = new int[100];
		int tag;
		int count = 0;
		int s = 0;
		int sub;
		int x;
		int min;
		int minin;
		int temp2;
		int y;
		float temp;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{

			tag = 1;
			temp = Math.sqrt(i);
			for (j = 2;j <= temp;j++)
			{
				if (i % j == 0)
				{
					tag = 0;
					break;
				}
			}
			if (tag == 1)
			{

				t = i;
				sub = 0;
				s = 0;
				while (t != 0)
				{
					t = t / 10;
					sub++;
				}
				y = i;
				for (k = 0;k < sub;k++)
				{
					x = y % 10;
					s = s * 10 + x;
					y = y / 10;

				}

				if (s == i)
				{
					r[count] = i;
					count++;
				}
			}
		}
		for (i = 0;i < count;i++)
		{
			min = r[i];
			minin = i;
			for (j = i;j < count;j++)
			{
				if (r[j] < min)
				{
					minin = j;
					min = r[minin];
				}
			}
			if (min != r[i])
			{
				temp2 = r[i];
				r[i] = r[minin];
				r[minin] = temp2;
			}
		}
		if (count == 0)
		{
			System.out.print("no\n");
		}
		else
		{
		for (i = 0;i < count - 1;i++)
		{
		  System.out.printf("%d,",r[i]);
		}
		System.out.printf("%d\n",r[i]);
		}
	}






}

