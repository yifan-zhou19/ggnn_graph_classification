package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 0;
		int b;
		int v;
		int d;
		int n;
		int max;
		int nn;
		int mm = 0;
		int ii;
		int c;
		int e;
		int f;
		int i;
		int j;
		int[] t = new int[100];
		char cc;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			nn = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			cc = tempVar2.charAt(0);
		}
		for (ii = 1;ii <= nn;ii++)
		{
			int[] y = new int[1000];
	String x = new String(new char[1000]);
		x = new Scanner(System.in).nextLine();
		e = x.length();
			for (i = 0;i <= e-1;i++)
			{
				for (j = 0;j <= e-1;j++)
				{
					if (x.charAt(i) == x.charAt(j))
					{
						y[i]++;
					}
				}
				if (y[i] == 1)
				{
					System.out.printf("%c\n",x.charAt(i));
				break;
				}
			}
			if (i == e)
			{
				System.out.print("no\n");
			}

		}
	}
}

