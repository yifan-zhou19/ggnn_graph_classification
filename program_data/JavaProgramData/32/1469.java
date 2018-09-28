package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[110];
		int i;
		int j;
		int n;
		int l1;
		int l2;
		int e;
		int[] b = new int[110];
		String s = new String(new char[110]);
		String s1 = new String(new char[110]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
		  s = new Scanner(System.in).nextLine();
		  l1 = s.length();
		  s1 = new Scanner(System.in).nextLine();
		  l2 = s1.length();
		  for (j = l1;j > 0;j--)
		  {
			a[l1 - j + 1] = s.charAt(j - 1) - 48;
		  }
		  for (j = l2;j > 0;j--)
		  {
			b[l2 - j + 1] = s1.charAt(j - 1) - 48;
		  }
		  e = 0;
		  for (j = 1;j <= l1;j++)
		  {
		   a[j] = a[j] - e;
		   if (a[j] < b[j])
		   {
			   e = 1;
		   }
		   else
		   {
			   e = 0;
		   }
		   b[j] = a[j] + e * 10 - b[j];
		  }
		   while (b[l1] == 0 && l1 > 0)
		   {
			   l1 = l1 - 1;
		   }
		   for (j = l1;j > 0;j--)
		   {
			   System.out.printf("%d",b[j]);
			   b[j] = 0;
		   }
		   System.out.print("\n");
		   if (i < n)
		   {
			   scanf("\n");
		   }
		}
	}

}

