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
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct dot
	//{
	//	int x,y,z;
	//	double len[9];
	//}
	//dots[10];
	for (int i1 = 0;i1 < n;i1++)
	{
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  dots[i1].x = tempVar2;
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  dots[i1].y = tempVar3;
	  }
	  String tempVar4 = ConsoleInput.scanfRead();
	  if (tempVar4 != null)
	  {
		  dots[i1].z = tempVar4;
	  }

	}
	for (int i2 = 0;i2 < n - 1;i2++)
	{
	  for (int i3 = n - i2 - 2;i3 >= 0;i3--)
	  {
		  dots[i2].len[n - i2 - 2 - i3] = (dots[i2].x - dots[n - i3 - 1].x) * (dots[i2].x - dots[n - i3 - 1].x) + (dots[i2].y - dots[n - i3 - 1].y) * (dots[i2].y - dots[n - i3 - 1].y) + (dots[i2].z - dots[n - i3 - 1].z) * (dots[i2].z - dots[n - i3 - 1].z);
		  dots[i2].len[n - i2 - 2 - i3] = Math.sqrt(dots[i2].len[n - i2 - 2 - i3]);
	  }
	}

	for (int j = 0;j < n * (n - 1) / 2;j++)
	{
		int maxq = 0;
		int maxh = 0;
	double lmax = 0.0;
	for (int i4 = 0;i4 < n - 1;i4++)
	{
		for (int i5 = 0;i5 <= n - 2 - i4;i5++)
		{
			if (dots[i4].len[i5] > lmax)
			{
				lmax = dots[i4].len[i5];
				maxq = i4;
				maxh = i4 + i5 + 1;
			}
		}

	}
	System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",dots[maxq].x,dots[maxq].y,dots[maxq].z,dots[maxh].x,dots[maxh].y,dots[maxh].z,dots[maxq].len[maxh - 1 - maxq]);
	dots[maxq].len[maxh - 1 - maxq] = 0;
	}
		return 0;
	}

}

