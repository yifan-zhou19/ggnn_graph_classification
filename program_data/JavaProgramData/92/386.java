package <missing>;

public class GlobalMembers
{
	public static int cmp(Object a, Object b)
	{
	  if ((int)a > (int)b)
	  {
		  return -1;
	  }
	  else if ((int)a < (int)b)
	  {
		  return 1;
	  }
	  else
	  {
		  return 0;
	  }
	}
	public static int Main()
	{
	  int n;
	  int[] a = new int[1000];
	  int[] b = new int[1000];
	  int i;
	  int j;
	  int k;
	  int sum;
	  int s1;
	  int s2;
	  int i1;
	  int i2;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  while (n != 0)
	  {
		sum = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		qsort(a,n,(Integer.SIZE / Byte.SIZE),cmp);
		qsort(b,n,(Integer.SIZE / Byte.SIZE),cmp);
		i1 = i2 = n - 1;
		s1 = s2 = 0;
		while (s1 <= i1)
		{
		  while (a[i1] != b[i2] && s1 <= i1)
		  {
			if (a[i1] > b[i2])
			{
			  sum++;
			  i1--;
			  i2--;
			}
			else
			{
			  sum--;
			  i1--;
			  s2++;
			}
		  }
		  if (s1 > i1)
		  {
			  break;
		  }
		  while (a[s1] != b[s2] && s1 <= i1)
		  {
			if (a[s1] > b[s2])
			{
			  sum++;
			  s1++;
			  s2++;
			}
			else
			{
			  sum--;
			  i1--;
			  s2++;
			}
		  }
		  if (s1 > i1)
		  {
			  break;
		  }
		  if (a[s1] == b[s2] && a[i1] == b[i2])
		  {
			if (a[i1] > b[s2])
			{
				sum++;
			}
			else if (a[i1] < b[s2])
			{
				sum--;
			}
			i1--;
			s2++;
		  }
		  if (s1 > i1)
		  {
			  break;
		  }
		}
		System.out.printf("%d\n",sum * 200);
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			n = Integer.parseInt(tempVar4);
		}
	  }
	 return 0;
	}

}

