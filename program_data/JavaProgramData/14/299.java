package <missing>;

public class GlobalMembers
{
	//??????????????????????

	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct s
	//	{
	//		   int id;
	//		   int ch;
	//		   int ma;
	//	}
	//	s;
		int n;
		int i = 0;
		int j;
		int zong;
		int c = 0;
		int[] a = new int[3];
		int[] b = new int[3];
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 3;i++)
		{
						String tempVar2 = ConsoleInput.scanfRead();
						if (tempVar2 != null)
						{
							s.id = tempVar2;
						}
						String tempVar3 = ConsoleInput.scanfRead(" ");
						if (tempVar3 != null)
						{
							s.ch = tempVar3;
						}
						String tempVar4 = ConsoleInput.scanfRead(" ");
						if (tempVar4 != null)
						{
							s.ma = tempVar4;
						}
						a[i] = i + 1;
						b[i] = s.ma + s.ch;
		}
	   for (i = 0;i < 2;i++)
	   {
					   if (b[i] > b[1 + i])
					   {
									  t = b[i];
									  b[i] = b[i + 1];
									  b[i + 1] = t;
									  t = a[i];
									  a[i] = a[i + 1];
									  a[i + 1] = t;
					   }
	   }
		for (i = 3;i < n;i++)
		{
						  String tempVar5 = ConsoleInput.scanfRead();
						  if (tempVar5 != null)
						  {
							  s.id = tempVar5;
						  }
						  String tempVar6 = ConsoleInput.scanfRead(" ");
						  if (tempVar6 != null)
						  {
							  s.ch = tempVar6;
						  }
						  String tempVar7 = ConsoleInput.scanfRead(" ");
						  if (tempVar7 != null)
						  {
							  s.ma = tempVar7;
						  }
						  zong = s.ch + s.ma;
						  for (j = 0;j < 3;j++)
						  {
										  if (zong > b[j])
										  {
											  c++;
										  }
						  }
						  if (c == 1)
						  {
								 a[0] = s.id;
								 b[0] = zong;
						  }
						  if (c == 2)
						  {
								  a[0] = a[1];
								  b[0] = b[1];
								  a[1] = s.id;
								  b[1] = zong;
						  }
						  if (c == 3)
						  {
								  a[0] = a[1];
								  a[1] = a[2];
								  a[2] = s.id;
								  b[0] = b[1];
								  b[1] = b[2];
								  b[2] = zong;

						  }
						  c = 0;
		}
		for (i = 2;i >= 0;i--)
		{
						System.out.printf("%d %d\n",a[i],b[i]);
		}
	}
}

