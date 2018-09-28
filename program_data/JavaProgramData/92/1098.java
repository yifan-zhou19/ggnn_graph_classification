package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] m = new int[1000];
		int i;
		int j;
		int k;
		int t;
		int x;
		int y;
		int c;
		int d;
		int n = 0;
		for (;;)
		{
			x = y = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				c = Integer.parseInt(tempVar);
			}
			if (c == 0)
			{
				break;
			}
			else
			{
				t = k = c - 1;
				for (i = 0;i < c;i++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						a[i] = Integer.parseInt(tempVar2);
					}
				}
				for (i = 0;i < c;i++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						b[i] = Integer.parseInt(tempVar3);
					}
				}
				for (j = 0;j < c;j++)
				{
					for (i = 0;i < c - j - 1;i++)
					{
						if (a[i] > a[i + 1])
						{
							d = a[i];
							a[i] = a[i + 1];
							a[i + 1] = d;
						}
					}
				}
				for (j = 0;j < c;j++)
				{
					for (i = 0;i < c - j - 1;i++)
					{
						if (b[i] > b[i + 1])
						{
							d = b[i];
							b[i] = b[i + 1];
							b[i + 1] = d;
						}
					}
				}
				i = 0;
				j = 0;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			loop:
			while (i != (k + 1) && (a[i] != b[j] || a[k] != b[t]))
			{
					 while (a[i] != b[j] && i != (k + 1))
					 {
						 if (a[i] < b[j])
						 {
							 y++,i++,t--;
						 }
						 else if (a[i] > b[j])
						 {
							 x++,i++,j++;
						 }
						 else
						 {
							 ;
						 }
					 }
					 while (a[k] != b[t] && i != (k + 1))
					 {
						 if (a[k] < b[t])
						 {
							 y++,i++,t--;
						 }
						 else if (a[k] > b[t])
						 {
							 x++,k--,t--;
						 }
						 else
						 {
							 ;
						 }
					 }
			}
				if (i != (k + 1))
				{
					 if (a[i] < b[t])
					 {
						 y++,i++,t--;
					 }
					 else if (a[i] = b[t])
					 {
						 i++,t--;
					 }
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					 goto loop;
				}
				if (i == (k + 1))
				{
					m[n] = 200 * (x - y);
					n++;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
		System.out.printf("%d\n",m[i]);
		}
	}
}

