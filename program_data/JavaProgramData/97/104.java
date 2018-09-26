package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k1;
		int k2;
		int t1;
		int t2;
		int s1;
		int s2;
		int p1;
		int p2;
		int q1;
		int q2;
		int w1;
		int w2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		k1 = n / 100;
		k2 = n % 100;
		t1 = k2 / 50;
		t2 = k2 % 50;
		s1 = t2 / 20;
		s2 = t2 % 20;
		p1 = s2 / 10;
		p2 = s2 % 10;
		q1 = p2 / 5;
		q2 = p2 % 5;
		w1 = q2 / 1;
		w2 = q2 % 1;
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d",k1,t1,s1,p1,q1,w1);
		return 0;
	}

}

