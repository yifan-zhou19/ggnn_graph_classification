package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] ID = new char[100][10];
		int[] nl = new int[100];
		int i;
		String e = new String(new char[10]);
		for (i = 0;i < n;i++)
		{
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 ID[i] = tempVar2.charAt(0);
						 }
						 String tempVar3 = ConsoleInput.scanfRead(" ");
						 if (tempVar3 != null)
						 {
							 nl[i] = Integer.parseInt(tempVar3);
						 }
		}
						 int m;
		for (k = 1;k <= n;k++)
		{
						  for (i = 0;i < n - k;i++)
						  {
											 if ((nl[i] < 60 && nl[i + 1] >= 60) || (nl[i] >= 60 && nl[i + 1] >= 60 && nl[i + 1] > nl[i]))
											 {
						  m = nl[i + 1];
						  nl[i + 1] = nl[i];
						  nl[i] = m;
								 e = ID[i + 1];
								 ID[i + 1] = ID[i];
								 ID[i] = e;
											 }
						  }

		}
		for (i = 0;i < n;i++)
		{
						 System.out.printf("%s\n",ID[i]);
		}


						 return 0;
	}




}

