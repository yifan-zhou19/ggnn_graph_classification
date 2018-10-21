package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int max;
		int i;
		int j;
		int k;
		final String a = "";
		final String b = "";
		int[] c = new int[500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		a = new Scanner(System.in).nextLine();
		m = a.length();
		for (i = 0;i <= (a.length() - n);i++)
		{
		 for (j = i,k = 0;j < i + n;j++,k++)
		 {
		  b.charAt(i)[k] = a.charAt(j);
		 }
		}
		for (i = 1;i <= (a.length() - n);i++)
		{
		  for (j = 0;j < i;j++)
		  {
		   if (strcmp(b.charAt(i),b.charAt(j)) == 0)
		   {
		   c[j]++;
		   }
		  }
		}
	max = 0;
	for (i = 0;i < 500;i++)
	{
	 if (c[i] > max)
	 {
	 max = c[i];
	 }
	}
	if (max == 0)
	{
			  System.out.print("NO\n");
	}
	else
	{
		System.out.printf("%d\n",max + 1);
	for (i = 0;i < 500;i++)
	{
	 if (c[i] == max)
	 {
				  System.out.printf("%s\n",b.charAt(i));
	 }
	}
	}

		return 0;
	}

}

