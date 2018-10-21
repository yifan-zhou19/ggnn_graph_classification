package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int[] b = new int[20];
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a = Integer.parseInt(tempVar2);
			  }
			  b[0] = 1;
			  b[1] = 1;
			  if (a == 1 || a == 2)
			  {
				  System.out.print("1\n");
			  }
			  else
			  {
				  for (j = 2;j < a;j++)
				  {
			  b[j] = b[j - 2] + b[j - 1];
				  }
			  System.out.printf("%d\n",b[a - 1]);
			  }
		}
		System.in.read();
		System.in.read();
	}
}

