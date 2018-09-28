package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[250]);
		  String b = new String(new char[250]);
		  int i;
		  int j;
		  int k;
		  int m0;
		  int n0;
		  int m;
		  int n;
		  String p;
		  String q;
		  String p0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = tempVar.charAt(0);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  b = tempVar2.charAt(0);
		  }
		   m0 = a.length();
		   n0 = b.length();
		  if (m0 < n0)
		  {
			  m = m0;
			  n = n0;
			  q = a;
			  p = b;
		  }
		  else
		  {
			  m = n0;
			  n = m0;
			  q = b;
			  p = a;
		  }
		  int[] c = new int[(n + 1)];
		  c[0] = 0;
		  for (i = 0;i <= m - 1;i++)
		  {
				c[n - i] = p.charAt(n - 1 - i) + q.charAt(m - 1 - i) - '0'-'0';
		  }
		  for (i = 0;i <= n - m - 1;i++)
		  {
				 c[i + 1] = p.charAt(i) - '0';
		  }
		  for (i = n;i >= 1;i--)
		  {
			 if (c[i] >= 10)
			 {
				c[i] = c[i] - 10;
				c[i - 1] = c[i - 1] + 1;
			 }
		  }
	for (i = 0;i < n;i++)
	{
			if (c[i] != 0)
			{
			break;
			}
	}
	for (j = i;j <= n;j++)
	{
	   System.out.printf("%c",c[j] + '0');
	}
	}
}

