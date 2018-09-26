package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int j;
	   int k;
	   int max;
	   int n;
	   int l1;
	   int l;
	   char c;
	   String s = new String(new char[1000]);
	   char[][] a = new char[1000][1000];
	   int[] b = new int[1000];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   s = tempVar2.charAt(0);
	   }
	   l1 = s.length();
	   j = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	   memset(a,0,(Character.SIZE / Byte.SIZE));
	   l = l1 - n + 1;
	   for (i = 0;i <= l1 - n;i++)
	   {
		  for (j = 0;j < n;j++)
		  {
		  a[i][j] = s.charAt(i + j);
		  }
	   }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	   memset(b,0,(Integer.SIZE / Byte.SIZE));
	   for (i = 0;i < l;i++)
	   {
		   k = 0;
		   for (j = 0;j < i;j++)
		   {
		   if (strcmp(a[i],a[j]) == 0)
		   {
			  b[j]++;
			  k = 1;
			  break;
		   }
		   }
		   if (k == 0)
		   {
			   b[i]++;
		   }
	   }
		max = 0;
	   for (i = 0;i < l;i++)
	   {
		   if (max < b[i])
		   {
			   max = b[i];
		   }
	   }
	   if (max == 1)
	   {
		   System.out.print("NO");
	   }
	   else
	   {
			System.out.printf("%d\n",max);
			for (i = 0;i < l;i++)
			{
			if (b[i] == max)
			{
				System.out.printf("%s\n",a[i]);
			}
			}
	   }

	}

}

