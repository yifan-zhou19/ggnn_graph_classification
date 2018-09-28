package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] c = new int[500];
		int max = 0;
		int z;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String a = new String(new char[500]);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		for (int i = 0;i <= a.length() - n;i++)
		{
				c[i] = 1;
			   for (int j = i + 1;j <= a.length() - n;j++)
			   {
					   z = 1;
					   for (int k = 0;k < n;k++)
					   {
					   if (a.charAt(i + k) != a.charAt(j + k))
					   {
					   z = 0;
					   }
					   }
					   if (z == 1)
					   {
						 c[i]++;
					   }
			   }
			   if (c[i] > max)
			   {
				 max = c[i];
			   }
		}
		if (max == 1)
		{
		System.out.print("NO");
		}
		else
		{
		System.out.printf("%d\n",max);
		for (int i = 0;i <= a.length() - n;i++)
		{
				if (c[i] == max)
				{
							  for (int k = 0;k < n - 1;k++)
							  {
									  System.out.printf("%c",a.charAt(i + k));
							  }
							  System.out.printf("%c\n",a.charAt(i + n - 1));
				}
		}
		}
		return 0;
	}
}

