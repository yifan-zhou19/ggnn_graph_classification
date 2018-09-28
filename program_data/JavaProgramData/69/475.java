package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[250]);
		String str2 = new String(new char[250]);
		int[] a = new int[250];
		int[] b = new int[250];
		int[] c = new int[250];
		int x1;
		int x2;
		int i;
		int j;
		int k = 0;
		int l;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  str1 = tempVar.charAt(0);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  str2 = tempVar2.charAt(0);
	  }
	  x1 = str1.length();
	  x2 = str2.length();
		for (i = 0;i < x1;i++)
		{
			a[i] = str1.charAt(i) - '0';
		}
		for (i = 0;i < x2;i++)
		{
			b[i] = str2.charAt(i) - '0';
		}
		for (i = x1 - 1, j = x2 - 1;j >= 0 && i >= 0;j--, i--)
		{
			c[k] = a[i] + b[j] + c[k];
			c[k + 1] = c[k] / 10;
			c[k] = c[k] % 10;
			k++;
		}
		if (i >= 0)
		{
			for (l = i;l >= 0;l--)
			{
				c[k] = a[l] + c[k];
				c[k + 1] = c[k] / 10;
				c[k] = c[k] % 10;
				k++;
			}
		}
		else
		{
			for (l = j;l >= 0;l--)
			{
				c[k] = b[l] + c[k];
				c[k + 1] = c[k] / 10;
				c[k] = c[k] % 10;
				k++;
			}
		}
			int r = k;
		   for (i = 0;i <= k - 1;i++)
		   {
				 if (c[k - i] == 0)
				 {
			   r = k - i - 1;
				 }
			   else
			   {
			   i = k + 1;
			   }

		   }
		for (l = r;l >= 0;l--)
		{
			System.out.printf("%d",c[l]);
		}

	}

}

