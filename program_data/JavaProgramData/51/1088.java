package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int[] sum = new int[500];
	  int max = 0;
	  int i;
	  int k;
	  int j;
	  String a = new String(new char[501]);
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a = tempVar2.charAt(0);
	  }
	  for (i = 0;i <= a.length() - n;i++)
	  {
		  sum[i] = 1;
		for (j = i + 1;j <= a.length() - n;j++)
		{
		   for (k = 0;k < n;k++)
		   {
			if (a.charAt(i + k) != a.charAt(j + k))
			{
			break;
			}
		   }
		   if (k == n)
		   {
			sum[i]++;
		   }
		}
		if (max < sum[i])
		{
		max = sum[i];
		}
	  }
	if (max > 1)
	{
		System.out.printf("%d\n",max);
	for (i = 0;i <= a.length() - n;i++)
	{
	   if (sum[i] == max)
	   {
	   for (j = 0;j < n;j++)
	   {
	   System.out.printf("%c",a.charAt(i + j));
	   }
	   }
	   System.out.print("\n");
	}
	}
	else
	{
	System.out.print("NO");
	}

	}
}

