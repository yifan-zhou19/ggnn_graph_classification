package <missing>;

public class GlobalMembers
{
	public static int input(tangible.RefObject<Integer> s, int n)
	{

	}
	public static int sort(tangible.RefObject<Integer> s, int n)
	{

	}
	public static int Main()
	{
		  //??m?n 
		  int m;
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  m = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  n = Integer.parseInt(tempVar2);
		  }

		  //?????? 
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a=(int *)malloc(m *sizeof(int));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		  int a = (int)malloc(m * (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *b=(int *)malloc(n *sizeof(int));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		  int b = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *s=(int *)malloc((m+n)*sizeof(int));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		  int s = (int)malloc((m + n) * (Integer.SIZE / Byte.SIZE));

		  //?? 
		  for (int i = 0;i < m;i++)
		  {
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  a + i = Integer.parseInt(tempVar3);
		  }
		  }
		  for (int i = 0;i < n;i++)
		  {
		  String tempVar4 = ConsoleInput.scanfRead();
		  if (tempVar4 != null)
		  {
			  b + i = Integer.parseInt(tempVar4);
		  }
		  }

		  //?? 
		  for (int i = 1;i < m;i++)
		  {
		  for (int j = 0;j < m - i;j++)
		  {
			if (*(a + j) > *(a + (j + 1)))
			{
							int t;
							t = (a + j);
							*(a + j) = *(a + (j + 1));
							*(a + (j + 1)) = t;
			}
		  }
		  }
		  for (int i = 1;i < n;i++)
		  {
		  for (int j = 0;j < n - i;j++)
		  {
			if (*(b + j) > *(b + (j + 1)))
			{
							int t;
							t = (b + j);
							*(b + j) = *(b + (j + 1));
							*(b + (j + 1)) = t;
			}
		  }
		  }

		  //?? 
		  for (int i = 0;i < m;i++)
		  {
		  s[i] = a[i];
		  }
		  for (int i = 0;i < n;i++)
		  {
		  s[m + i] = b[i];
		  }
		  for (int i = 0;i < m + n;i++)
		  {
			  if (i == 0)
			  {
			  System.out.printf("%d",s[i]);
			  }
			  else
			  {
			  System.out.printf(" %d",s[i]);
			  }
		  }

	}
}

