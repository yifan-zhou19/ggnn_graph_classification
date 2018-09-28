package <missing>;

public class GlobalMembers
{
	public static void list(int[] x, int n)
	{
		int i;
		int j;
		int temp;
		for (i = 0;i < n - 1;i++)
		{
			  for (j = i + 1;j < n;j++)
			  {
					   if (x[j] > x[i])
					   {
							  temp = x[i];
							  x[i] = x[j];
							  x[j] = temp;
					   }
			  }
		}
	}
	public static int Main()
	{
		void list(int x[],int n);
		int n;
		int i;
		int[] tian = new int[1010];
		int[] qi = new int[1010];
		int win = 0;
		int lose = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * ptianlow;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * pqilow;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * ptianfast;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * pqifast;
		int money;
	  for (;;money = win = lose = 0)
	  {
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 0)
		{
		break;
		}
		else
		{

		for (i = 0;i < n;i++)
		{
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  tian[i] = Integer.parseInt(tempVar2);
			  }
		}
		for (i = 0;i < n;i++)
		{
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  qi[i] = Integer.parseInt(tempVar3);
			  }
		}
		list(tian, n);
		list(qi, n);

		ptianlow = tian[n - 1];
		ptianfast = tian[0];
		pqilow = qi[n - 1];
		pqifast = qi[0];

		for (;ptianfast < ptianlow + 1;)
		{

		if (*ptianlow < *pqilow)
		{
			  lose++;
			  ptianlow--;
			  pqifast++;
			  continue;
		}

		else if (*ptianlow > *pqilow)
		{
			  win++;
			  ptianlow--;
			  pqilow--;
			  continue;
		}

		else
		{
			  if (*ptianfast < *pqifast)
			  {
					lose++;
					ptianlow--;
					pqifast++;
					continue;
			  }
			  else if (*ptianfast > *pqifast)
			  {
					win++;
					ptianfast++;
					pqifast++;
					continue;
			  }
			  else
			  {
					if (*ptianlow < *pqifast)
					{
					   lose++;
					   ptianlow--;
					   pqifast++;
					}
					else
					{
						ptianlow--;
						pqifast++;
					}
			  }

		}
		}

		money = win * 200 - lose * 200;
		System.out.printf("%d\n",money);
		}
	  }

	return 0;
	}


}

