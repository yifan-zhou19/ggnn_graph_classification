package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String z = new String(new char[1000]);
	   String x = new String(new char[20]);
	   int i;
	   int j;
	   int k;
	   int l;
	   int n;
	   int[] h = new int[1000];
	   int p;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   z = tempVar2.charAt(0);
	   }
	   int len = z.length();
	   for (i = 0;i <= len - n;i++)
	   {
		   h[i] = 0;
		   for (j = i;j < i + n;j++)
		   {
			   x = tangible.StringFunctions.changeCharacter(x, j - i, z.charAt(j));
		   }
		   x = x.substring(0, n);
		   for (j = i;j < len;j++)
		   {
			   p = 0;
			   for (k = j;k < j + n;k++)
			   {
				   if (x.charAt(k - j) == z.charAt(k))
				   {
					   p++;
				   }
			   }
			   if (p == n)
			   {
				   h[i]++;
			   }
		   }
	   }
	   int count;
	   int dount;
	   int m = 0;
	   for (i = 0;i < len - n + 1;i++)
	   {
		   count = 0;
		   dount = 0;
		   for (j = 0;j < len - n + 1;j++)
		   {
			   if (h[i] >= h[j])
			   {
				   count++;
			   }
			   if (h[i] > h[j])
			   {
				   dount++;
			   }
		   }
		   if (count == len - n + 1 && dount != 0)
		   {
			   System.out.printf("%d\n",h[i]);
			   m++;
			   break;
		   }
	   }
	   for (i = 0;i < len - n + 1;i++)
	   {
		   count = 0;
		   dount = 0;
		   for (j = 0;j < len - n + 1;j++)
		   {
			   if (h[i] >= h[j])
			   {
				   count++;
			   }
			   if (h[i] > h[j])
			   {
				   dount++;
			   }
		   }
		   if (dount != 0 && count == len - n + 1)
		   {
			   for (j = 0;j < n;j++)
			   {
				   x = tangible.StringFunctions.changeCharacter(x, j, z.charAt(j + i));
			   }
			   x = x.substring(0, n);
			   System.out.printf("%s\n",x);
		   }
	   }
	   if (m == 0)
	   {
		   System.out.print("NO");
	   }
	   return 0;
	}
}

