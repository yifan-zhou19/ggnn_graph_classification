package <missing>;

public class GlobalMembers
{
	public static int Method(int M,int N)
	{
	  int i = 0;
	  int result = 0;
	  if (M < 0) //????
	  {
		return 0;
	  }
	  if (N == 0)
	  {
		return 0;
	  }
	  else if (M == 0)
	  {
		result += 1;
	  }
	  else if (M == 1 || N == 1)
	  {
		result += 1;
	  }
	  else
	  {
		result += Method(M, N - 1) + Method(M - N, N);
	  }
	  return result;
	}
	public static int Main()
	{
	  int i = 0;
	  int j = 0;
	  int n = 0;
	  int m = 0;
	  int a = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  j = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < j;i++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		a = Method(m, n);
		System.out.printf("%d\n",a);
	  }
	  return 0;
	}

}

