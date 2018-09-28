package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{

		char[][] name = new char[100][100];
		String s = new String(new char[2]);
		String w = new String(new char[2]);
		int a;
		int b;
		int c;
		int n;
		int[] sum = new int[100];
		int sum1 = 0;
		int i;
		int f = -1;
		int g = 0;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++)
		{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  name[i] = tempVar2.charAt(0);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  a = Integer.parseInt(tempVar3);
		  }
		  String tempVar4 = ConsoleInput.scanfRead();
		  if (tempVar4 != null)
		  {
			  b = Integer.parseInt(tempVar4);
		  }
		  String tempVar5 = ConsoleInput.scanfRead();
		  if (tempVar5 != null)
		  {
			  s = tempVar5.charAt(0);
		  }
		  String tempVar6 = ConsoleInput.scanfRead();
		  if (tempVar6 != null)
		  {
			  w = tempVar6.charAt(0);
		  }
		  String tempVar7 = ConsoleInput.scanfRead();
		  if (tempVar7 != null)
		  {
			  c = Integer.parseInt(tempVar7);
		  }


			 sum[i] = 0;
			if (a > 80 && c != 0)
			{
				sum[i] += 8000;
				sum1 += 8000;
			}
			if (a > 85 && b > 80)
			{
				sum[i] += 4000;
				sum1 += 4000;
			}
			if (a > 90)
			{
				sum[i] += 2000;
				sum1 += 2000;
			}
			if (a > 85 && w.charAt(0) == 'Y')
			{
				sum[i] += 1000;
				sum1 += 1000;
			}
			if (b > 80 && s.charAt(0) == 'Y')
			{
				sum[i] += 850;
				sum1 += 850;
			}

		}
		for (j = 0;j < n;j++)
		{
			if (sum[j] > f)
			{
				f = sum[j];
				g = j;
			}

		}
		System.out.printf("%s\n", name[g]);
		System.out.printf("%d\n", f);
		System.out.printf("%d\n", sum1);
	}
}

