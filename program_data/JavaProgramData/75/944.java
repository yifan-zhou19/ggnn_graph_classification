package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int a = 0;
		int w = 0;
		int c = 0;
		int[] s = new int[1001];
		int[] t = new int[1001];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s[c] = Integer.parseInt(tempVar);
		}
		while (System.in.read() == ',')
		{
			c++;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[c] = Integer.parseInt(tempVar2);
			}
		}
		m = c;
		c = 0;
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   t[c] = Integer.parseInt(tempVar3);
	   }
		while (System.in.read() == ',')
		{
			c++;
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				t[c] = Integer.parseInt(tempVar4);
			}
		}

		for (i = 0;i < 10001;i++)
		{
			for (j = 0;j <= m;j++)
			{

			 if (i >= s[j] != 0 && i < t[j])
			 {
				 w++;
			 }
			}
			if (w > a)
			{
				a = w;
			}
			w = 0;
		}
		c = (m + 1);
		System.out.printf("%d %d",c,a);
	}


}

