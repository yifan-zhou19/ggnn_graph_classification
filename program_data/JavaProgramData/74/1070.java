package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int F = int x;
		int G = int x;
		int m;
		int n;
		int i;
		int a = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			if (F(i) != 0 && G(i) != 0)
			{
				System.out.printf("%d",i);
				a++;
				break;
			}
		}
		for (i = i + 1;i <= n;i++)
		{
			if (F(i) != 0 && G(i) != 0)
			{
				System.out.printf(",%d",i);
				a++;
			}
		}
		if (a == 0)
		{
			System.out.print("no");
		}
	}


	 public static int F(int x)
	 {
	 int z;
	 int t = 0;
	 z = x;
	 do
	 {
		 t = t * 10 + z % 10;
		 z = z / 10;
	 } while (z != 0);
	 if (t == x)
	 {
		 return (1);
	 }
	 else
	 {
		 return (0);
	 }
	 }

	 public static int G(int x)
	 {
		 int i;
		 int b = 1;
	 for (i = 2;i <= Math.sqrt(x);i++)
	 {
	 if (x % i == 0)
	 {
		 b = 0;
		 break;
	 }
	 }
	return (b);
	 }
}

