package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		   String a = new String(new char[501]);
		   int[] b = new int[501];
		   int k;
		   int n;
		   int i;
		   int j;
		   int t;
		   int s;
		   int c;
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   k = Integer.parseInt(tempVar);
		   }
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a = tempVar2.charAt(0);
		   }
		   n = a.length();
		   for (i = 0;i < n - k;i++)
		   {
			   b[i] = 1;
			   for (j = i + 1;j <= n - k;j++)
			   {
				   if (a.charAt(j) == a.charAt(i))
				   {
					   s = 0;
					   for (t = 1;t < k;t++)
					   {
							if (a.charAt(j + t) != a.charAt(i + t))
							{
							s = 1;
							}
					   }
					   if (s == 0)
					   {
						   b[i] += 1;
					   }
				   }
			   }
		   }
		   c = b[0];
		   for (i = 1;i < n - k;i++)
		   {
			   if (b[i] > c)
			   {
				   c = b[i];
			   }
		   }
		   if (c == 1)
		   {
			   System.out.print("NO");
		   }
		   else
		   {
			   System.out.printf("%d\n",c);
			   for (i = 0;i <= n - k;i++)
			   {
				   if (b[i] == c)
				   {
					   for (j = 0;j < k;j++)
					   {
					   System.out.printf("%c",a.charAt(i + j));
					   }
					   System.out.print("\n");
				   }
			   }
		   }
	}
}

