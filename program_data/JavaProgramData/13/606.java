package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int k;
	int i;
	int j;
	int f = 0;
	int c = 0;
	int[] q = new int[20001];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (k = 0;k < n;k++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		q[k] = Integer.parseInt(tempVar2);
	}
	}

	System.out.printf("%d",q[0]);
	for (i = 1;(i < n);i++)
	{
		c = 0;
	for (j = 0;j < i;j++)
	{
		if (q[j] == q[i])
		{
	 c++;
		}
	 else
	 {
	 c = c + 0;
	 }
	}

	   if (c == 0)
	   {
	   System.out.printf(" %d",q[i]);
	   }
	   else
	   {
	   f++;
	   }
	}
	}




}

