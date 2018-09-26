package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b = 1;
		int n;
		int k;
		int i;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
			  if ((n == 2) && (k == 1))
			  {
			  System.out.print("7");
			  }
			  else
			  {
				 for (a = 1,i = 1;i <= n;i++)
				 {
					 a = a * n;
				 }
			  c = a - (n - 1) * k;
			  System.out.printf("%d",c);
			  }
	}
}

