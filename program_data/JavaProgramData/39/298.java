public class m
{
	public int m1;
	public int m2;
	public int is;
	public int sum;
  public String n = new String(new char[27]);
  public char w;
  public char a;

}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int s;
		int i;
		int j;
		int m;
		int f1 = S;
		int f2 = S;
		int f3 = S;
		int f4 = S;
		int f5 = S;
	  String t;
	  String a = new String(new char[26]);

	  m head;
	  m p1;
	  m p2;
	  m tp;
	  m q;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
	  head = (m)calloc(n,L);
	  for (i = 0;i < n;i++)
	  {
		  p1 = head + i;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.n = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p1.m1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			p1.m2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar5 != null)
		{
			p1.a = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar6 != null)
		{
			p1.w = tempVar6.charAt(0);
		}
		String tempVar7 = ConsoleInput.scanfRead();
		if (tempVar7 != null)
		{
			p1.is = Integer.parseInt(tempVar7);
		}
		p1.sum = f1(p1) + f2(p1) + f3(p1) + f4(p1) + f5(p1);

	  }
	  s = 0;
	  for (m = head.sum,k = 0,i = 0;i < n;i++)
	  {
		  if ((head + i).sum > m)
		  {
			  k = i;
			  m = (head + i).sum;
		  }
		  s += (head + i).sum;
	  }
	  System.out.printf("%s\n%d\n%d",(head + k).n,m,s);

	}
	public static int f1(S UnnamedParameter)
	{
		return 8000 * (s.m1 > 80 && s.is >= 1);

	}
	public static int f2(S UnnamedParameter)
	{
		return 4000 * (s.m1 > 85 && s.m2 > 80);
	}
	public static int f3(S UnnamedParameter)
	{
		return 2000 * (s.m1 > 90);
	}
	public static int f4(S UnnamedParameter)
	{
		return 1000 * (s.w == 'Y' && s.m1 > 85);
	}
	public static int f5(S UnnamedParameter)
	{
		return 850 * (s.a == 'Y' && s.m2 > 80);
	}

}

