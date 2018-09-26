package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int m;
		int i;
		int p;
		int s;
		int[] x = new int[300];
		while (true)
		{
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 m = Integer.parseInt(tempVar2);
		 }
		 if (n == 0)
		 {
			 break;
		 }
		 if (m == 1)
		 {
			 System.out.printf("%d\n",n);
		 }
		 for (i = 0;i < n;i++)
		 {
		  x[i] = 1;
		 }
		 s = 0;
		 p = n;
		 while (p > 1)
		 {

			for (i = 0;i < n;i++)
			{
			 s = s + x[i];
			 if (s == m)
			 {
			  s = 0;
			  x[i] = 0;

			 }

			}
			p = 0;
			for (i = 0;i < n;i++)
			{
			p = p + x[i];


			}


		 }




			 for (i = 0;i < n;i++)
			 {
			if (x[i] == 1)
			{
				i++;
				System.out.printf("%d\n",i);
			}


			 }




		}

	}

}

