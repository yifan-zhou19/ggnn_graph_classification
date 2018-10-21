package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[] n = new int[99];
		  int[] m = new int[99];
		  int a = 0;
		  int k = 0;
		  int b = 0;
		  int i = 0;
		  int j = 0;
		  int h = 0;
		  int l = 0;
		  int c = 0;
		  int e = 0;
		  for (i = 0;i < 99;i++)
		  {
			   n[i] = '\0';
			   m[i] = '\0';
		  }
		  for (i = 0;i >= 0;i++)
		  {
			   String tempVar = ConsoleInput.scanfRead();
			   if (tempVar != null)
			   {
				   n[i] = Integer.parseInt(tempVar);
			   }
			   String tempVar2 = ConsoleInput.scanfRead(" ");
			   if (tempVar2 != null)
			   {
				   m[i] = Integer.parseInt(tempVar2);
			   }
			   if (m[i] == 0)
			   {
			   break;
			   }
		  }
		  c = i - 1;
		  for (i = 0;i <= c;i++,a = -1)
		  {
			   int[[]] o = new int[n[i]];
			   for (j = 0;j < n[i];j++)
			   {
			   o[j] = 1;
			   }
			   b = (n[i]);
			   e = (m[i]);
			   for (k = 0;k != b - 1;k++,e = (m[i]))
			   {
					for (l = a;e != 0;l++)
					{
						 if (l == b)
						 {
						 l = 0;
						 }
						 if (o[l] == 1)
						 {
						 e--;
						 }
					}
					o[l - 1] = 0;
					a = l;

			   }
			   for (l = 0;l < b;l++)
			   {
					if (o[l] == 1)
					{
						 int d = l + 1;
						 System.out.printf("%d\n",d);
						 break;
					}
			   }
		  }
		  return 0;
	}

}

