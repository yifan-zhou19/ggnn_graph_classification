package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] string = new char[100][100];
		int[] age = new int[100];
		int[] age1 = new int[100];
		int[] a = new int[100];
		int max;
		int n;
		int l;
		int i;
		int j;
		int k;
		int x;
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
			string[i] = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			age[i] = Integer.parseInt(tempVar3);
		}
		}
		   j = 0;
		   for (i = 0;i < n;i++)
		   {
							if (age[i] >= 60)
							{
										  age1[j] = age[i];
										  age[i] = 0;
										  a[j] = i;
										  j++;
							}
		   }
										  for (i = 0;i < j;i++)
										  {
														  max = 0;
														  x = 0;
														  for (k = 0;k < j;k++)
														  {
																		  if (max < age1[k])
																		  {
																						 max = age1[k];
																						 x = k;
																		  }
														  }
																						 System.out.printf("%s\n",string[a[x]]);
																						 age1[x] = 0;
										  }
										for (i = 0;i < n;i++)
										{
										  if (age[i] != 0)
										  {
										  System.out.printf("%s\n",string[i]);
										  }
										}







		 System.in.read();
		 System.in.read();
	}

}

