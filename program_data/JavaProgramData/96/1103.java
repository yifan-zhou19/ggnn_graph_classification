package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int m;
	 int n;
	 int i;
	 int j = 0;
	 int x = 0;
	 int y;
	 int[] b = new int[101];
	 int[] d = new int[101];
	 String a = new String(new char[101]);
	 String c = new String(new char[101]);
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a = tempVar.charAt(0);
	 }
	 n = a.length();

	   for (i = 0;i < n;i++)
	   {
		  b[i] = a.charAt(i) - '0';
	   }

		for (i = 0,j = 0;i < n - 1;i++)
		{
		  while (b[i] < 13 && i < n - 2)
		  {
			d[i] = 0;
			b[i + 1] = 10 * b[i] + b[i + 1];
			i++;
		  }
			d[i] = b[i] / 13;
			b[i + 1] = b[i] % 13 * 10 + b[i + 1];
		}

		d[n - 1] = b[n - 1] / 13;
		y = b[n - 1] % 13;

	   for (i = 0;i <= n - 1;i++)
	   {
		x += d[i];
	   }

		if (x == 0)
		{
		System.out.printf("%d",x);
		}
		else
		{
		 for (i = 0,j = 0;i <= n - 1;i++,j++)
		 {
			if (d[i] != 0)
			{
			break;
			}
		 }
		 for (m = j;m <= n - 1; m++)
		 {
		 System.out.printf("%d",d[m]);
		 }
		}

	  System.out.print("\n");
	  System.out.printf("%d",y);

	}

}

