package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n)
	{
	  int i;
	  int k = 0;
	  for (i = 2;i <= n;i++)
	  {
		k = ((m % i) + k) % i;
	  }
	  return k;
	}

	public static int Main()
	{
	  int[] m = new int[100];
	  int[] n = new int[100];
	  int i = 0;
	  int z;
	  while (true)
	  {
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n[i] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m[i] = Integer.parseInt(tempVar2);
		}
		if (m[i] == 0 && n[i] == 0)
		{
			break;
		}
		i++;
		z = i;
	  }
	  for (i = 0;i < z;i++)
	  {
		System.out.printf("%d\n",f(m[i], n[i]) + 1);
	  }
	  return 0;
	}

}

