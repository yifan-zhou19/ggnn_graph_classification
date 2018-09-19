package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] b = new int[999];
		int max = 0;
		int[] a = new int[27];
		int x;
		char w;
		char[][] c = new char[999][26];
		String d = new String(new char[27]);
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
							 b[i] = Integer.parseInt(tempVar2);
						 }
						 String tempVar3 = ConsoleInput.scanfRead(" ");
						 if (tempVar3 != null)
						 {
							 c[i] = tempVar3.charAt(0);
						 }
		}
		for (i = 0;i < 27;i++)
		{
			a[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
						 for (j = 0;j < 26;j++)
						 {
										  for (k = 65;k < 91;k++)
										  {
															 if (c[i][j] == k)
															 {
															 a[k - 64]++;
															 }
										  }
						 }
		}
		for (i = 1;i < 27;i++)
		{
						  if (a[i] > max)
						  {
							  max = a[i];
						  x = i;
						  }
		}
		w = x + 64;
		System.out.printf("%c\n",w);
		System.out.printf("%d\n",max);
		for (i = 0;i < n;i++)
		{
						 for (j = 0;j < 26;j++)
						 {
										   if (c[i][j] == x + 64)
										   {
											   System.out.printf("%d\n",b[i]);
										   break;
										   }
						 }
		}
		return 0;
	}

}

