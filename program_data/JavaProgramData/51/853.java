package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i;
	 int j;
	 int n;
	 int[] a = new int[500];
	 int[] d = new int[500];
	 int len;
	 int m;
	 int t;
	 char[][] s = new char[500][5];
	 String b = new String(new char[500]);
	 String c = new String(new char[5]);
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 b = new Scanner(System.in).nextLine();
	 len = b.length();
	 for (i = 0;i <= len - n;i++)
	 {
	  for (j = 0;j < n;j++)
	  {
		s[i][j] = b.charAt(i + j);
	  }
	  s[i][n] = 0;
	  d[i] = i;
	 }
	 for (i = 0;i <= len - n;i++)
	 {
	  a[i] = 0;
	 }
	 for (i = 0;i < len - n;i++)
	 {
	  for (j = i + 1;j <= len - n;j++)
	  {
		if (strcmp(s[i],s[j]) == 0)
		{
			a[i]++;
		}
	  }
	 }
	 for (i = 0;i < len - n;i++)
	 {
	  for (j = 0;j < len - n - i;j++)
	  {
	   if (a[j] < a[j + 1])
	   {
		m = a[j];
		a[j] = a[j + 1];
		a[j + 1] = m;
		c = s[j];
		s[j] = s[j + 1];
		s[j + 1] = c;
		m = d[j];
		d[j] = d[j + 1];
		d[j + 1] = m;
	   }
	  }
	 }
	 if (a[0] == 0)
	 {
		 System.out.print("NO");
	 }
	 else if (a[0] - a[1] > 0)
	 {
		 System.out.printf("%d\n",a[0] + 1);
		 System.out.println(s[0]);
	 }
	 else
	 {
	   for (i = 0;i < len - n;i++)
	   {
		if (a[i] - a[i + 1] > 0)
		{
		m = i;
		break;
		}
	   }
	   for (i = 0;i < m;i++)
	   {
		for (j = 0;j < m - i;j++)
		{
		  if (d[j] > d[j + 1])
		  {
		  c = s[j];
		  s[j] = s[j + 1];
		  s[j + 1] = c;
		  }
		}
	   }
	   System.out.printf("%d\n",a[0] + 1);
	   for (i = 0;i <= m;i++)
	   {
		 System.out.println(s[i]);
	   }

	 }


	  return 0;
	}

}

