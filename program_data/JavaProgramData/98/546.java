package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] c = new char[500][100];
		int[] d = new int[500];
		int i = 0;
		int a;
		int sum;
		int num;
		int w;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		do
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c[i] = tempVar2.charAt(0);
			}
			i++;
		}while (i < a);
		i = 0;
		do
		{
			d[i] = String.valueOf(c[i]).length();
			i++;
		} while (i < a);
		i = 0;
		System.out.printf("%s",c[0]);
		do
		{
			sum = 0;
			num = 0;
			if (w == 1)
			{
				System.out.printf("%s",c[i]);
			sum += d[i];
			i++;
			num++;
			}
			w = 0;
			do
			{
			if (i == 0)
			{
				sum += d[i];
				i++;
				num++;
			}
			sum += d[i];
			System.out.printf(" %s",c[i]);
			i++;
			if (i == a)
			{
				break;
			}
			num++;
			}while (sum + d[i] + num <= 80);
			System.out.print("\n");
			w++;
		}while (i < a);
		return 0;
	}


}

