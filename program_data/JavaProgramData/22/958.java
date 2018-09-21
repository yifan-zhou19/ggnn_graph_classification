package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int[] a = new int[200];
	int t;
	int m;
	char c;
	i = 1;
	while (c != '\n')
	{
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a[i] = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(null, 1);
	 if (tempVar2 != null)
	 {
		 c = tempVar2.charAt(0);
	 }
	i++;
	}
	n = -10000;
	m = -10000;
	if (i - 1 == 1)
	{
		System.out.print("No");
	}
	 else
	 {
		 for (j = 1;j < i;j++)
		 {
		  if (n < a[j])
		  {
			  n = a[j];
		  }
		 }
		  for (t = 1;t < i;t++)
		  {
		  if (a[t] == n)
		  {
			  a[t] = -10000;
		  }
		  }
		  for (j = 1;j < i;j++)
		  {
		  if (m < a[j])
		  {
			  m = a[j];
		  }
		  }
		  if (m == -10000)
		  {
			  System.out.print("No");
		  }
	else
	{
		System.out.printf("%d",m);
	}
	 }
	}

}

