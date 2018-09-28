package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int k;
	int a;
	int b;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct qj
	//{
	// int a,b;
	//}
	//qj[50000];
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
			(qj[i].a) = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			(qj[i].b) = tempVar3;
		}
	}

	for (k = 1;k <= n;k++)
	{
	  for (i = 0;i < n - k;i++)
	  {
		if (qj[i].a > qj[i + 1].a)
		{
		  a = qj[i + 1].a;
		  qj[i + 1].a = qj[i].a;
		  qj[i].a = a;

	b = qj[i + 1].b;
		  qj[i + 1].b = qj[i].b;
		  qj[i].b = b;

		}

	  }
	}

	for (i = 0;i <= n - 2;)
	{
	  if (qj[i].b >= qj[i + 1].a)
	  {
		if (qj[i].b < qj[i + 1].b)
		{

		  qj[i].b = qj[i + 1].b;
		}

		for (j = i + 1;j < n - 1;j++)
		{
		  qj[j].a = qj[j + 1].a;
		  qj[j].b = qj[j + 1].b;
		}
		n--;
	  }
	  else
	  {
		  i++;
	  }
	}

	if (n != 1)
	{
		System.out.print("no");
	}
	else
	{
		System.out.printf("%d %d",qj[0].a,qj[0].b);
	}

	return 0;
	}


}

