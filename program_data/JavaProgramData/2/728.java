package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int l;
		int j;
		int t;
		int[][] k = new int[30][99];
		int[] a = new int[30];
		int o;
		int q;
		int max = 0;
		int maxman;
		for (i = 0;i < 30;i++)
		{
			a[i] = 0;
		}
		String s = new String(new char[40]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0; j < n; j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				o = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				s = tempVar3.charAt(0);
			}
			l = s.length();
			for (i = 0; i < l; i++)
			{
				q = s.charAt(i) - 'A';
				a[q]++;
				t = a[q];
				k[q][t] = o;
			}
		}
		for (i = 'A'-'A';i <= 'Z'-'A';i++)
		{
			if (a[i] > max)
			{
	//		printf("%d,%d\n",a[i],i);
				max = a[i];
			maxman = i;
			}
		}
		System.out.printf("%c\n%d\n",maxman + 'A',max);
		for (i = 1;i <= max;i++)
		{

		System.out.printf("%d\n",k[maxman][i]);
		}


		return 0;
	}

}

