package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] b = new int[100];
		int i;
		int r;
		int j = 0;
		int k = 0;
		int[] o = new int[100];
		int[] y = new int[100];
		int l = 1;
		int m;
		char[][] a = new char[100][10];
		char[][] old = new char[100][10];
		char[][] young = new char[100][10];
		String str = new String(new char[10]);
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
				a[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
						if (b[i] >= 60)
						{
									old[j] = a[i];
									o[j] = b[i];
									j++;
						}
						else
						{
									young[k] = a[i];
									y[k] = b[i];
									k++;
						}
		}
		for (i = j - 1;i > 0;i--)
		{
						  for (r = 0;r < i;r++)
						  {
										  if (o[r] < o[r + 1])
										  {
														 m = o[r + 1];
														 str = old[r + 1];
														 o[r + 1] = o[r];
														 old[r + 1] = old[r];
														 o[r] = m;
														 old[r] = str;
										  }
						  }
		}
		for (i = 0;i < j;i++)
		{
		System.out.printf("%s\n",old[i]);
		}
		for (i = 0;i < n - j;i++)
		{
		System.out.printf("%s\n",young[i]);
		}
		System.in.read();
		System.in.read();
	}



}

