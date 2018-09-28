package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	   int n;
	   int[] bei1 = new int[100];
	   int[] jian1 = new int[100];
	   int[] cha = new int[100];
	   int j;
	   int a;
	   int b;
	   int i;
	   String bei = new String(new char[100]);
	   String jian = new String(new char[100]);
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
		for (j = 1;j <= n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				bei = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				jian = tempVar3.charAt(0);
			}
			a = bei.length();
			b = jian.length();
			for (i = 0;i < a;i++)
			{
				bei1[i] = bei.charAt(i) - '0';
			}
			for (i = 0;i < b;i++)
			{
				jian1[i] = jian.charAt(i) - '0';
			}
			for (i = b - 1;i >= 0;i--)
			{
				jian1[a - b + i] = jian1[i];
			}
			for (i = 0;i < (a - b);i++)
			{
				jian1[i] = 0;
			}
			for (i = a - 1;i >= 0;i--)
			{
				if (bei1[i] >= jian1[i])
				{
					cha[i] = bei1[i] - jian1[i];
				}
				if (bei1[i] < jian1[i])
				{
					cha[i] = bei1[i] + 10 - jian1[i];
					bei1[i - 1] = bei1[i - 1] - 1;
				}
			}
			if (cha[0] == 0)
			{
				for (i = 1;i < a;i++)
				{
				System.out.printf("%d",cha[i]);
				}
				System.out.print("\n");
			}
			else
			{
			for (i = 0;i < a;i++)
			{
				System.out.printf("%d",cha[i]);
			}
			}
			System.out.print("\n");

		}

	}

}

