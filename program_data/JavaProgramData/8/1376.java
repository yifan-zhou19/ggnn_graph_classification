package <missing>;

public class GlobalMembers
{
	public static int n1;
	public static int n2;
	public static int[] p1;
	public static int[] p2;
	public static int[] p3;
	public static int Main()
	{
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n1 = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead(" ");
		 if (tempVar2 != null)
		 {
			 n2 = Integer.parseInt(tempVar2);
		 }
		 p1 = new int[n1];
		 p2 = new int[n2];
		 for (int k = 0;k < n1;k++)
		 {
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 p1[k] = Integer.parseInt(tempVar3);
		 }
		 }
		 for (int k = 0;k < n2;k++)
		 {
		 String tempVar4 = ConsoleInput.scanfRead();
		 if (tempVar4 != null)
		 {
			 p2[k] = Integer.parseInt(tempVar4);
		 }
		 }
		 for (int k = n1 - 1;k > 0;k--)
		 {
				for (int i = 0;i < k;i++)
				{
						if (p1[i] > p1[i + 1])
						{
									   int t;
									   t = p1[i];
									   p1[i] = p1[i + 1];
									   p1[i + 1] = t;
						}
				}
		 }

		for (int k = n2 - 1;k > 0;k--)
		{
				for (int i = 0;i < k;i++)
				{
						if (p2[i] > p2[i + 1])
						{
									   int t;
									   t = p2[i];
									   p2[i] = p2[i + 1];
									   p2[i + 1] = t;
						}
				}
		}
		p3 = new int[(n1 + n2)];
		for (int k = 0;k < n1;k++)
		{
		p3[k] = p1[k];
		}
		for (int i = n1;i < n1 + n2;i++)
		{
		p3[i] = p2[i - n1];
		}
		int c;
		 for (c = 0;c < n1 + n2;c++)
		 {
							   if (c == 0)
							   {
							   System.out.printf("%d",p3[0]);
							   }
							   else
							   {
								   System.out.printf(" %d",p3[c]);
							   }
		 }

	}

}

