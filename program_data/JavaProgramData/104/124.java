package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int[] x = new int[11];
		int[] y = new int[11];
		int i;
		int j;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		t = 0;
		x[0] = a;
		for (i = 1;i < 11;i++)
		{

				  x[i] = a / 2;
				 a = a / 2;
		}
		y[0] = b;
		for (i = 1;i < 11;i++)
		{
			y[i] = b / 2;
			b = b / 2;
		}
		for (i = 0;i < 10;i++)
		{
			 for (j = 0;j < 10;j++)
			 {
				  if (x[i] == y[j] && x[i] != 0 && y[j] != 0)
				  {
					  System.out.printf("%d",x[i]);
					  t = 1;
					  break;
				  }
			 }
			 if (t == 1)
			 {
			 break;
			 }
		}
	}




}

