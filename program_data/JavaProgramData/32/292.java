package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		int[] c = new int[101];
		int[] e = new int[101];
		int[] d;
		int n;
		int i;
		int j;
		int l1;
		int l2;
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
			   a = tempVar2.charAt(0);
		   }
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   b = tempVar3.charAt(0);
		   }
		   l1 = a.length();
		   l2 = b.length();

		   d = new int[(l1 + l2)];
		   for (i = l1 - 1;i >= 0;i--)
		   {
			   c[i] = a.charAt(i) - 48;
		   }
			for (i = l1 - 1;i >= 0;i--)
			{
			   d[i] = b.charAt(i) - 48;
			   if (i >= l2)
			   {
				   d[i] = 0;
			   }
			}
			for (i = 0;i < l2;i++)
			{
				d[i + l1] = d[i];
			}
			for (i = l1 - 1;i >= 0;i--)
			{
				e[i] = c[i] - d[i + l2];
				if (e[i] < 0)
				{
					e[i] = e[i] + 10;
					c[i - 1] = c[i - 1] - 1;
				}
			}
			if (e[0] != 0)
			{
				System.out.printf("%d",e[0]);
			}
			for (i = 1;i <= l1 - 2;i++)
			{
				System.out.printf("%d",e[i]);
			}
			System.out.printf("%d\n",e[l1 - 1]);




		}
	}











}

