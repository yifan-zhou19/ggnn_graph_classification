public class stu
{
	public int id;
	public int c;
	public int m;
	public int t;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int K;
		stu[] a = {0, null, null, null};
		stu[] b = {0, null, null, null};
		stu temp = new stu();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= (n - 1);i++)
		{
			if (i <= 2)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i].id = Integer.parseInt(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i].c = Integer.parseInt(tempVar3);
				}
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					a[i].m = Integer.parseInt(tempVar4);
				}
			a[i].t = a[i].c + a[i].m;
			b[i] = a[i];
			}
			else
			{
				String tempVar5 = ConsoleInput.scanfRead();
				if (tempVar5 != null)
				{
					a[3].id = Integer.parseInt(tempVar5);
				}
				String tempVar6 = ConsoleInput.scanfRead();
				if (tempVar6 != null)
				{
					a[3].c = Integer.parseInt(tempVar6);
				}
				String tempVar7 = ConsoleInput.scanfRead();
				if (tempVar7 != null)
				{
					a[3].m = Integer.parseInt(tempVar7);
				}
				 a[3].t = a[3].c + a[3].m;
				 b[3] = a[3];
				 //a[3]="\0";
				 for (K = 0;K <= 3;K++)
				 {
				   for (j = 0;j <= 3;j++)
				   {
					  if (b[j].t < b[j + 1].t)
					  {
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=b[j];
						temp.copyFrom(b[j]);
					   b[j] = b[j + 1];
						b[j + 1] = temp;
					  }
				   }
				 }
			}
		}

		for (i = 0;i <= 2;i++)
		{
			System.out.printf("%d %d\n",b[i].id,b[i].t);
		}

	}
}

