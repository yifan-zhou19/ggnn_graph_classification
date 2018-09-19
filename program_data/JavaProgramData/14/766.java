package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int[] num = new int[99999];
		int[] math = new int[99999];
		int[] china = new int[99999];
		int[] z = new int[99999];
		int i;
		int num1 = 2;
		int num2 = 1;
		int num3 = 0;
		int m1 = 0;
		int m2 = 0;
		int m3 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				math[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				china[i] = Integer.parseInt(tempVar4);
			}
			z[i] = math[i] + china[i];
			if (z[i] > num3)
			{
				num1 = num2;
				m1 = m2;
				num2 = num3;
				m2 = m3;
				num3 = z[i];
				m3 = i;

			}
			else if (z[i] > num2)
			{
				num1 = num2;
				m1 = m2;
				num2 = z[i];
				m2 = i;
			}
			else if (z[i] > num1)
			{
				num1 = z[i];
				m1 = i;
			}
		}
		System.out.printf("%ld %ld\n",m3,num3);
		System.out.printf("%ld %ld\n",m2,num2);
		System.out.printf("%ld %ld\n",m1,num1);
	}
}

