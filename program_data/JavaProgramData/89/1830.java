package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int c;
		int d;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] b = new int[n];
		i = 0;
		do
		{
			b[i] = 0;
			i = i + 1;
		} while (i < n);
		do
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   c = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   d = Integer.parseInt(tempVar3);
		   }
		   if (c != 0 || d != 0)
		   {
			   i = 0;
			   b[d] = b[d] + 1;
			   b[c] = 0;
		   }
		} while (c != 0 || d != 0);
		i = 0;
		j = 0;
		do
		{
		   if (b[i] == (n - 1))
		   {
			   System.out.printf("%d\n",i);
			   j = 1;
			   break;
		   }
		   i = i + 1;
		} while (i < n);
		if (j == 0)
		{
			System.out.print("NOT FOUND");
		}
	}

}

