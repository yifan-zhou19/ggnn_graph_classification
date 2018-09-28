package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *normal = (int *) malloc(sizeof(int) * n);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		int normal = (int) malloc((Integer.SIZE / Byte.SIZE) * n);

		int hi;
		int lo;

		int i;

		int max = 0;
		int len;
		int previous = -1;

		for (i = 0; i <= n - 1; i++)
		{
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  hi = Integer.parseInt(tempVar2);
			  }
			  String tempVar3 = ConsoleInput.scanfRead(" ");
			  if (tempVar3 != null)
			  {
				  lo = Integer.parseInt(tempVar3);
			  }
			  if ((lo >= 60) && (lo <= 90) && (hi >= 90) && (hi <= 140))
			  {
			  }
			  else
			  {
				  len = i - previous - 1;
				  previous = i;
				  if (len > max)
				  {
						 max = len;
				  }
			  }
		}

		i = n;
		len = i - previous - 1;
		if (len > max)
		{
						 max = len;
		}

		System.out.printf("%d", max);



		return 0;
	}


}

