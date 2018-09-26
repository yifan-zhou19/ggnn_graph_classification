package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int[] c = new int[100];
		int[] d = new int[100];
		int i;
		int j;
		int n;
		int s;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		 n = a.length();
		for (i = 0;i < n;i++)
		{
			c[i] = a.charAt(i) - '0';
		}
		for (i = 0;i < n;i++)
		{
			 t = t * 10 + c[i];
		   d[i] = t / 13;
		   t = t % 13;
		}
		   if (n == 1 || (n == 2 && d[1] == 0))
		   {
		   System.out.print("0");
		   }
		   else
		   {
			if (d[1] == 0)
			{
		 for (i = 2;i < n;i++)
		 {
			System.out.printf("%d",d[i]);
		 }
			}
		  else
		  {
			for (i = 1;i < n;i++)
			{
			System.out.printf("%d",d[i]);
			}
		  }
		   }
			System.out.printf("\n%d\n",t);
		  System.in.read();
		  System.in.read();
	}
}

