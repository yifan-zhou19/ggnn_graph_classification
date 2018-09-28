package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int f = new int(int a,int b);
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		System.out.printf("%ld",f(n, k));

	}

	public static int f(int a,int b)
	{
		int z;
		int i;
		int chu = 1;
		int ok;
		do
		{
			ok = 1;
			z = chu * a + b;

			for (i = 1;i < a;i++)
			{
			   if (z % (a - 1) != 0)
			   {
				   ok = 0;
				   break;
			   }
			   z = a * z / (a - 1) + b;
			}

			chu++;
		}while (ok == 0);

		return z;
	}
}

