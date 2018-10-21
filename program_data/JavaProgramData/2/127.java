package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int num = 0;
	   int n;
	   int[] a = new int[26];
	   int[] name = new int[1000];
	   int[] name2 = new int[1000];
	   int i;
	   int j;
	   int k;
	   int max = 0;
	   int maxi = 0;
	   char[][] wr = new char[1000][27];
	   char q;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 0;i < 26;i++)
	   {
			 a[i] = 0;
	   }
	   for (i = 0;i < n;i++)
	   {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 (name[i]) = Integer.parseInt(tempVar2);
			 }
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 wr[i] = tempVar3.charAt(0);
			 }
			for (j = 0;j < 26;j++)
			{
				 for (k = 0;k < 26;k++)
				 {
					if (wr[i][j] == 'A' + k)
					{
						a[k]++;
					}
				 }
			}
	   }
		  for (i = 0;i < 26;i++)
		  {
				if (a[i] > max)
				{
				  max = a[i];
				  maxi = i;
				}
		  }
		  q = 'A' + maxi;
		  System.out.printf("%c\n",q);
		  for (i = 0;i < n;i++)
		  {
			   for (j = 0;j < 26;j++)
			   {
				  if (wr[i][j] == q)
				  {
				name2[num] = name[i];
				num++;
				  }
			   }
		  }
		  System.out.printf("%d\n",num);
		  for (i = 0;i < num;i++)
		  {
			  System.out.printf("%d\n",name2[i]);
		  }

	}
}

