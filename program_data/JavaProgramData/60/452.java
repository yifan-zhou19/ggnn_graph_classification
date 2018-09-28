package <missing>;

public class GlobalMembers
{
	public static int f(int a,int b)
	{
		int aa;
		int ac = 0;
		int bb;
		int bc = 0;
		int kk;
		 for (aa = 2;aa < a;aa++)
		 {
			 if (a % aa != 0)
			 {
				 ac = ac + 1;
			 }
		 }
		 for (bb = 2;bb < b;bb++)
		 {
			 if (b % bb != 0)
			 {
				 bc = bc + 1;
			 }
		 }
		 if (ac == a - 2 && bc == b - 2)
		 {
			 kk = 1;
		 }
		 else
		 {
			 kk = 0;
		 }
		 return kk;

	}
	public static void Main()
	{
		int n;
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n < 5)
		{
			System.out.print("empty");
		}
		else if (n >= 5)
		{
		for (i = 3;i < n;i++)
		{
		  k = f(i, i + 2);
		  if (k == 1)
		  {
			System.out.printf("%d %d\n",i,i + 2);
		  }
		}

		}
	}
}

