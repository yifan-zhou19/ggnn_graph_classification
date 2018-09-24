package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[18];
	int m;
	int i = 0;
	int j = 0;
	int k = 0;
	int l = 0;
	int n = 0;

	for (n = 0;;n++)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a[0] = Integer.parseInt(tempVar);
	}
	if (a[0] == -1)
	{
	break;
	}
	else
	{
	for (i = 1;;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
	if (a[i] == 0)
	{
		m = i - 1;
		break;
	}
	} //??a[i]
	i = 0;

	 for (i = 0;i <= m;i++)
	 {
	  for (j = 0;j <= m;j++)
	  {
		 if (a[j] == (2 * a[i]))
		 {
		 k++;
		 }
	  }
	  l = l + k;
	  k = 0; //printf("%d\n",l);
	 } //????a[i],???a[i]??

	System.out.printf("%d\n",l);
	l = 0;
	}

	}
	return 0;
	}
}

