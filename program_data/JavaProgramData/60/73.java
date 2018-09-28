package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int l;
		int u;
		int j = 0;
		int m;
		int[] a = new int[10000];
		int[] b = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n < 5)
		{
			System.out.print("empty\n");
		}
		else
		{
			for (i = 0;i < n;i++)
			{
			a[i] = i + 1;
			}
		for (i = 0;i < n;i++)
		{

			if (a[i] == 1)
			{
				continue;
			}
			if (a[i] == 2)
			{
				b[j] = a[i];
				j++;
			}
			if (a[i] == 3)
			{
				b[j] = a[i];
				j++;
			}
			else
			{
				m = Math.sqrt(a[i]);
			 for (l = 2;l <= m;l++)
			 {
				 if (a[i] % l == 0)
				 {
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					 goto loop;
				 }
			 }
			 b[j] = a[i];
			 j++;
			}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	continue;
		}
		u = j;
		for (j = 0;j < u - 1;j++)
		{
			if (b[j + 1] - b[j] == 2)
			{
			System.out.printf("%d %d\n",b[j],b[j + 1]);
			}
		}
		}

	}
}

