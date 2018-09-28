package <missing>;

public class GlobalMembers
{
	public static void array(tangible.RefObject<Integer> a, int n) //array larger-less
	{

		 int i;
		 int j;
		 int t;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p=a;
		 int p = a.argValue;
		 for (i = 1;i <= n - 1;i++)
		 {
							for (j = 1;j <= n - i;j++)
							{
											  if (*(p + j) < *(p + j + 1))
											  {
																 t = (p + j);
																 *(p + j) = *(p + j + 1);
																 *(p + j + 1) = t;
											  }
							}
		 }
	}
	public static int result(int[] a, int[] b, int n)
	{
		int i;
		int j;
		int t;
		int[] item = new int[5000];
		int sum = -500;
		for (i = 1;i <= n;i++)
		{
						 for (j = 1;j <= n;j++)
						 {
										  t = i + j - 1;
										  if (t > n)
										  {
											  t = t - n;
										  }
										  if (a[t] > b[j])
										  {
											  item[i]++;
										  }
										  if (a[t] < b[j])
										  {
											  item[i]--;
										  }
						 }
						 if (item[i] > sum)
						 {
							 sum = item[i];
						 }
		}
		return (sum);
	}
	public static int Main()
	{
	for (;;)
	{
		  int n;
		  int i;
		  int j;
		  int money;
		  int[] a = new int[5000];
		  int[] b = new int[5000];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		  memset(a,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		  memset(b,0,(Integer.SIZE / Byte.SIZE));
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  if (0 == n)
		  {
			  break;
		  }
		  for (i = 1;i <= n;i++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a[i] = Integer.parseInt(tempVar2);
			  }
		  }
		  for (i = 1;i <= n;i++)
		  {
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  b[i] = Integer.parseInt(tempVar3);
			  }
		  }

	  tangible.RefObject<Integer> tempRef_a = new tangible.RefObject<Integer>(a);
		  array(tempRef_a, n);
		  a = tempRef_a.argValue;
	  tangible.RefObject<Integer> tempRef_b = new tangible.RefObject<Integer>(b);
		  array(tempRef_b, n);
		  b = tempRef_b.argValue;

		  /*for(i=1;i<=n;i++)
		  {printf("%d ",a[i]);}*/

		  money = result(a, b, n) * 200;
		  System.out.printf("%d\n",money);
	}
	}
}

