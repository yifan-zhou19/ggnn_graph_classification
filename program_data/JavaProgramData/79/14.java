package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'pchs', so pointers on this parameter are left unchanged:
	public static int chs(tangible.RefObject<Integer> p0, int num, int * pchs, int skip)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *i=null;
	  int i = null;

	  //????
	  pchs = pchs + skip - 1;
	  while (pchs - p0.argValue >= num)
	  {
		pchs = pchs - num;
	  }

	  //????
	  if (num == 1)
	  {
		return *pchs;
	  }
	  //????
	  else
	  {
		//??
		if (pchs - p0.argValue == num - 1)
		{
		  return chs(p0, num - 1, p0.argValue, skip);
		}
		//???
		else
		{
		  for (i = pchs;i - p0.argValue < num - 1;i++)
		  {
			i = *(i + 1);
		  }
		  return chs(p0, num - 1, pchs, skip);
		}
	  }
	}

	public static int Main()
	{
	  int n = 0;
	  int m = 0;
	  int[] ppl = new int[1000];
	  int king;
	  int i;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  m = Integer.parseInt(tempVar2);
	  }
	  while (n != 0 && m != 0)
	  {
		for (i = 0;i < n;i++)
		{
		  ppl[i] = i + 1;
		}
		for (i = n;i < 1000;i++)
		{
		  ppl[i] = 0;
		}
	tangible.RefObject<Integer> tempRef_ppl = new tangible.RefObject<Integer>(ppl);
		king = chs(tempRef_ppl, n, ppl, m);
		ppl = tempRef_ppl.argValue;
		System.out.printf("%d\n",king);
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			m = Integer.parseInt(tempVar4);
		}
	  }
	  return 0;
	}

}

