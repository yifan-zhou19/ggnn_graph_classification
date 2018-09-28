package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String s = new String(new char[100]);
	int[] num = new int[100];
	int[] quo = new int[100];
	int l;
	int i;
	int x;
	int r;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		l = s.length();
		for (i = 0;i < l;i++)
		{
			num[i] = s.charAt(i) - 48;
		}
		for (i = 0;i < 100;i++)
		{
			quo[i] = 0;
		}
		if (l > 2)
		{
		  if (num[0] * 10 + num[1] >= 13)
		  {
			quo[0] = (num[0] * 10 + num[1]) / 13;
			r = (num[0] * 10 + num[1]) % 13;
			for (i = 2;i < l;i++)
			{
			  quo[i - 1] = (r * 10 + num[i]) / 13;
			  r = (r * 10 + num[i]) % 13;
			}
			for (i = 0;i <= l - 2;i++)
			{
				System.out.printf("%d",quo[i]);
			}
			System.out.print("\n");
			System.out.printf("%d\n",r);
		  }
		  else
		  {
			quo[0] = (num[0] * 100 + num[1] * 10 + num[2]) / 13;
			r = (num[0] * 100 + num[1] * 10 + num[2]) % 13;
			for (i = 3;i < l;i++)
			{
			  quo[i - 2] = (r * 10 + num[i]) / 13;
			  r = (r * 10 + num[i]) % 13;
			}
			for (i = 0;i <= l - 3;i++)
			{
				System.out.printf("%d",quo[i]);
			}
			System.out.print("\n");
			System.out.printf("%d\n",r);
		  }
		}
		 if (l == 2)
		 {
		   quo[0] = (num[0] * 10 + num[1]) / 13;
		   r = (num[0] * 10 + num[1]) % 13;
		   System.out.printf("%d\n",quo[0]);
		   System.out.printf("%d\n",r);
		 }
		 if (l == 1)
		 {
		   quo[0] = num[0] / 13;
		   r = num[0] % 13;
		   System.out.printf("%d\n",quo[0]);
		   System.out.printf("%d\n",r);
		 }
		 System.in.read();
		 System.in.read();
	}
}

