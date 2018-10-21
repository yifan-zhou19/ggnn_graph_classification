package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		char x;
		int i = 0;
		int j;
		int k;
		int t;
		String tempVar = ConsoleInput.scanfRead(null, 1);
		if (tempVar != null)
		{
			x = tempVar.charAt(0);
		}
		while (x != '\n')
		{
			if (x != ',')
			{
			 a[i] = a[i] * 10 + x - '0';
			}
			else
			{
				i++;
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				x = tempVar2.charAt(0);
			}
		}
		if (i == 0)
		{
			System.out.print("No\n");
		}
		else
		{
		  for (j = 0;j <= i - 1;j++)
		  {
			for (k = j + 1;k <= i;k++)
			{
				if (a[k] > a[j])
				{
					t = a[j];
					a[j] = a[k];
					a[k] = t;
				}
			}
		  }
		  if (a[0] == a[i])
		  {
			  System.out.print("No\n");
		  }
		  else
		  {
		   for (j = 1;j <= i;j++)
		   {
			   if (a[j] != a[0])
			   {
			   System.out.printf("%d\n",a[j]);
			   break;
			   }
		   }
		  }
		}
	}

}

