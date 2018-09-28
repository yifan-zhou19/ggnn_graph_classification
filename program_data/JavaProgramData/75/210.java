package <missing>;

public class GlobalMembers
{
	   public static int[] a = new int[1000];
	   public static int[] b = new int[1000];
	   public static int[] e = new int[1000];
	   public static int i = 0;
	   public static int n;
	   public static int j;
	   public static int k;
	   public static int l;
	public static int Main()
	{

		char c;
		do
		{
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 a[i] = Integer.parseInt(tempVar);
			 }
			 String tempVar2 = ConsoleInput.scanfRead(null, 1);
			 if (tempVar2 != null)
			 {
				 c = tempVar2.charAt(0);
			 }
			 i++;
		} while (c != '\n');
		i = 0;
		do
		{
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 b[i] = Integer.parseInt(tempVar3);
			 }
			 String tempVar4 = ConsoleInput.scanfRead(null, 1);
			 if (tempVar4 != null)
			 {
				 c = tempVar4.charAt(0);
			 }
			 i++;
		} while (c != '\n');
		n = i;
		for (j = 0;j < 1000;j++)
		{
						   for (i = 0;i < n;i++)
						   {
										   if (j >= a[i] != 0 && j < b[i])
										   {
										   e[j]++;
										   }
						   }
		}
		for (j = 0,k = 0;j < 1000;j++)
		{
						   if (k < e[j])
						   {
						   k = e[j];
						   }
		}
		System.out.printf("%d %d",n,k);
		return 0;
	}

}

