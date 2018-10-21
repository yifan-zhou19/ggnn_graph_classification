package <missing>;

public class GlobalMembers
{
	public static int maxii(int n, int[] a)
	{
		int k;
		int i;
		int s;
		k = 1;
		for (i = 1;i < n;i++)
		{
			if ((a[i] <= a[0]) && (maxii(n - i, a + i)>(k - 1)))
			{
			k = maxii(n - i, a + i) + 1;
			}
		}
		return k;
	}

	public static int Main()
	{
		  int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *k;
		  int k;
		  int i;
		  int j;
		  int c;
		  int[] a = new int[25];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < n;i++)
		  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[i] = Integer.parseInt(tempVar2);
		  }
		  }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		  k = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
		  c = 1;
		  for (j = 0;j < n;j++)
		  {
			  if (c < maxii(n - j, a + j))
			  {
			  c = maxii(n - j, a + j);
			  }
		  }
		  System.out.printf("%d",c);
	}
}

