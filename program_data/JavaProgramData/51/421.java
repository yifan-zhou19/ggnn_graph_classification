package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[500]);
		char[][] b = new char[500][5];
		char[][] c = new char[500][5];
		int n;
		int leng;
		int i;
		int[] num = new int[500];
		int k;
		int j;
		int max;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = new Scanner(System.in).nextLine();
		leng = a.length();
		for (i = 0;i <= leng - n;i++)
		{
			for (j = 0;j < n;j++)
			{
				   b[i][j] = a.charAt(i + j);
			}
			   b[i][j] = '\0';
		}
		c[0] = b[0];
		k = 1;

		for (i = 0;i <= leng - n;i++)
		{
			   for (j = 0;j < k;j++)
			   {
					   if (strcmp(c[j],b[i]) == 0)
					   {
						  num[j]++;
						  break;
					   }


			   }
				if (j == k)
				{
					c[j] = b[i];
					num[j]++;
					k++;
				}


		}
		max = num[0];
		for (i = 0;i < k;i++)
		{
		   if (num[i] > max)
		   {
			   max = num[i];
		   }


		}

	   if (max > 1)
	   {
		   System.out.printf("%d\n",max);
	   for (i = 0;i < k;i++)
	   {
		  if (num[i] == max)
		  {
		  System.out.printf("%s\n",c[i]);
		  }


	   }
	   }
	   else
	   {
		   System.out.print("NO");
	   }
	   return 0;





	}
}

