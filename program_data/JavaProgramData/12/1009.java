package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] x = new int[16];
		int a;
		int b;
		int i;
		int k;

		while (true)
		{


		for (i = 0;i < 16;i++)
		{
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 x[i] = Integer.parseInt(tempVar);
		 }
		  if (x[i] == 0)
		  {
		   a = i;
		   break;

		  }

		}
		if (x[0] == -1)
		{

		 break;

		}
		int s = 0;
		for (k = 0;k < a;k++)
		{
		  for (i = 0;i < a;i++)
		  {
		  if (x[k] == 2 * x[i])
		  {
		  s++;
		  }

		  }

		}
		System.out.printf("%d\n",s);
		}

	}

}

