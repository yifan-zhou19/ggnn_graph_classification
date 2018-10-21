package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int l = 0;
		int c;
		int[] a = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
						 int j;
						 int t;
						 int f = 1;
						 int s;
						 int b;
						 b = i;
						 String e = new String(new char[40]);
						 for (j = 0;b != 0;j++)
						 {
										  e = tangible.StringFunctions.changeCharacter(e, j, b % 10);
										  b = b / 10;
						 }
						 e = tangible.StringFunctions.changeCharacter(e, j, '\0');
						 for (t = 0;t < j;t++)
						 {
										 if (e.charAt(t) != e.charAt(j - t - 1))
										 {
														   f = 0;
														   break;
										 }
						 }
						 if (f == 1)
						 {
								 s = 1;
								 int q;
								 for (q = 2;q < i;q++)
								 {
												 if (i % q == 0)
												 {
														   s = 0;
														   break;
												 }
								 }
								 if (s == 1)
								 {
										 a[l] = i;
										 l++;
								 }
						 }
		}
		if (l == 0)
		{
		System.out.print("no\n");
		}
		else
		{
		for (c = 0;c < l - 1;c++)
		{
						  System.out.printf("%d,",a[c]);
		}
		System.out.printf("%d\n",a[l - 1]);
		}
		System.in.read();
		System.in.read();
	}
}

