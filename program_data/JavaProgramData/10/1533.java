package <missing>;

public class GlobalMembers
{
	public static void sort(int[] a, int i, int n) //sort??a[i]?a[n]??????
	{
	  int j;
	  int k;
	  int t;
	  for (j = i;j < n;j++)
	  {
		for (k = j + 1;k <= n;k++)
		{
		  if (a[j] <= a[k])
		  {
			  t = a[j];
			  a[j] = a[k];
			  a[k] = t;
		  }
		}
	  }
	}


	public static int Main()
	{
	  int i;
	  int j;
	  int k;
	  int n;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  int[] a = new int[n];
	  int[] jishu = new int[n];
	  for (i = 0;i < n;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[i] = Integer.parseInt(tempVar2);
		  }
		  jishu[i] = 1;
	  }

	  for (i = n - 2;i >= 0;i--)
	  {
		for (j = i + 1;j <= (n - 1);j++)
		{
		  if (a[j] <= a[i] != 0 && jishu[j] >= jishu[i])
		  {
			jishu[i] = jishu[j] + 1;
		  }
		}
	  }
	  sort(jishu, 0, n - 1);
	  System.out.printf("%d\n",jishu[0]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	  free(a);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	  free(jishu);

	}
}

