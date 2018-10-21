package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String s = new String(new char[100]);
	int[] a = new int[100];
	int[] b = new int[100];
	int[] c = new int[100];
	int m;
	int i;
	int t;
	int k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		s = tempVar.charAt(0);
	}
	m = s.length() - 1;
	for (i = 0;i <= m;i++)
	{
	  a[i] = s.charAt(i) - '0';
	}
	if (m == 0)
	{
	  System.out.printf("0\n%d",a[0]);
	}
	else if (m == 1)
	{
		t = a[0] * 10 + a[1];
	  System.out.printf("%d\n%d",(t - t % 13) / 13,t % 13);
	}
	else if (m == 2)
	{
		t = a[0] * 100 + a[1] * 10 + a[2];
	  System.out.printf("%d\n%d",(t - t % 13) / 13,t % 13);
	}
	else
	{
	  b[0] = a[0] * 100 + a[1] * 10 + a[2];
	  c[0] = (b[0] - b[0] % 13) / 13;
	  for (i = 1;i <= m;i++)
	  {
		   b[i] = (b[i - 1] % 13) * 10 + a[i + 2];
		   c[i] = (b[i - 1] - b[i - 1] % 13) / 13;
	  }
	  for (i = 1;i < m;i++)
	  {
		System.out.printf("%d",c[i]);
	  }
	  System.out.print("\n");
	  System.out.printf("%d\n",b[m - 2] % 13);
	}
	}

}

