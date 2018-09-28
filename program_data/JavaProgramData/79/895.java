package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int m = 1;
	  int n;
	  int i;
	  int j;
	  int k;
	  int r = 0;
	  int T;
	  while (m != 0)
	  {
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 m = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead(" ");
		 if (tempVar2 != null)
		 {
			 n = Integer.parseInt(tempVar2);
		 }
		 if (m == 0)
		 {
			 break;
		 }
		 int[] monkey = new int[309];
		 for (i = 0;i < m;i++)
		 {
		   monkey[i] = 1;
		 }
		 T = 0;
		 for (i = 1;i < m;i++)
		 {
			 for (j = 1;j <= n;)
			 {
				 if (monkey[T] == 1)
				 {
					   j = j + 1;
				 }
				 T = (T + 1) % m;
			 }
			 monkey[(T - 1 + m) % m] = 0; //printf(" %d",T-1);
		 }
		 for (i = 0;i < m;i++)
		 {
			  if (monkey[i] != 0)
			  {
				 System.out.printf("%d\n",i + 1);
				 //break;
			  }

		 }
	  }
	}

}

