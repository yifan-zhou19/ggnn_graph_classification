package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[200];
		int t;
		char[][] b = new char[200][11];
		String b1 = new String(new char[11]);

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
				 b[i] = tempVar2.charAt(0);
			 }
			 String tempVar3 = ConsoleInput.scanfRead(" ");
			 if (tempVar3 != null)
			 {
				 a[i] = Integer.parseInt(tempVar3);
			 }
		}

		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (a[j + 1] >= 60 && a[j] < a[j + 1])
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
					b1 = b[j];
								   b[j] = b[j + 1];
								   b[j + 1] = b1;
				}
			}
		}

		for (i = 0;i < n;i++)
		{
			 System.out.printf("%s\n",b[i]);
		}

	}


}

