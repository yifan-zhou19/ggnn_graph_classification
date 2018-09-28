package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int j;
	 int k;
	 int[] p = new int[10000];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 if (n >= 1 && n <= 4)
	 {
	  System.out.print("empty");
	 }
	 else
	 {
	  k = 0;
	  for (i = 3;i <= n;i++)
	  {
		  for (j = 2;j < i;j++)
		  {
			if (i % j == 0)
			{
			break;
			}
			if (j == i - 1)
			{
			p[k] = i;
			k++;
			}
		  }

	  }
	  p[k] = '\0';
	  for (i = 0;i < k;i++)
	  {
		  if (p[i] + 2 <= n != 0 && p[i] + 2 == p[i + 1])
		  {
		  System.out.printf("%d %d\n",p[i],p[i + 1]);
		  }
	  }
	 }
	 System.in.read();
	 System.in.read();
	}

}

