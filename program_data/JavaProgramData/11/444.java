package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int a;
		int b;
		int c;
		int i;
		int s1 = 0;
		int s2;
		int[] n = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		if (a % 400 == 0 || (a % 4 == 0 && a % 100 != 0))
		{
			n[1] = 29;
		}
		for (i = 1;i < b;i++)
		{
			s1 = s1 + n[i - 1];
		}
		s2 = s1 + c;
		System.out.printf("%d\n",s2);
	}
}

