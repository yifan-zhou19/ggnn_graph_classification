package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] a = new int[105];
		int[] b = new int[105];
		int[] c = new int[105];
		int l1;
		int l2;
		int l;
		int cha;
		String s1 = new String(new char[105]);
		String s2 = new String(new char[105]);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 1;k <= n;k++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   s1 = tempVar2.charAt(0);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   s2 = tempVar3.charAt(0);
		   }
		   l1 = s1.length();
		   l2 = s2.length();

		   for (i = 0;i <= l1 - 1;i++)
		   {
			  a[i] = s1.charAt(l1 - i - 1) - '0';
		   }
		   for (j = 0;j <= l2 - 1;j++)
		   {
			  b[j] = s2.charAt(l2 - j - 1) - '0';
		   }
		   for (i = 0;i <= l1 - 1;i++)
		   {
			 c[i] = a[i] - b[i];
			 if (c[i] < 0)
			 {
			   c[i] += 10;
			   a[i + 1] -= 1;
			 }
		   }
		   while (c[l1] == 0 && l1 > 0)
		   {
			 l1--;
		   }
		   for (i = l1;i >= 0;i--)
		   {
			 System.out.printf("%d",c[i]);

		   }
		   System.out.print("\n");
		   for (i = 0;i <= 104;i++)
		   {
		   a[i] = 0;
		   b[i] = 0;
		   c[i] = 0;
		   }
		}

		return 0;
	}

}

