package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int s1;
		int f1;
		int m1;
		int s2;
		int f2;
		int m2;
		int z;
		int n;
		int a;
		int b;
		int i;
		int s;
		int f;
		int m;
		int j;

		for (i = 0;i < 100000;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			f1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			s2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			f2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			m2 = Integer.parseInt(tempVar6);
		}
		 if ((s1 == 0) && (f1 == 0) && (m1 == 0) && (s2 == 0) && (f2 == 0) && (m2 == 0))
		 {
			 break;
		 }
		 else
		 {
			 if (m2 > m1)
			 {
				 m = m2 - m1;
				 if (f2 > f1)
				 {
					 f = f2 - f1;
				 }
				 else
				 {
					 f = f2 + 60 - f1;
					 s2 = s2 - 1;
				 }
			 }
			 else
			 {

				 m = m2 + 60 - m1;
				 f2 = f2 - 1;
				  if (f2 > f1)
				  {
					 f = f2 - f1;
				  }
				  else
				  {
					 f = f2 + 60 - f1;
					 s2 = s2 - 1;
				  }

			 }
			 s = s2 + 12 - s1;
		 z = m + f * 60 + s * 3600;
		 System.out.printf("%d\n",z);

		 }
		 continue;
		}


	return 0;
	}


}

