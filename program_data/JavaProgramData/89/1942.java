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
		int[] a = new int[n];
		int[] b = new int[n];
		i = 0;
		do
		{
			a[i] = i;
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
			   do
			   {
				   if (d == a[i])
				   {
					   b[i] = b[i] + 1;
					   break;
				   }
				   i = i + 1;
			   } while (i < n);
			   i = 0;
			   do
			   {
				   if (c == a[i])
				   {
					   b[i] = 0;
					   break;
				   }
				   i = i + 1;
			   } while (i < n);
		   }
		} while (c != 0 || d != 0);
		i = 0;
		j = 0;
		do
		{
		   if (b[i] == (n - 1))
		   {
			   System.out.printf("%d\n",a[i]);
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

