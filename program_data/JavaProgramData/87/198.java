package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[] s = new int[100];
		int m;
		int n;
		int r;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		   int a,b,c,d,e,f;
	//		   }
	//		   p[100];
		for (i = 1;i < 100;i++)
		{
					  String tempVar = ConsoleInput.scanfRead();
					  if (tempVar != null)
					  {
						  p[i].a = tempVar;
					  }
					  String tempVar2 = ConsoleInput.scanfRead();
					  if (tempVar2 != null)
					  {
						  p[i].b = tempVar2;
					  }
					  String tempVar3 = ConsoleInput.scanfRead();
					  if (tempVar3 != null)
					  {
						  p[i].c = tempVar3;
					  }
					  String tempVar4 = ConsoleInput.scanfRead();
					  if (tempVar4 != null)
					  {
						  p[i].d = tempVar4;
					  }
					  String tempVar5 = ConsoleInput.scanfRead();
					  if (tempVar5 != null)
					  {
						  p[i].e = tempVar5;
					  }
					  String tempVar6 = ConsoleInput.scanfRead();
					  if (tempVar6 != null)
					  {
						  p[i].f = tempVar6;
					  }
					  if (p[i].a == 0 && p[i].b == 0 && p[i].c == 0 && p[i].d == 0 && p[i].e == 0 && p[i].f == 0)
					  {
						 break;
					  }
		}
		for (j = 1;j <= i;j++)
		{
						  if (p[j].a >= 0 && p[j].a <= 11 && p[j].d >= 0 && p[j].d <= 11 && p[j].c >= 0 && p[j].c <= 59 && p[j].b >= 0 && p[j].b <= 59 && p[j].e >= 0 && p[j].e <= 59 && p[j].f >= 0 && p[j].f <= 59)
						  {
						  p[j].d = 12 + p[j].d;
						  m = (p[j].d - p[j].a) * 3600;
						  s[j] = m;
						  if (p[j].e >= p[j].b)
						  {
							  n = (p[j].e - p[j].b) * 60;
							  s[j] = s[j] + n;
						  }
						  if (p[j].e < p[j].b)
						  {
							  n = (p[j].b - p[j].e) * 60;
							  s[j] = s[j] - n;
						  }
						  if (p[j].f >= p[j].c)
						  {
							  r = p[j].f - p[j].c;
							  s[j] = s[j] + r;
						  }
						  if (p[j].f < p[j].c)
						  {
							  r = p[j].c - p[j].f;
							  s[j] = s[j] - r;
						  }
						  }
						  if (p[j].a == 0 && p[j].b == 0 && p[j].c == 0 && p[j].d == 0 && p[j].e == 0 && p[j].f == 0)
						  {
							break;
						  }
		}
		for (j = 1;j < i - 1;j++)
		{
						  System.out.printf("%d\n",s[j]);
		}
		System.out.printf("%d",s[i - 1]);
	return 0;
	}
}

