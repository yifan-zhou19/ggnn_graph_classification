package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] a = new char[n][10];
		int[] b = new int[n];
		for (j = 0;j < n;j++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[j] = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b[j] = Integer.parseInt(tempVar3);
		}
		}
		for (i = 100;i >= 60;i--)
		{
							 for (j = 0;j < n;j++)
							 {
								 if (b[j] == i)
								 {
							 System.out.printf("%s\n",a[j]);
								 }
							 }
		}

		 for (j = 0;j < n;j++)
		 {
						 if (b[j] < 60)
						 {
						 System.out.printf("%s\n",a[j]);
						 }
		 }


		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();


	}
}

