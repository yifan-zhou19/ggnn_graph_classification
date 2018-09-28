package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int a = 0;
	   int[] b = new int[20];
	   int[] c = new int[20];
		int l;
		int i;
		int j;
		int k;
		int e;
		for (e = 0;;e++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				b[e] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c[e] = Integer.parseInt(tempVar2);
			}
		System.out.print("\n");
		a++;
			if (b[e] == 0 || c[e] == 0)
			{
			break;
			}
		}
	  for (j = 0;j <= a;j++)
	  {


	  if ((0 < b[j] && b[j] <= 300) && (0 < c[j] && c[j] <= 300))
	  {
		 k = 0;
		for (i = 2;i <= b[j];i++)
		{
			k = ((c[j] % i) + k) % i;
		}
		 System.out.printf("%d\n",k + 1);
	  }
	  }


						  System.in.read();
						   System.in.read();
	}

}

