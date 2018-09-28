package <missing>;

public class GlobalMembers
{
	public static int cmp(Object a, Object b)
	{
	  return *(int)a > (int)b;
	}

	public static int L1;
	public static int L2;
	public static int[] ar1 = new int[MAX];
	public static int[] ar2 = new int[MAX];

	public static void read_array()
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	  memset(ar1,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	  memset(ar2,0,(Integer.SIZE / Byte.SIZE));

	  L1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  L2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

	  for (int i = 0;i < L1;i++)
	  {
		  ar1[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  }
	  for (int i = 0;i < L2;i++)
	  {
		  ar2[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  }

	}
	public static void sort_array()
	{
	  qsort(ar1,L1,(Integer.SIZE / Byte.SIZE),cmp);
	  qsort(ar2,L2,(Integer.SIZE / Byte.SIZE),cmp);
	}
	public static void merge_array()
	{
	  for (int i = 0;i < L2;i++)
	  {
		ar1[L1 + i] = ar2[i];
	  }
	}
	public static void show_array()
	{
	  for (int i = 0;i < L1 + L2;i++)
	  {
		System.out.print(ar1[i]);
		if (i != L1 + L2 - 1)
		{
			System.out.print(' ');
		}
	  }
	}

	public static int Main()
	{
	  read_array();
	  sort_array();
	  merge_array();
	  show_array();
	  return 0;
	}

}

