package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[500]);
		char[][] a = new char[500][500];
		char[][] b = new char[500][500];
		int[] c = new int[500];
		int i;
		int j;
		int k;
		int t;
		int max;
		int count = 1;
		int x = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		k = s.length();
		for (i = 0;i < k - t + 1;i++)
		{
			int m = 0;
			for (j = i;j < i + t;j++)
			{
				a[i][m] = s.charAt(j);
				m++;
			}
		}
		for (i = 0;i < k - t + 1;i++)
		{
			for (j = 0;j < k - t + 1;j++)
			{
				if (strcmp(a[i],a[j]) == 0)
				{
				c[i]++;
				}
				else
				{
					;
				}
			}
		}
		max = c[0];
		for (i = 0;i < k - t + 1;i++)
		{
			if (c[i] > max)
			{
			max = c[i];
			}
		}
		if (max == 1)
		{
		System.out.print("NO\n");
		}
		else
		{
			System.out.printf("%d\n",max);
			for (i = 0;i < k - t + 1;i++)
			{
			  if (c[i] == max)
			  {
				b[0] = a[i];
				break;
			  }
			}
			for (i = 0;i < k - t + 1;i++)
			{
			   int count2 = 0;
			   if (c[i] == max)
			   {
				  for (j = 0;j < count;j++)
				  {
					 if (strcmp(b[j],a[i]) == 0)
					 {
					 break;
					 }
					 else
					 {
					 count2++;
					 }
				  }
				   if (count2 == count)
				   {
					   b[x] = a[i];
					   x++;
					   count++;
				   }
					else
					{
						;
					}
			   }
				else
				{
					;
				}
			}
			 for (i = 0;i < count;i++)
			 {
			 System.out.printf("%s\n",b[i]);
			 }
		}
		return 0;
	}

}

