package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int x;
		int a;
		int b;
		int t;
		int m;
		int c;
		int[] s = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = Integer.parseInt(tempVar2);
			}
		}
		if (s[0] < s[1])
		{
		   a = s[1];
		   b = s[0];
		}
		 else
		 {
		   a = s[0];
		   b = s[1];
		 }
		 for (i = 2;i < n;i++)
		 {
			if (s[i] < b)
			{
				continue;
			}
			if (s[i] > b && s[i] < a)
			{
			   t = s[i];
			   s[i] = b;
			   b = t;
			}
			 else
			 {
				m = s[i];
				s[i] = a;
				a = m;
				c = s[i];
				s[i] = b;
				b = c;
			 }
		 }
		   System.out.printf("%d\n%d\n",a,b);
		   return 0;
	}

}

