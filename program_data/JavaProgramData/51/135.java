package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int n;
	   int total;
	   String in = new String(new char[550]);
	   char[][] sp = new char[510][500];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   in = tempVar2.charAt(0);
	   }
		int i;
		int j;
		int k;
		total = in.length() - n + 1;
		for (i = 0;i < total;i++)
		{
			for (k = 0;k < n;k++)
			{
				sp[i][k] = in.charAt(i + k);
			}
			sp[i][k] = 0;
		}

		int[] flag = new int[510];
		int[] count = new int[510];
	   for (i = 0;i < total;i++)
	   {
		  for (j = i;j < total;j++)
		  {
			  if (flag[j] == 0)
			  {
				if (strcmp(sp[i],sp[j]) == 0)
				{
				   flag[j] = 1;
				   count[i]++;
				}
			  }
		  }
	   }
	   int max;
	   max = count[0];
	   for (i = 0;i < total;i++)
	   {
		 if (count[i] > max)
		 {
			 max = count[i];
		 }
	   }
	   if (max != 1)
	   {
	   System.out.printf("%d\n",max);
	   for (i = 0;i < total;i++)
	   {
		 if (count[i] == max)
		 {
			 System.out.printf("%s\n",sp[i]);
		 }
	   }
	   }
	   else
	   {
		   System.out.print("NO\n");
	   }
	}
}

