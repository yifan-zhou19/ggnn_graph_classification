package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k = 0;
		int i;
		int j;
		int r;
		int c;
		int t;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a;
		int a;
		int p;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  r = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  c = Integer.parseInt(tempVar2);
	  }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
	  a = (int)calloc(r * c,(Integer.SIZE / Byte.SIZE));
	  for (i = 0;i < r * c;i++)
	  {
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  a + i = Integer.parseInt(tempVar3);
	  }
	  }
	  for (i = 0;i < c;i++)
	  {
		  j = 0;
		  t = i;
		while (t >= 0 && j < r)
		{
			System.out.printf("%d",*(a + j * c + t));
		  System.out.print("\n");
		  t--;
		  j++;
		}
	  }

	  for (i = 1;i < r;i++)
	  {
		  j = c - 1;
		  t = i;
		while (t < r && j >= 0)
		{
			System.out.printf("%d",*(a + t * c + j));
		if (!(j == c - 1 && t == r - 1))
		{
			System.out.print("\n");
		}
		j--;
		t++;
		}
	  }
	}
}

