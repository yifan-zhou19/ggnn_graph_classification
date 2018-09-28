package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int Nchildren;
	int Mstop;
	int[] Total;
	int i;
	int j;
	int x;
	int time;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		Nchildren = Integer.parseInt(tempVar);
	}

	for (i = 0;i < Nchildren;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		Mstop = Integer.parseInt(tempVar2);
	}

	if (Mstop == 0)
	{
		x = 60;
	}
	else
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		Total = (int)malloc(Mstop);
		for (j = 0;j < Mstop;j++)
		{
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  Total[j] = Integer.parseInt(tempVar3);
		  }
		}
		time = 60;
		x = 60;
		for (j = 0;j < Mstop;j++)
		{
		  time = time - Total[j] - 3;
		  if (j > 0)
		  {
			time = time + Total[j - 1];
		  }
		  if (time > 0)
		  {
			x = x - 3;
		  }
		  else
		  {
			 if (Total[j] < x)
			 {
			   x = Total[j];
			 }
			 break;
		  }
		}

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(Total);
	}
	System.out.printf("%d\n",x);
	}
	return 0;
	}




}

