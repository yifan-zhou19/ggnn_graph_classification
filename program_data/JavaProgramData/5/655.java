package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int q;
		int w;
		int e = 0;
		int r = 1;
		int i;
		double a;
		double b;
		String A = new String(new char[1000]);
		String B = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			A = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			B = tempVar3.charAt(0);
		}
		q = A.length();
		w = B.length();
	//	printf("%d%d",q,w);
	//	puts(A);puts(B);
		if (q != w)
		{
			System.out.print("error");
			r = -1;
		}
		else
		{
			for (i = 0;A.charAt(i) != '\0';i++)
			{

				if ((A.charAt(i) != 'T' && A.charAt(i) != 'C' && A.charAt(i) != 'A' && A.charAt(i) != 'G') || (B.charAt(i) != 'T' && B.charAt(i) != 'C' && B.charAt(i) != 'A' && B.charAt(i) != 'G'))
				{
					r = -1;
					System.out.print("error");
					break;
				}
				else if (A.charAt(i) != B.charAt(i))
				{
					continue;
				}
				else if (A.charAt(i) == B.charAt(i))
				{
					e++;
				}
			}
		}
	//	printf("%d",e);
		if (r == 1)
		{
			b = (e * 1.0) / (q * 1.0);
	//	printf("%lf",b);
			if (b > a)
			{
				System.out.print("yes");
			}
			else
			{
				System.out.print("no");
			}
		}
		return 0;
	}




}

