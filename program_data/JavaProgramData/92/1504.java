package <missing>;

public class GlobalMembers
{
	public static int cmp(Object elem1, Object elem2)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *e1 = (int *)elem1;
	  int e1 = (int)elem1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *e2 = (int *)elem2;
	  int e2 = (int)elem2;
	  return e2 - e1;
	}

	public static int Main()
	{
	  int n;
	  int[] data1 = new int[1005];
	  int[] data2 = new int[1005];
	  int i;
	  int i1;
	  int i2;
	  int j1;
	  int j2;
	  int result;
	  while (true)
	  {
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0)
		{
			break;
		}
		for (i = 0; i < n; i++)
		{
		  data1[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i < n; i++)
		{
		  data2[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		qsort(data1, n, (Integer.SIZE / Byte.SIZE), cmp);
		qsort(data2, n, (Integer.SIZE / Byte.SIZE), cmp);
		i1 = 0;
		j1 = 0;
		i2 = n - 1;
		j2 = n - 1;
		result = 0;
		while (i1 != i2 + 1)
		{
		  while (data1[i1] != data2[j1] && i1 != i2 + 1)
		  {
		if (data1[i1] < data2[j1])
		{
		  i2--;
		  j1++;
		  result -= 200;
		}
		else if (data1[i1] > data2[j1])
		{
		  i1++;
		  j1++;
		  result += 200;
		}
		else
		{
			break;
		}
		  }
		  while (data1[i2] != data2[j2] && i1 != i2 + 1)
		  {
		if (data1[i2] < data2[j2])
		{
		  j1++;
		  i2--;
		  result -= 200;
		}
		else if (data1[i2] > data2[j2])
		{
		  i2--;
		  j2--;
		  result += 200;
		}
		else
		{
			break;
		}
		  }
		  if (data1[i1] == data2[j1] && data1[i2] == data2[j2] && i1 != i2 + 1)
		  {
		if (data1[i2] != data2[j1])
		{
		  result -= 200;
		}
		i2--;
		j1++;
		  }
		}
		System.out.print(result);
		System.out.print("\n");
	  }
	  return 0;
	}

}

