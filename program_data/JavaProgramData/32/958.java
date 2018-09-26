package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String temp = new String(new char[101]);
	  int n;
	  int[] a = new int[101];
	  int[] b = new int[101];
	  int[] c = new int[101];
	  int i;
	  int j;
	  int l;
	  int m;
	  int is;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 1;i <= n;i++)
	  {
		is = 1;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			temp = tempVar2.charAt(0);
		}
		l = temp.length();
		for (j = l - 1;j >= 0;j--)
		{
		a[l - j] = temp.charAt(j) - 48;
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			temp = tempVar3.charAt(0);
		}
		m = temp.length();
		for (j = m - 1;j >= 0;j--)
		{
		b[m - j] = temp.charAt(j) - 48;
		}
		for (j = m + 1;j <= 100;j++)
		{
			b[j] = 0;
		}
		for (j = 1;j <= l;j++)
		{
		  if (a[j] < b[j])
		  {
			a[j] += 10;
			a[j + 1]--;
		  }
		  c[j] = a[j] - b[j];
		}
		while (c[l] == 0)
		{
			l--;
			if (l == 0)
			{
				is = 0;
				break;
			}
		}
		if (is != 0)
		{
			for (j = l;j >= 1;j--)
			{
				System.out.printf("%d",c[j]);
			}
		System.out.print("\n");
		}
		else
		{
			System.out.printf("%d\n",0);
		}
	  }


	}


}

