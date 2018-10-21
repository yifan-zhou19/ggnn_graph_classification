package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int l;
		int i;
		int m = 0;
		int n = 0;
		int[] a = new int[100];
		int[] b = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			l = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= l - 1;i++)
		{
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 a[i] = Integer.parseInt(tempVar2);
			 }
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 b[i] = Integer.parseInt(tempVar3);
			 }
			 if (a[i] != b[i])
			 {
				  if (a[i] == 1 && b[i] == 0)
				  {
						n++;
				  }
				  else if (a[i] == 0 && b[i] == 1)
				  {
						m++;
				  }
				  else if (a[i] == 2 && b[i] == 1)
				  {
						n++;
				  }
				  else if (a[i] == 1 && b[i] == 2)
				  {
						m++;
				  }
				  else if (a[i] == 0 && b[i] == 2)
				  {
						n++;
				  }
				  else if (a[i] == 2 && b[i] == 0)
				  {
						m++;
				  }
			 }
		}
		if (m > n)
		{
		   System.out.print("A");
		}
		else if (m < n)
		{
		   System.out.print("B");
		}
		else
		{
		   System.out.print("Tie");
		}
		return 0;
	}
}

